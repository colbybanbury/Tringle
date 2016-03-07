package base;
/**
 * This class contains 6 attributes: side1, side2, side3, perimeter, area, and halfP.
 * The values for each of the the sides are defaulted to 1 but the overloaded constructor allows for different
 * values to input
 * The class contains three methods. getPerimeter() returns the perimeter
 * getArea()  returns the area. toString() returns a string that gives the sides of the triangle
 * in a sentence.
 * 
 * @author Colby Banbury
 *
 */
public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	private double perimeter;
	private double area;
	private double halfP;
	
	Triangle(){
		side1 = 1;
		side2 = 1;
		side3 = 1;
		perimeter = side1+side2+side3;
		halfP = perimeter/2;
		area = Math.sqrt(halfP*(halfP-side1)*(halfP-side2)*(halfP-side3));
	}
	
	Triangle(double s1, double s2, double s3){	//overloaded constructor that allows side lengths to be input
		side1 = s1;
		side2 = s2;
		side3 = s3;
		perimeter = side1+side2+side3;
		halfP = perimeter/2;
		area = Math.sqrt(halfP*(halfP-side1)*(halfP-side2)*(halfP-side3));
		
	}
	public double getPerimeter(){	//returns perimeter
		return(perimeter);
	}
	public double getArea(){	//returns area
		return area;
	}
	
	public String toString(){	//returns a string with the side lengths
		return("This is a triangle with sides: " +side1+ ", "+side2+ ", "+side3);
	}
}
