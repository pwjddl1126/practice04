package prob5;

public class RecTriangle extends Shape{

	private double width;
	private double height;
	
	RecTriangle(double width,double height){
		super();
		this.width = width;
		this.height = height;
	}
	
	public double getArea(){
		return (width*height)/2;
	}
	public double getPerimeter(){
		return width+height+Math.sqrt(width*width+height*height);
	}
	
	
}
