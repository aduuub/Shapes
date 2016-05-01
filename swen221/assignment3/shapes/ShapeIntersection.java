package swen221.assignment3.shapes;

/**
 * @author Adam
 * @version 2.1
 * Assists the Interpretor class by preforming Intersections (&) related tasks on two shapes
 */
public class ShapeIntersection extends ShapeOperator{

	/**
	 * Constructs a ShapeIntersection Object
	 * @param one
	 * @param two
	 */
	public ShapeIntersection(Shape one, Shape two) {
		super(one, two);
	}

	@Override
	public boolean contains(int x, int y) {
		return one.contains(x, y) && two.contains(x, y);
	}

	/**
	 * Returns a new BoundingBox that surrounds the ShapeIntersection object. 
	 * It calculates the bounding box by determining the minimum and maximum 
	 * x and y values for both shapes and makes the largest bounding box 
	 * possible inside these these points (minX -> maxX), (minY -> maxY),
	 * where both shapes must contain the points.
	 */
	@Override
	public Rectangle boundingBox() {

		int minSizeX = (int) Math.min(one.boundingBox().getX(), two.boundingBox().getX());
		int minSizeY = (int) Math.min(one.boundingBox().getX() , two.boundingBox().getX());
		int maxSizeX = (int) Math.max(one.boundingBox().getX() + (one.boundingBox().getWidth() ), two.boundingBox().getX() + (two.boundingBox().getWidth() ));
		int maxSizeY = (int) Math.max(one.boundingBox().getY() + (one.boundingBox().getHeight() ), two.boundingBox().getY() + (two.boundingBox().getHeight() ));

		int minX = -1;
		int minY = -1;
		int maxX = maxSizeX + 1;
		int maxY = maxSizeY + 1;

		boolean insideShape = false;
		for(int x = minSizeX; x < maxSizeX; x++){
			for(int y = minSizeY; y < maxSizeY; y++){
				if(one.contains(x, y) && two.contains(x, y)){
					if(!insideShape){
						insideShape = true;
						minX = x;
						minY = y;
					}else{
						maxX = x;
						maxY = y;
					}
				}
			}
		}

		if(minX == Integer.MAX_VALUE
				|| minY == Integer.MAX_VALUE
				|| maxX == Integer.MIN_VALUE
				|| maxY == Integer.MAX_VALUE)
			System.out.println("Not correctly calculating the values");

		return new Rectangle(minX, minY, maxX - minX +1, maxY - minY+1);		
	}

}
