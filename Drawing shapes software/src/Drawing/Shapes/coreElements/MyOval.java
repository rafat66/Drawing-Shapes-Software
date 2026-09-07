// by Ra'fat AL-msie'deen  2016

package Drawing.Shapes.coreElements;

// Class that declares an oval object.
import java.awt.*;
import Drawing.Shapes.coreFrame.MyShape;

public class MyOval extends MyShape {
	
	
	public MyOval(int firstX, int firstY, int secondX, int secondY,
			Color shapeColor) { // constructor
		super(firstX, firstY, secondX, secondY, shapeColor);
	} // end constructor
		// draw an oval
	
	public void draw(Graphics g) {
		int upperLeftX = Math.min(getX1(), getX2());
		int upperLeftY = Math.min(getY1(), getY2());
		int width = Math.abs(getX1() - getX2());
		int height = Math.abs(getY1() - getY2());
		g.setColor(getColor());
		g.fillOval(upperLeftX, upperLeftY, width, height);
	} // end method draw 
	
} // end class MyOval

/*
 * h
 * h
 * ii
 * ii
 */

	





