package lab2;

import java.util.Scanner;

public class evenOrOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		findOE(number);
	}

	public static void findOE(int number) {
		if (number == 0) {
			System.out.println("Error");
		}
		
		else if (number % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
	}
}
