package lab2;
import java.util.Scanner;


public class radiusCalculator {
	public static void main(String args[]) {
		//Create an user input
		Scanner black = new Scanner(System.in);
		System.out.print("What is the radius?: ");
		double radius = black.nextDouble();
		//Call method
		findAC(radius);
		
		
	}
	
	public static void findAC(double radius) {
		System.out.println("The area is: " + radius*radius*3.14);
		System.out.println("The circumference is: " + 2*radius*3.14);
	}
	
}
