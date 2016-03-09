package prob5;

public abstract class Shape {
	int countSides;
	
	Shape(){}
	
	Shape(int countSides){
		this.countSides = countSides;
	}
	
	public int getCountSides(){
		return countSides;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
}
