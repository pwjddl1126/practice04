package prob5;

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle nemo = new Rectangle(5,6);
		RecTriangle semo = new RecTriangle(6,2);
		
		Shape[] sh = {nemo,semo};
		
		for(int i=0; i<sh.length; i++){
			System.out.println("area : "+sh[i].getArea());
			System.out.println("perimeter : "+sh[i].getPerimeter());
			
			if(sh[i] instanceof Resizable){
				((Rectangle)sh[i]).resize(0.5);
				System.out.println("new area : "+sh[i].getArea());
				System.out.println("new perimeter : "+sh[i].getPerimeter());
			}
		}
		
	}

}
