package lab2;

import java.util.Scanner;

public class decimalPlace {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number:");
		int number = input.nextInt();
		addDecimal(number);
	}
	public static void addDecimal(int number) {
		System.out.println("You entered " + number + ", the new value is " + number + ".0");
	}
	
}
