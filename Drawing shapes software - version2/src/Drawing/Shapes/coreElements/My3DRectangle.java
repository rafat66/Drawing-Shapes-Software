package Drawing.Shapes.coreElements;

// Class that declares a 3D rectangle object.
import java.awt.*;
import Drawing.Shapes.coreFrame.MyShape;

public class My3DRectangle extends MyShape {
	// constructor
	public My3DRectangle(int firstX, int firstY, int secondX, int secondY,
			Color shapeColor) {
		super(firstX, firstY, secondX, secondY, shapeColor);
	} // end constructor

	// draw a 3D rectangle
	public void draw(Graphics g) {
		int upperLeftX = Math.min(getX1(), getX2());
		int upperLeftY = Math.min(getY1(), getY2());
		int width = Math.abs(getX1() - getX2());
		int height = Math.abs(getY1() - getY2());

		// depth of the 3D effect
		int depth = Math.max(1, Math.min(width, height) / 4);

		Color base = getColor();
		Color top = base.brighter();
		Color side = base.darker();

		// front face
		g.setColor(base);
		g.fillRect(upperLeftX, upperLeftY + depth, width - depth, height - depth);

		// top face (parallelogram)
		g.setColor(top);
		Polygon topFace = new Polygon();
		topFace.addPoint(upperLeftX, upperLeftY + depth);
		topFace.addPoint(upperLeftX + depth, upperLeftY);
		topFace.addPoint(upperLeftX + width, upperLeftY);
		topFace.addPoint(upperLeftX + width - depth, upperLeftY + depth);
		g.fillPolygon(topFace);

		// right face (parallelogram)
		g.setColor(side);
		Polygon rightFace = new Polygon();
		rightFace.addPoint(upperLeftX + width - depth, upperLeftY + depth);
		rightFace.addPoint(upperLeftX + width, upperLeftY);
		rightFace.addPoint(upperLeftX + width, upperLeftY + height - depth);
		rightFace.addPoint(upperLeftX + width - depth, upperLeftY + height);
		g.fillPolygon(rightFace);

		// outline for clarity
		g.setColor(Color.BLACK);
		g.drawRect(upperLeftX, upperLeftY + depth, width - depth, height - depth);
		g.drawPolygon(topFace);
		g.drawPolygon(rightFace);
	} // end method draw
} // end class My3DRectangle