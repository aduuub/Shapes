package swen221.assignment3.shapes;

/**
 * @author Adam
 * Assists the Interpretor class by preforming Union (+) related tasks on two shapes
 * Union joins the two shqpes together. It does this by removing the border where the two shapes overlap
 */
public class ShapeUnion extends ShapeOperator {

	public ShapeUnion(Shape one, Shape two) {
		super(one, two);
	}

	@Override
	public boolean contains(int x, int y) {
		boolean v =  one.contains(x, y) || two.contains(x, y);
		return v;
	}

	@Override
	public Rectangle boundingBox() {
		int minX = (int) Math.min(one.boundingBox().getX(), one.boundingBox().getX());
		int minY = (int) Math.min(one.boundingBox().getY(), two.boundingBox().getY());
		int maxX = (int) Math.max(one.boundingBox().getX() + (one.boundingBox().getWidth() ), two.boundingBox().getX() + (two.boundingBox().getWidth() ));
		int maxY = (int) Math.max(one.boundingBox().getY() + (one.boundingBox().getHeight() ), two.boundingBox().getY() + (two.boundingBox().getHeight() ));
		
		return new Rectangle(minX, minY, maxX - minX , maxY - minY );
	}

}
