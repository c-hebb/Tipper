package TipApp;

//To Do List:
//Make Pretty
//Bottom Menu Fix SPACING and Size
//Other Panels

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.*;
import java.text.*;

public class Tip extends JFrame {
  
   //Swing Variables
   private JTextField billTotal;
   private JButton buttonSubmit;
   private JLabel tipAmount;
   
   //Other Defines
   private double rating;
   private String results = "0.00";
   
   //Decimal Rounding
   private DecimalFormat df2 = new DecimalFormat(".##");
   
   //Rating Stars
   private JButton star1, star2, star3, star4, star5;
   private int star1c, star2c, star3c, star4c, star5c = 0;
    
   public Tip() {
       createView();
       
       setTitle("Tip App");
       //Close on Exit
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       //Set Size
       setSize(400, 700);
       //Center Frame
       setLocationRelativeTo(null);
       //Disable Resize
       setResizable(false);
       //Idk
       setDefaultLookAndFeelDecorated(true);
   }
    
   //UI Initializer
   private void createView() {
       Color myGreen = new Color(0, 231, 51);
       
       JPanel cards = new JPanel(new CardLayout());
       
       JPanel tipPanel = new JPanel();
       JPanel panel = new JPanel();
       JPanel settingsPanel = new JPanel();
       
       cards.add(panel, "Main");
       cards.add(tipPanel, "Tips");
       cards.add(settingsPanel, "Settings");
       getContentPane().add(cards);
       CardLayout cardLayout = (CardLayout) cards.getLayout();
       
       
       // ********MAIN PANEL************
       
       //Sets Padding/Margin Around Panel
       panel.setBorder(new EmptyBorder(10, 10, 10, 10));
       panel.setLayout(new BorderLayout());
       panel.setBackground(Color.white);
       
       
       //North
       JPanel panelNorth = new JPanel();
       panelNorth.setBackground(Color.green);
       panel.add(panelNorth, BorderLayout.NORTH);
       JLabel title = new JLabel("Tip App");
       title.setPreferredSize(new Dimension(225, 150));
       title.setForeground(Color.white);
       title.setFont(new Font("Helvetica BOLD", 1, 60));
       panelNorth.add(title);
       //
       
       //Center
       
       //Center Panel
       JPanel panelCenter = new JPanel(new BorderLayout());
       panelCenter.setBackground(Color.green);
       panel.add(panelCenter, BorderLayout.CENTER);
       
       //North of Center Panel
       JPanel centerNorth = new JPanel();
       centerNorth.setBackground(Color.green);
       
       //Box Layout Setup
       BoxLayout boxlayoutY = new BoxLayout(centerNorth, BoxLayout.Y_AXIS);
       centerNorth.setLayout(boxlayoutY);
       centerNorth.setBorder(new EmptyBorder(new Insets(20, 10, 20, 10)));
       panelCenter.add(centerNorth, BorderLayout.NORTH);
      
       
       //Panels and Box Layouts
       JPanel firstPanel = new JPanel();
       JPanel secondPanel = new JPanel();
       JPanel thirdPanel = new JPanel();
       JPanel fourthPanel = new JPanel();
       JPanel fifthPanel = new JPanel();
       BoxLayout boxlayoutX1 = new BoxLayout(firstPanel, BoxLayout.X_AXIS);
       BoxLayout boxlayoutX2 = new BoxLayout(secondPanel, BoxLayout.X_AXIS);
       BoxLayout boxlayoutX3 = new BoxLayout(thirdPanel, BoxLayout.X_AXIS);
       BoxLayout boxlayoutX4 = new BoxLayout(fourthPanel, BoxLayout.X_AXIS);
       BoxLayout boxlayoutX5 = new BoxLayout(fifthPanel, BoxLayout.X_AXIS);
       firstPanel.setBackground(Color.green);
       secondPanel.setBackground(Color.green);
       thirdPanel.setBackground(Color.green);
       fourthPanel.setBackground(Color.green);
       fifthPanel.setBackground(Color.green);
       
       //Bill Label & User Input (FIRST PANEL)
       JLabel billAmount = new JLabel("Bill $$: ");
       billAmount.setForeground(Color.black);
       billAmount.setFont(new Font("Helvetica BOLD", 1, 30));
       firstPanel.add(billAmount);
       
       billTotal = new JTextField(4);
       billTotal.setFont(new Font("Helvetica", 1, 28));
       firstPanel.add(billTotal);
       centerNorth.add(firstPanel);
       
       //Spacer
       centerNorth.add(Box.createRigidArea(new Dimension(0, 30)));
       
       //Rate Your Service Label (SECOND PANEL)
       JLabel ratingText = new JLabel("Rate Your Service!");
       //ratingText.setForeground(Color.white);
       ratingText.setFont(new Font("Helvetica", 1, 20));
       secondPanel.add(ratingText);
       centerNorth.add(secondPanel);
       
       //Spacer2
       centerNorth.add(Box.createRigidArea(new Dimension(0, 10)));
       
       //Rating Buttons (THIRD PANEL)
       //Star1
       star1 = new JButton();
       star1.setIcon(new ImageIcon("res/starW.png"));
       star1.setOpaque(false);
       star1.setContentAreaFilled(false);
       star1.setBorderPainted(false);
       star1.setBorder(null);
       star1.addActionListener(new ActionListener() {
           
           @Override
           public void actionPerformed(ActionEvent e) {
                if(star1c == 1) {
                    star1.setIcon(new ImageIcon("res/starW.png"));
                    star1c = 0;
                    rating = 0;
                }
               if(star1c == 0) {
                   star1.setIcon(new ImageIcon("res/starY.png"));
                   star1c = 1;
                   rating = 1;
               }
               if(star1c == 1 && star2c == 1) {
                star2.setIcon(new ImageIcon("res/starW.png"));
                star2c = 0;
                star3.setIcon(new ImageIcon("res/starW.png"));
                star3c = 0;
                star4.setIcon(new ImageIcon("res/starW.png"));
                star4c = 0;
                star5.setIcon(new ImageIcon("res/starW.png"));
                star5c = 0;
                }
            }
             
        });
       thirdPanel.add(star1);
       
       //Star2
       star2 = new JButton();
       star2.setIcon(new ImageIcon("res/starW.png"));
       star2.setOpaque(false);
       star2.setContentAreaFilled(false);
       star2.setBorderPainted(false);
       star2.setBorder(null);
       star2.addActionListener(new ActionListener() {
           
           @Override
           public void actionPerformed(ActionEvent e) {
                               if(star2c == 1 && star1c == 1) {
                    star2.setIcon(new ImageIcon("res/starW.png"));
                    star2c = 0;
                    rating = 1;
                }
               if(star2c == 0) {
                   star2.setIcon(new ImageIcon("res/starY.png"));
                   star2c = 1;
                   rating = 2;
                }
                if(star1c == 0) {
                    star1.setIcon(new ImageIcon("res/starY.png"));
                    star1c = 1;
                }
                if(star2c == 1 && star3c == 1) {
                    star3.setIcon(new ImageIcon("res/starW.png"));
                    star3c = 0;
                    star4.setIcon(new ImageIcon("res/starW.png"));
                    star4c = 0;
                    star5.setIcon(new ImageIcon("res/starW.png"));
                    star5c = 0;
                }

            }
             
        });
       thirdPanel.add(star2);
       
       //Star3
       star3 = new JButton();
       star3.setIcon(new ImageIcon("res/starW.png"));
       star3.setOpaque(false);
       star3.setContentAreaFilled(false);
       star3.setBorderPainted(false);
       star3.setBorder(null);
       star3.addActionListener(new ActionListener() {
           
           @Override
           public void actionPerformed(ActionEvent e) {
                if(star3c == 1 && star2c == 1) {
                    star3.setIcon(new ImageIcon("res/starW.png"));
                    star3c = 0;
                    rating = 2;
                }
               if(star3c == 0) {
                   star3.setIcon(new ImageIcon("res/starY.png"));
                   star3c = 1;
                   rating = 3;
                }
                if(star2c == 0) {
                    star1.setIcon(new ImageIcon("res/starY.png"));
                    star1c = 1;
                    star2.setIcon(new ImageIcon("res/starY.png"));
                    star2c = 1;
                }
                if(star3c == 1 && star4c == 1) {
                    star4.setIcon(new ImageIcon("res/starW.png"));
                    star4c = 0;
                    star5.setIcon(new ImageIcon("res/starW.png"));
                    star5c = 0;
                }
            }
             
        });
       thirdPanel.add(star3);
       
       //Star4
       star4 = new JButton();
       star4.setIcon(new ImageIcon("res/starW.png"));
       star4.setOpaque(false);
       star4.setContentAreaFilled(false);
       star4.setBorderPainted(false);
       star4.setBorder(null);
       star4.addActionListener(new ActionListener() {
           
           @Override
           public void actionPerformed(ActionEvent e) {
               
                  if(star4c == 1 && star3c == 1) {
                    star4.setIcon(new ImageIcon("res/starW.png"));
                    star4c = 0;
                    rating = 3;
                        //   if(star4c == 0 && star5c == 1) {
                                 star5.setIcon(new ImageIcon("res/starW.png"));
                                 star5c = 0;
                         //  }
                         
                }
               if(star4c == 0) {
                   star4.setIcon(new ImageIcon("res/starY.png"));
                   star4c = 1;
                   rating = 4;
                }
                if(star3c == 0) {
                    star1.setIcon(new ImageIcon("res/starY.png"));
                    star1c = 1;
                    star2.setIcon(new ImageIcon("res/starY.png"));
                    star2c = 1;
                    star3.setIcon(new ImageIcon("res/starY.png"));
                    star3c = 1;
                }
            }
             
        });
       thirdPanel.add(star4);
       
       //Star5
       star5 = new JButton();
       star5.setIcon(new ImageIcon("res/starW.png"));
       star5.setOpaque(false);
       star5.setContentAreaFilled(false);
       star5.setBorderPainted(false);
       star5.setBorder(null);
       star5.addActionListener(new ActionListener() {
           
           @Override
           public void actionPerformed(ActionEvent e) {
              
               if(star5c == 0) {
                   star5.setIcon(new ImageIcon("res/starY.png"));
                   star5c = 1;
                   rating = 5;
                }
                else if(star5c == 1 && star4c == 1) {
                    star5.setIcon(new ImageIcon("res/starW.png"));
                    star5c = 0;
                    rating = 4;
                }
                if(star4c == 0) {
                    star1.setIcon(new ImageIcon("res/starY.png"));
                    star1c = 1;
                    star2.setIcon(new ImageIcon("res/starY.png"));
                    star2c = 1;
                    star3.setIcon(new ImageIcon("res/starY.png"));
                    star3c = 1;
                    star4.setIcon(new ImageIcon("res/starY.png"));
                    star4c = 1;
                }
            }
             
        });
       thirdPanel.add(star5);
       centerNorth.add(thirdPanel);
       
       //Spacer3
       centerNorth.add(Box.createRigidArea(new Dimension(0, 60)));
       
       //Submit Button (FOURTH PANEL)
       buttonSubmit = new JButton("Calculate");
       buttonSubmit.addActionListener(new ActionListener() {
           
           @Override
           public void actionPerformed(ActionEvent e) {
               double doubleRating = (double) rating;
               String nada = "";
               if(billTotal.getText().equals(nada)){
                   tipAmount.setFont(new Font("Helvetica", 1, 20));
                   tipAmount.setText("PLEASE ENTER A BILL TOTAL!");
                }else {
               double doubleTotal = Double.parseDouble(billTotal.getText());
               
               results = String.valueOf( df2.format( (doubleTotal * 0.92) * (doubleRating * 0.05) ) );
               tipAmount.setText("TIP: $" + results + "!");
            }
            }
           
        });
       fourthPanel.add(buttonSubmit);
       centerNorth.add(fourthPanel);
       
       //Spacer4
       centerNorth.add(Box.createRigidArea(new Dimension(0, 20)));
       
       //Tip Panel (FIFTH PANEL)
       tipAmount = new JLabel("TIP: $" + results);
       //tipAmount.setForeground(Color.white);
       tipAmount.setFont(new Font("Helvetica", 1, 40));
       fifthPanel.add(tipAmount);
       centerNorth.add(fifthPanel);
      
       //CENTER END
       
       //South
       JPanel panelSouth = new JPanel();
       BoxLayout test = new BoxLayout(panelSouth, BoxLayout.X_AXIS);
       panelSouth.setLayout(test);
       panelSouth.setBackground(Color.green);
       JButton home = new JButton("Home");
       JButton tips = new JButton("Tips");
       JButton settings = new JButton("Settings");
       home.setAlignmentX(Component.LEFT_ALIGNMENT);
       home.addActionListener(new ActionListener() {
           
           @Override
           public void actionPerformed(ActionEvent e) {
               cardLayout.show(cards, "Main");
            }
           
        });
       tips.setAlignmentX(Component.CENTER_ALIGNMENT);
       tips.addActionListener(new ActionListener() {
           
           @Override
           public void actionPerformed(ActionEvent e) {
               cardLayout.show(cards, "Tips");
            }
           
        });
       settings.setAlignmentX(Component.RIGHT_ALIGNMENT);
       settings.addActionListener(new ActionListener() {
           
           @Override
           public void actionPerformed(ActionEvent e) {
               cardLayout.show(cards, "Settings");
            }
           
        });
       home.setPreferredSize(new Dimension(125, 50));
       tips.setPreferredSize(new Dimension(125, 50));
       settings.setPreferredSize(new Dimension(125, 50));
       panelSouth.add(home);
       panelSouth.add(tips);
       panelSouth.add(settings);
       panel.add(panelSouth, BorderLayout.SOUTH);
       
       
       
       // **********TIPS PANEL*********
       
      Date date = new Date();
      SimpleDateFormat ft = new SimpleDateFormat("MM.dd.YY");
      String[] columnNames = {"DATE", "Bill $$", "Tip", "Rating"};
      Object[][] data = {{"3/7/2019", "$100", "$15", "3"}};
      JTable table = new JTable(data, columnNames);
      JScrollPane scrollPane = new JScrollPane(table);
      table.setFillsViewportHeight(true);
       
       
       //Sets Padding/Margin Around Panel
       tipPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
       tipPanel.setLayout(new BorderLayout());
       tipPanel.setBackground(Color.white);
       
       //North
       JPanel panelNorth2 = new JPanel();
       panelNorth2.setBackground(Color.green);
       tipPanel.add(panelNorth2, BorderLayout.NORTH);
       JLabel title2 = new JLabel("Tip History");
       title2.setPreferredSize(new Dimension(270, 150));
       title2.setForeground(Color.white);
       title2.setFont(new Font("Helvetica BOLD", 1, 50));
       panelNorth2.add(title2);
       //
       
       //Center
       
       //Center Panel
       JPanel panelCenter2 = new JPanel(new BorderLayout());
       panelCenter2.setBackground(Color.blue);
       tipPanel.add(panelCenter2, BorderLayout.CENTER);
       
       //North of Center Panel
       JPanel centerNorth2 = new JPanel();
       centerNorth2.setBackground(Color.red);
       centerNorth2.setPreferredSize(new Dimension(300, 300));
       
       //Box Layout Setup
       BoxLayout boxlayoutY2 = new BoxLayout(centerNorth2, BoxLayout.Y_AXIS);
       centerNorth2.setLayout(boxlayoutY2);
       centerNorth2.setBorder(new EmptyBorder(new Insets(50, 10, 50, 10)));
       panelCenter2.add(centerNorth2, BorderLayout.NORTH);
       centerNorth2.add(table.getTableHeader());
       centerNorth2.add(table);
       
       
       
       
      //CENTER END
       
       //South
       JPanel panelSouth2 = new JPanel();
       BoxLayout test2 = new BoxLayout(panelSouth2, BoxLayout.X_AXIS);
       panelSouth2.setLayout(test2);
       panelSouth2.setBackground(Color.green);
       JButton home2 = new JButton("Home");
       JButton tips2 = new JButton("Tips");
       JButton settings2 = new JButton("Settings");
       home2.setAlignmentX(Component.LEFT_ALIGNMENT);
       home2.addActionListener(new ActionListener() {
           
           @Override
           public void actionPerformed(ActionEvent e) {
               cardLayout.show(cards, "Main");
            }
           
        });
       tips2.setAlignmentX(Component.CENTER_ALIGNMENT);
       tips2.addActionListener(new ActionListener() {
           
           @Override
           public void actionPerformed(ActionEvent e) {
               cardLayout.show(cards, "Tips");
            }
           
        });
       settings2.setAlignmentX(Component.RIGHT_ALIGNMENT);
       settings2.addActionListener(new ActionListener() {
           
           @Override
           public void actionPerformed(ActionEvent e) {
               cardLayout.show(cards, "Settings");
            }
           
        });
       home2.setPreferredSize(new Dimension(125, 50));
       tips2.setPreferredSize(new Dimension(125, 50));
       settings2.setPreferredSize(new Dimension(125, 50));
       panelSouth2.add(home2);
       panelSouth2.add(tips2);
       panelSouth2.add(settings2);
       tipPanel.add(panelSouth2, BorderLayout.SOUTH);
       
       
       
       // ***********SETTINGS PANEL************
       
       settingsPanel.setBackground(Color.red);
       JButton home3 = new JButton("Home");
       settingsPanel.add(home3);
       home3.addActionListener(new ActionListener() {
           
           @Override
           public void actionPerformed(ActionEvent e) {
               cardLayout.show(cards, "Main");
            }
           
        });
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
    
  //Main Method
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
       @Override
       public void run() {
           new Tip().setVisible(true);
        }
    });
        
   }
}
