package swen221.assignment3.shapes;

/**
 * @author Adam
 * Assists the Interpretor class by preforming Difference (-) related tasks on two shapes
 * Shape difference removes shape two from shape one
 */
public class ShapeDifference extends ShapeOperator {

	public ShapeDifference(Shape one, Shape two) {
		super(one, two);
	}

	@Override
	public boolean contains(int x, int y) {
		return one.contains(x, y) && !two.contains(x, y);
	}

	@Override
	public Rectangle boundingBox() {
		return one.boundingBox();
	}
	
	
}
