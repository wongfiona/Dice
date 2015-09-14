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
	for(int y = 0; y <= 400; y += 75)
	{
		for(int x = 0; x <= 500; x += 75)
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
		show();
		roll();
		myX = x;
		myY = y;

	}

	public void roll()
	{
		int dots = (int)(Math.random()*3)+1;
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
			ellipse(myX+10, myY+10, 10, 10);
			ellipse(myX+25, myY+25, 10, 10);
			ellipse(myX+40, myY+40, 10, 10);
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
