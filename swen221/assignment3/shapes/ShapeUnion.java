package swen221.assignment3.shapes;

/**
 * @author Adam
 * @version 2.1
 * Assists the Interpretor class by preforming Union (+) related tasks on two shapes
 * Union joins the two shqpes together. It does this by removing the border where the two shapes overlap
 */
public class ShapeUnion extends ShapeOperator {

	/**
	 * Constructs a ShapeUnion Object
	 * @param one
	 * @param two
	 */
	public ShapeUnion(Shape one, Shape two) {
		super(one, two);
	}

	@Override
	public boolean contains(int x, int y) {
		boolean v =  one.contains(x, y) || two.contains(x, y);
		return v;
	}

	/**
	 * Returns a new BoundingBox that surrounds the ShapeUnion object. 
	 * It calculates the bounding box by determining the minimum and maximum 
	 * x and y values for both shapes and makes the largest bounding box 
	 * possible using these points (minX -> maxX), (minY -> maxY).
	 */
	@Override
	public Rectangle boundingBox() {
		int minX = (int) Math.min(one.boundingBox().getX(), one.boundingBox().getX());
		int minY = (int) Math.min(one.boundingBox().getY(), two.boundingBox().getY());
		int maxX = (int) Math.max(one.boundingBox().getX() + (one.boundingBox().getWidth() ), two.boundingBox().getX() + (two.boundingBox().getWidth() ));
		int maxY = (int) Math.max(one.boundingBox().getY() + (one.boundingBox().getHeight() ), two.boundingBox().getY() + (two.boundingBox().getHeight() ));

		return new Rectangle(minX, minY, maxX - minX , maxY - minY );
	}

}
