package TipApp;

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

public class Tip2 extends JFrame {

    public Tip2()
    {
       createView();
       
       setTitle("Tip App2");
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
       JPanel panel = new JPanel();
       
       //Sets Padding/Margin Around Panel
       panel.setBorder(new EmptyBorder(10, 10, 10, 10));
       panel.setLayout(new BorderLayout());
       panel.setBackground(Color.white);
       getContentPane().add(panel);
       
       //North
       JPanel panelNorth = new JPanel();
       panelNorth.setBackground(Color.green);
       panel.add(panelNorth, BorderLayout.NORTH);
       JLabel title = new JLabel("Tip App");
       title.setPreferredSize(new Dimension(225, 150));
       title.setForeground(Color.white);
       title.setFont(new Font("Helvetica BOLD", 1, 60));
       panelNorth.add(title);
    }
    
  //Main Method
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
       @Override
       public void run() {
           new Tip2().setVisible(true);
        }
    });
        
   }
}
