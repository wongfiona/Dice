Die bob;

void setup()
{
  size(500,500);
  noLoop();
}

void draw()
{
  for(int y = 20; y <= 400; y += 80)
  {
    for(int x = 20; x <= 500; x += 80)
    {
      bob = new Die(x,y);
      bob.show();
    }
  }
}

void mousePressed()
{
  redraw();
}

class Die 
{
  int myX, myY, dots;
  Die(int x, int y)
  {
    myX = x;
    myY = y;
    roll();
  }

  void roll()
  {
    int dots = (int)(Math.random()*6)+1;
    if (dots == 1){
      fill(0);
      ellipse(myX+25, myY+25, 10, 10);
    }
   else if (dots == 2){
      fill(0);
      ellipse(myX+15, myY+15, 10, 10);
      ellipse(myX+35, myY+35, 10, 10);
    }
    else if (dots == 3){
      fill(0);
      ellipse(myX+12, myY+12, 10, 10);
      ellipse(myX+25, myY+25, 10, 10);
      ellipse(myX+38, myY+38, 10, 10);
    }
    else if (dots == 4){
      fill(0);
      ellipse(myX+15, myY+15, 10, 10);
      ellipse(myX+35, myY+15, 10, 10);
      ellipse(myX+15, myY+35, 10, 10);
      ellipse(myX+35, myY+35, 10, 10);
    }
    else if (dots == 5){
      fill(0);
      ellipse(myX+12, myY+12, 10, 10);
      ellipse(myX+38, myY+12, 10, 10);
      ellipse(myX+25, myY+25, 10, 10);
      ellipse(myX+12, myY+38, 10, 10);
      ellipse(myX+38, myY+38, 10, 10);
    }
    else if (dots == 6){
      fill(0);
      ellipse(myX+15, myY+12, 10, 10);
      ellipse(myX+35, myY+12, 10, 10);
      ellipse(myX+15, myY+25, 10, 10);
      ellipse(myX+35, myY+25, 10, 10);
      ellipse(myX+15, myY+38, 10, 10);
      ellipse(myX+35, myY+38, 10, 10);
    }
    
  }

  void show()
  {
    fill(255, 255, 255);
    rect(myX,myY,50,50,10);
    roll();
  }
}
