import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

Die bob;

public void setup()
{
  size(575,500);
  noLoop();
}

public void draw()
{
  int total = 0;
  background(112, 190, 224);
  for(int y = 20; y <= 340; y += 80)
  {
    for(int x = 20; x <= 500; x += 80)
    {
      bob = new Die(x,y);
      bob.show();
      total = total + bob.dots;
    }
  }
  textSize(30);
  fill(0);
  text("Total is " + total, 190, 450);

}

public void mousePressed()
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

  public void roll()
  {
    dots = (int)(Math.random()*6)+1;
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
      ellipse(myX+15, myY+11, 10, 10);
      ellipse(myX+35, myY+11, 10, 10);
      ellipse(myX+15, myY+25, 10, 10);
      ellipse(myX+35, myY+25, 10, 10);
      ellipse(myX+15, myY+39, 10, 10);
      ellipse(myX+35, myY+39, 10, 10);
    }
    
  }

  public void show()
  {
    fill(255, 255, 255);
    rect(myX,myY,50,50,10);
    roll();
  }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
