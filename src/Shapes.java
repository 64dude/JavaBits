/* 
 * Show Inheritance via 2D shapes
 * Superclass TwoDShape - Print dimensions
 * Subclass Triangle - Print area and dimensions (from superclass)
 * Test: Branch v2 (first update)
 */

class TwoDShape {
	private double w, h;
	String uniqueID = "ABC"; // Placeholder for GUID or hash ()
	
	TwoDShape(double width, double height) {
		w = width;
		h = height;
	}
	
	
	void printDim() {
		System.out.println("Width: " + w + " Height: " + h);
	}
	
	//Accessor methods
	void setDim(double a, double b) {
		w = a;
		h = b;
	}
	
	double getWidth() {return w;}
	double getHeight() {return h;}
	
}

class Triangle extends TwoDShape {
	
	private String style;
	
	double area(double w, double h) {
		return w * h / 2;
	}
	
	Triangle(String s, double w, double h) {
		super(w, h);
		style = s;
		
	}
	
	String getStyle() {return style;}
	
	// System.out.println("Area: " + area(w, h));
}

class Rectangle extends TwoDShape {
	
	Rectangle(double w, double h) {
		super(w, h);
		System.out.println("Rectangle constructor super var: " + super.uniqueID);
	}
	
	double area(double w, double h) {
		return w * h;
	}
}


public class Shapes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle("Equalateral", 10, 20);
		Triangle t2 = new Triangle("Isoceles", 5, 2);
		Rectangle r1 = new Rectangle(6, 7.5);
		// t1.setDim(10,20);
		// t2.setDim(5, 2);
		// r1.setDim(6, 7);
		
		t1.printDim();
		t2.printDim();
		r1.printDim();
		System.out.println("T1 area/style: " + t1.area(t1.getWidth(), t1.getHeight())+ "/" + t1.getStyle());
		System.out.println("T2 area/style: " + t2.area(t2.getWidth(), t2.getHeight()) + "/" + t2.getStyle());
		System.out.println("R1 area: " + r1.area(r1.getWidth(), r1.getHeight()));
		

	}

}
