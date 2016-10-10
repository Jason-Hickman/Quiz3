package main;

public class Triangle {

	private double side1;
	private double side2;
	private double side3;
	
	Triangle(){
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	Triangle(double x, double y, double z) throws TriangleException{
		if (x+y>z && x+z>y && y+z>x){
			side1 = x;
			side2 = y;
			side3 = z;
		}
		else throw new TriangleException();
	}
	
	public double getSide1(){
		return side1;
	}
	
	public double getSide2(){
		return side2;
	}
	
	public double getSide3(){
		return side3;
	}
	
	public double getPerimeter(){
		return side1+side2+side3;
	}
	
	public double getArea(){
		double s = getPerimeter()/2;
		double A = Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
		return A;
	}
	
	@Override
	public String toString(){
		return "Side 1 is " + side1 + ". Side 2 is " + side2 + ". Side 3 is " + side3 + ".";
	}
}
