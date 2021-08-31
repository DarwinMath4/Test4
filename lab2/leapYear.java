package lab2;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		findLeapYear(year);

	}
	public static void findLeapYear(int year) {
		if ((year % 4 == 0) || (year % 100 == 0) || (year % 400 == 0)){
			System.out.println("This year is a leap year.");
		
		}
		else {
			System.out.println("This is not a leap year.");
		}
	}
}
