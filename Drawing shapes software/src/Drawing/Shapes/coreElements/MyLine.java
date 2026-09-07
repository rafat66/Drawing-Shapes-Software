// by Ra'fat AL-msie'deen  2016

package Drawing.Shapes.coreElements;

// Class that declares a line object.

import java.awt.*;

import Drawing.Shapes.coreFrame.MyShape;

public class MyLine extends MyShape {
	// constructor
	public MyLine(int firstX, int firstY, int secondX,
			int secondY, Color shapeColor) {
		super(firstX, firstY, secondX, secondY, shapeColor);
	}   // end constructor
		// draw a line
	
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.drawLine(getX1(), getY1(), getX2(), getY2());
	} // end method draw
} // end class MyLine



