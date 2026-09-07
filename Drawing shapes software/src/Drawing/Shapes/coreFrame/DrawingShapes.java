package Drawing.Shapes.coreFrame;

// Application allows user to draw lines, rectangles and ovals and choose the color of the drawn shape.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawingShapes extends JFrame {
	
private static final long serialVersionUID = -9130028161620262162L;

// JPanel for the shape and color controls
private JPanel controlsJPanel;

// JComboBox to allow selection of a shape
private JComboBox shapeJComboBox;

// JButton to select the color


private JButton colorJButton;

// PaintJPanel for drawing shapes
private PaintJPanel painterPaintJPanel;

// array of shape types
private String[] shapeTypes = { "Line", "Rectangle", "Oval" };

	// no-argument constructor

	public DrawingShapes() {
		createUserInterface();
	}

	// create and position GUI components; register event handlers
	private void createUserInterface() {
		// get content pane for attaching GUI components
		Container contentPane = getContentPane();
		// enable explicit positioning of GUI components
		contentPane.setLayout(null);
		// set up controlsJPanel
		controlsJPanel = new JPanel();
		controlsJPanel.setBounds(0, 0, 400, 40);
		controlsJPanel.setLayout(null);
		contentPane.add(controlsJPanel);
		// set up painterPaintJPanel
		painterPaintJPanel = new PaintJPanel();
		painterPaintJPanel.setBounds(0, 40, 400, 340);
		painterPaintJPanel.setBackground(Color.WHITE);
		contentPane.add(painterPaintJPanel);

		// set up shapeJComboBox
		shapeJComboBox = new JComboBox(shapeTypes);
		shapeJComboBox.setBounds(90, 2, 100, 24);
		controlsJPanel.add(shapeJComboBox);
		shapeJComboBox.addActionListener(

		new ActionListener()
		// anonymous inner class
				{
					// event method called when shapeJComboBox is selected
					public void actionPerformed(ActionEvent event) {
						shapeJComboBoxActionPerformed(event);
					}
				} // end anonymous inner class
				); // end call to addActionListener

		// set up colorJButton
		colorJButton = new JButton();
		colorJButton.setBounds(210, 2, 80, 24);
		colorJButton.setText("Color");
		controlsJPanel.add(colorJButton);
		colorJButton.addActionListener(

new ActionListener() // anonymous inner class 
{
// event handler called when colorJButton is pressed
public void actionPerformed(ActionEvent event) {colorJButtonActionPerformed(event);}
}
// end anonymous inner class
);
// end call to addActionListener
// set properties of application’s window
		setTitle("Drawing shapes software"); // set title bar string
		setSize(408, 407); // set window size
		setVisible(true); // display window
	} // end method createUserInterface
		// select a new color for the shape

private void colorJButtonActionPerformed(ActionEvent event) {
Color selection = JColorChooser.showDialog( null, "Select a Color", Color.BLACK );
if ( selection != null ) {
colorJButton.setBackground(selection);
painterPaintJPanel.setCurrentColor(selection );}
} 

// end method colorJButtonActionPerformed
// set the selected shape in the painting panel

private void shapeJComboBoxActionPerformed( ActionEvent event ) 
{
painterPaintJPanel.setCurrentShapeType(          
shapeJComboBox.getSelectedItem().toString() );
}
// end method shapeJComboBoxActionPerformed 
// main method
public static void main(String args[]) {
DrawingShapes application = new DrawingShapes();
application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
// end method main
} 
// end class DrawingShapes

