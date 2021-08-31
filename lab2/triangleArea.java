package lab2;

import java.util.Scanner;

public class triangleArea {

	public static void main(String[] args) {
		Scanner quick = new Scanner(System.in);
		System.out.print("What is the base size?: ");
		double base = quick.nextDouble();
		
		System.out.print("What is the height?: ");
		double height = quick.nextDouble();
		findArea(base, height);
		

	}

	public static void findArea(double base , double height) {
		System.out.println("The area is: " + (base*height)/2);
		
	}
}
