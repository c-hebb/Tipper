//To DO: Buttons for stars

var starColor = false;
var starColor2 = false;
var starColor3 = false;
var starColor4 = false;
var starColor5 = false;
var rating = 0;
let tipString = 'Tip: $0.00';

function setup() {
   createCanvas(400, 700); 
   if(displayWidth < 1200) {
    resizeCanvas(displayWidth, displayHeight); 
   }

  billInput = createInput();
  billInput.position((width/2 - 45), 160);

  tipAmount = 0.00;

  btnCalculate = createButton('Calculate');
  btnCalculate.position((width/2)-30, 410);
  btnCalculate.mousePressed(tipCalc);

  /*
 	rating1 = createButton('1 Star');
  //rating1.position(30, 260);
  //rating1.mousePressed(star1);
  //rating1.size(50, 50);
  
  rating2 = createButton('2 Star');
  rating2.position(100, 260);
  rating2.mousePressed(star2);
  
  rating3 = createButton('3 Star');
  rating3.position(170, 260);
  rating3.mousePressed(star3);
  
  rating4 = createButton('4 Star');
  rating4.position(240, 260);
  rating4.mousePressed(star4);
  
  rating5 = createButton('5 Star');
  rating5.position(310, 260);
  rating5.mousePressed(star5);
  */
}

function draw() {
  background(71, 209, 71);
  textAlign(CENTER);
  textSize(50);
  title(width /2);
  rect(width/2 - 150, 135, 300, 5);
  textAlign(CENTER);
  textSize(25);
  billText(width/2 - 90);
  textSize(20);
  rateText(width/2);
  textSize(35);
  tipText(width * 0.5);
  star(starColor, width/2 - 145, 270);
  star(starColor2, width/2 - 73, 270);
  star(starColor3, width/2, 270);
  star(starColor4, width/2 + 73, 270);
  star(starColor5, width/2 + 145, 270);

  if (mouseX >= (width/2 - 175) && mouseX <= (width/2 - 175) + 60 && mouseY >= 235 && mouseY <= 235 + 60) {
    isOverStar1 = true;
  } else {
    isOverStar1 = false;
  }
  

  if (mouseX >= (width/2 - 105) && mouseX <= (width/2 - 105) + 60 && mouseY >= 235 && mouseY <= 235 + 60) {
    isOverStar2 = true;
  } else {
    isOverStar2 = false;
  }

  if (mouseX >= (width/2 - 30) && mouseX <= (width/2 + 30) && mouseY >= 235 && mouseY <= 235 + 60) {
    isOverStar3 = true;
  } else {
    isOverStar3 = false;
  }

  if (mouseX >= (width/2 + 45) && mouseX <= (width/2 + 45) + 60 && mouseY >= 235 && mouseY <= 235 + 60) {
    isOverStar4 = true;
  } else {
    isOverStar4 = false;
  }

  if (mouseX >= (width/2 + 115) && mouseX <= (width/2 + 115) + 60 && mouseY >= 235 && mouseY <= 235 + 60) {
    isOverStar5 = true;
  } else {
    isOverStar5 = false;
  }

}

function title(x) {
  fill(255);
  text('Tip App', x, 100);
}

function billText(x) {
  fill(255);
  text('Bill $$:', x, 180);
}

function rateText(x) {
  fill(255);
  text('Rate Your Service!', x, 225);
}

function tipText(x) {
  fill(255);
  text(tipString, x, 500);
}

function star1() {
  rating = 1;
  if (starColor == false) {
    starColor = !starColor
  }
  if (starColor2 == true || starColor4 == true) {
    starColor2 = false;
    starColor3 = false;
    starColor4 = false;
    starColor5 = false;
  }
}

function star2() {
  rating = 2;
  if (starColor2 == false) {
    starColor2 = !starColor2
  }
  if (starColor == false) {
    starColor = true;
  }
  if (starColor3 == true || starColor5 == true) {
    starColor3 = false;
    starColor4 = false;
    starColor5 = false;
  }
}

function star3() {
  rating = 3;
  if (starColor3 == false) {
    starColor3 = !starColor3;
  }
  if (starColor2 == false || starColor == false) {
    starColor = true;
    starColor2 = true;
  }
  if (starColor4 == true || starColor5 == true) {
    starColor4 = false;
    starColor5 = false;
  }
}

function star4() {
  rating = 4;
  if (starColor4 == false) {
    starColor4 = !starColor4
  }
  if (starColor3 == false || starColor2 == false) {
    starColor = true;
    starColor2 = true;
    starColor3 = true
  }
  if (starColor5 == true) {
    starColor5 = false;
  }
}

function star5() {
  rating = 5;
  if (starColor5 == false) {
    starColor5 = true;
  }
  if (starColor4 == false || starColor3 == false) {
    starColor = true;
    starColor2 = true;
    starColor3 = true;
    starColor4 = true;
  }
}


function tipCalc() {

  billTotal = billInput.value();
  tipFinal = (billTotal * 0.92) * (rating * 0.05);
  tipAmount = tipFinal.toFixed(2);
  if (rating == 0) {
    tipString = 'Must Rate Service!';
  } else if (isNaN(billTotal)) {
    tipString = 'Invalid Bill $$';
  } else {
    tipString = 'Tip: $' + tipAmount + '!';
  }
}

function star(color, x, y) {
  push();
  translate(x, y); // center of the star
  scale(0.7);
  fillStar(color);
  beginShape();
  vertex(0, -50);
  vertex(14, -20);
  vertex(47, -15);
  vertex(23, 7);
  vertex(29, 40);
  vertex(0, 25);
  vertex(-29, 40);
  vertex(-23, 7);
  vertex(-47, -15);
  vertex(-14, -20);
  endShape(CLOSE);
  translate(100, 100);
  pop();
}

function fillStar(color) {
  if (color == true) {
    fill(255, 255, 0);
  } else if (color == false) {
    fill(255);
  }
}

function mousePressed() {
  if (isOverStar1 == true) {
    star1();
  } else if (isOverStar2 == true) {
    star2();
  } else if (isOverStar3 == true) {
    star3();
  } else if (isOverStar4 == true) {
    star4();
  } else if (isOverStar5 == true) {
    star5();
  }
}