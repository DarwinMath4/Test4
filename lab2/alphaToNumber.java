package lab2;

import java.util.Scanner;

public class alphaToNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter:");
		char letter = input.next().charAt(0);
		turnToNumber(letter);
		
	}
	public static void turnToNumber(int letter) {
		int ascii = letter;
		
		
		if ((letter >= 'a' && letter <='z') || (letter >= 'A' && letter <= 'Z')) {
			System.out.println(ascii);
			
		}
		else {
			System.out.println("Error");
		}
		
	}
	
}
