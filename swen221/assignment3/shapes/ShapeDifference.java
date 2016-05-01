package swen221.assignment3.shapes;

/**
 * @author Adam
 * @version 2.1
 * Assists the Interpretor class by preforming Difference (-) related tasks on two shapes
 * Shape difference removes shape two from shape one
 */
public class ShapeDifference extends ShapeOperator {

	/**
	 * Constructs a new ShapeDifference Object
	 * @param one	The larger shape
	 * @param two	The smaller shape to subtract from the larger shape.
	 */
	public ShapeDifference(Shape one, Shape two) {
		super(one, two);
	}

	@Override
	public boolean contains(int x, int y) {
		return one.contains(x, y) && !two.contains(x, y);
	}

	/**
	 * Returns the larger shapes bounding box, as the smaller
	 * shapes bounding box should be contained inside this.
	 * @return Rectangle BoundingBox
	 */
	@Override
	public Rectangle boundingBox() {
		return one.boundingBox();
	}


}
