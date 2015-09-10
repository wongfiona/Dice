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
	size(500,500);
	noLoop();
}

public void draw()
{
	for(int y = 0; y <= 500; y += 50)
	{
		for(int x = 0; x <= 500; x += 50)
		{
			bob = new Die(x,y);
			bob.show();
		}
	}
	
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
		roll();
		myX = x;
		myY = y;

	}
	public void roll()
	{
		int dots = (int)(Math.random()*0)+1;
		if(dots == 1){
			fill(0);
			ellipse(25,25,10,10);
		}
			
	}
	public void show()
	{
		fill(255, 255, 255);
		rect(myX,myY,50,50,20);
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
