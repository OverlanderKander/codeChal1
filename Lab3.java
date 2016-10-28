package week1;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {

		boolean cont = true;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Learn your squares and cubes!");

		do {
			System.out.print("\nEnter a number: ");
			if (!userInput.hasNextInt()) {
				System.out.println(" You must enter a number!");
				userInput.nextLine(); // discard junk in the scanner
				// continue; // looks like this is unnecessary
			} else {
				int userInt = userInput.nextInt();
				if (userInt > 1290) {
					System.out.println(
							"I'm sorry, you must enter 1290 or less (would you ever really need a larger cube?).");
				} else if (userInt < 0) {
					System.out.println("Try and stay positive.");
				} else {
					System.out.println("\nNumber \tSquare \tCube");
					System.out.println("====== \t====== \t======");
					for (int value = 1; value <= userInt; value++) {
						System.out.println(value + "\t" + value * value + "\t" + (value * value * value));
					}
				}
			}
			// ask user to continue
			System.out.print("\nEnter \"Y\" to calculate another number, enter any other key to exit the program: ");
			String answer = userInput.next();
			// if user input y the program will continue
			if (answer.toLowerCase().startsWith("y")) {
				cont = true;
			}
			// if user input n the output will state "end"
			else {
				System.out.println("END");
				userInput.close(); // close the resource leak
				cont = false;
			}

		} while (cont);
	}
}