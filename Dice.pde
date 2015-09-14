Die bob;

void setup()
{
	size(500,500);
	noLoop();
}

void draw()
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

void mousePressed()
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

	void roll()
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

	void show()
	{
		fill(255, 255, 255);
		rect(myX,myY,50,50,10);
		roll();
	}
	
}
