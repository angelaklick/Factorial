//Program created by Angela Klick. The program displays the factorial of the
//number entered by the user. The application prompts the user to continue.

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Created bool assignment to control the flow of while loop
		boolean flag = true;

		while (flag) {

			long f = 1;

			System.out.println("Enter an integer from 1 to 10.");
			int n = scan.nextInt();

			//If the user input is less than 0, the program will let the user
			//know they cannot enter a negative.
			if (n < 0) {

				System.out.println("You cannot enter a negative. Try again");
				
			//Otherwise, the program will perform calculations	
			} else {

				// For loop that calculates the factorial
				for (int i = 1; i <= n; i++) {

					f = f * i;

				}

				System.out.println("The factorial of " + n + " is " + f);
				System.out.println("Would you like to continue? (y/n)");
				String input = scan.next();

				// If user input is no, this if statement will terminate the
				// program
				if (input.equalsIgnoreCase("n")) {

					System.out.println("Thanks for coming!");
					flag = false;

				}
			}
		}
	}

}
