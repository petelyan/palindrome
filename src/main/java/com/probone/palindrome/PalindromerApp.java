package com.probone.palindrome;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Palindromer application program runner.
 * @author petel
 *
 */
public class PalindromerApp {

	public static void main(String[] args) {
		menu();
	}
	
	
	/**
	 * Method to display information and the menu of options and read the user input.
	 */
	public static void menu() {
		Scanner in = new Scanner(System.in);
		int option = -1;
		System.out
				.println("Welcome. This program tests some a string of characters to determine\nif it is a palindrome");
		System.out.println();
		try {
			do {

				System.out.println();
				System.out.println("Choose an option");
				System.out.println("1 - Test a string");
				System.out.println("0 -  Exit");
				System.out.print("Option: ");

				option = in.nextInt();

				if (option == 1) {
					runCheck();
				} else if(option != 0){
					System.out.println("\nEnter 1 or 0 as options.");
				}else{
					System.out.println("\nGoodbye!");
				}

			} while (option != 0);
		} catch (InputMismatchException ime) {
			System.err.println("Error: Option not an integer. Try again.");
		}

		in.close();

	}
	/**
	 * Method to run the test on the input to determine if true or false.
	 */
	public static void runCheck() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter text to be tested:");
		String inputStr = in.nextLine();
		boolean result = Palindromer.isPalindrome(inputStr);
		if (result) {
			System.out.println("\n"+"'" + inputStr + "'" + " is a palindrome!");
		} else {
			System.out.println("\n"+"'" + inputStr + "'" + " is not a palindrome!");
		}
		//in.close();
	}

}
