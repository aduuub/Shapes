package swen221.assignment3.shapes;

/**
 * @author Adam
 * @version 1.2
 * 
 * Abstract class to assist with opperations such as union, difference and intersection.
 * The primary purpose of this class is to save code.
 **/
public abstract class ShapeOperator implements Shape{

	protected Shape one;
	protected Shape two;

	/** A constructor that takes in two shapes
	 * @param one The larger shape ShapeDifference
	 * @param two The smaller shape for ShapeDifference
	 */
	public ShapeOperator(Shape one, Shape two){
		this.one = one;
		this.two = two;
	}

	/** 
	 * @param one
	 * @param two
	 * @param x
	 * @param y
	 * @return	Whether both shapes contain point (x,y)
	 */
	public boolean overLapping(Shape one, Shape two, int x, int y){
		return one.boundingBox().contains(x, y) 
				&& two.boundingBox().contains(x, y);
	}


	@Override
	public abstract boolean contains(int x, int y);

	@Override
	public abstract Rectangle boundingBox();

	@Override
	public int getTotalWidth() {
		return boundingBox().getTotalWidth();
	}

	@Override
	public int getTotalHeight() {
		return boundingBox().getTotalHeight();
	}

}




