import java.util.*;
public class Maths {
	Scanner input = new Scanner(System.in);
	
	public  void areaofCircle() {
		System.out.println("Enter the radius");
		int radius = input.nextInt();
		double area = (3.14)*radius*radius;
		System.out.println(area);
		
	}
	
	public void areaOfRectangle() {
		System.out.println("Enter the length");
		int length = input.nextInt();
		System.out.println("Enter the bredth");
		int bredth = input.nextInt();
		int area = length*bredth;
		System.out.println(area);
	}
	
	public void areaofTriangle() {
		System.out.println("Enter the height");
		int height = input.nextInt();
		System.out.println("Enter base");
		int base = input.nextInt();
		int area = (height*base)/2;
		System.out.println(area);
	}
	
	public static void main(String args []) {
		Maths ac = new Maths();
		ac.areaofCircle();
		ac.areaOfRectangle();
		ac.areaofTriangle();
	}

}
