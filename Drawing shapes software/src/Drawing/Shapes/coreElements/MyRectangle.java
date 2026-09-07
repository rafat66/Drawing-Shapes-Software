package Drawing.Shapes.coreElements;

// Class that declares a rectangle object.
import java.awt.*;

import Drawing.Shapes.coreFrame.MyShape;

public class MyRectangle extends MyShape {
	// constructor
	public MyRectangle(int firstX, int firstY, int secondX, int secondY,
			Color shapeColor) {
		super(firstX, firstY, secondX, secondY, shapeColor);
	} // end constructor
	  // draw a rectangle

	public void draw(Graphics g) {
		int upperLeftX = Math.min(getX1(), getX2());
		int upperLeftY = Math.min(getY1(), getY2());
		int width = Math.abs(getX1() - getX2());
		int height = Math.abs(getY1() - getY2());
		g.setColor(getColor());
		g.fillRect(upperLeftX, upperLeftY, width, height);
	} // end method draw
} // end class MyRectangle

