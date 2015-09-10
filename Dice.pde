Die bob;

void setup()
{
	size(500,500);
	noLoop();
}

void draw()
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

void mousePressed()
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
	void roll()
	{
		int dots = (int)(Math.random()*0)+1;
		if(dots == 1){
			fill(0);
			ellipse(25,25,10,10);
		}
			
	}
	void show()
	{
		fill(255, 255, 255);
		rect(myX,myY,50,50,20);
	}
}
