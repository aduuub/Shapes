package swen221.assignment3.shapes;

public class Rectangle implements Shape{

	private double x;
	private double y;
	private double width;
	private double height;
	
	
	public Rectangle(double x, double y, double width, double height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	/**
	 * Determine whether or not the given point is contained within this shape.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	@Override
	public boolean contains(int x, int y) {
		return x >= this.x
				&& x < this.x + this.width
				&& y >= this.y
				&& y < this.y + this.height;
	}
	
	/**
	 * Determine a <i>bounding box</i> of the current shape. A bounding box is a
	 * box that will fit around the entire shape and, hence, can be used to
	 * determine the maximum width and height of the shape. This is useful when
	 * it comes to drawing the shape!
	 * 
	 * @return
	 */
	@Override
	public Rectangle boundingBox() {
		return this;
	}
	
	// getters and setters
	
	public double getX(){return this.x;}
	public double getY(){return this.y;}
	public double getWidth(){return this.width;}
	public double getHeight(){return this.height;}

	@Override
	public int getTotalWidth() {
	return (int) (this.width + this.x);
	}

	@Override
	public int getTotalHeight() {
		return (int) (this.height + this.y);
	}	
}
