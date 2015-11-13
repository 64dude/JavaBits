/* 
 * Show Inheritance via 2D shapes
 * Superclass TwoDShape - Print dimensions
 * Subclass Triangle - Print area and dimesions (from superclass)
 */

class TwoDShape {
	double w, h;
	
	void printDim() {
		System.out.println("Width: " + w + " Height: " + h);
	}
	
}

class Triangle extends TwoDShape {
	
	double area(double w, double h) {
		return w * h / 2;
	}
	
	// System.out.println("Area: " + area(w, h));
}

class Rectangle extends TwoDShape {
	
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
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		Rectangle r1 = new Rectangle();
		t1.h = 10;
		t1.w = 20;
		t2.h = 5;
		t2.w = 3;
		r1.h = 6;
		r1.w = 3;
		
		t1.printDim();
		t2.printDim();
		r1.printDim();
		System.out.println("T1 area: " + t1.area(t1.h, t1.w));
		System.out.println("T2 area: " + t1.area(t2.h, t2.w));
		System.out.println("R1 area: " + r1.area(r1.w, r1.h));

	}

}
