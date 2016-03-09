package prob5;

public class Rectangle extends Shape implements Resizable{

	private double width;
	private double height;
	
	public Rectangle(double width,double height){
		super();
		this.width = width;
		this.height = height;
	}
	
	public double getArea(){
		return (width*height);
	}
	public double getPerimeter(){
		return 2*(width+height);
	}

	@Override
	public void resize(double rate) {
		this.width = this.width * rate;
		this.height = this.height * rate;
	}
}
