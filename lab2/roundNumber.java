package lab2;

import java.util.Scanner;

public class roundNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double deciNumb = input.nextDouble();
		roundNumb(deciNumb);
		
	}
	public static void roundNumb(double deciNumb) {	
		System.out.println("You entered " + deciNumb + ", the new value is " + Math.round(deciNumb));
	}
	
}
