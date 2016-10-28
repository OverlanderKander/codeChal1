package week1;

import java.security.SecureRandom;
import java.util.Scanner;

public class Lab05Dice {
	public static void main(String[] args) {
		boolean keepGoing = true;

		System.out.println("ROLL A PAIR OF DICE");
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("\nHow many sides would you like?: ");

			while (!scan.hasNextInt()) {
				System.out.print(" Invalid answer. Please enter a number: ");
				scan.nextLine();
			}

			int numberOfSides = scan.nextInt();

			while (numberOfSides <= 1) {
				System.out.print(" Invalid Answer. Dice must have at least 2 sides. \n  Please enter a number: ");
				numberOfSides = scan.nextInt();
			}

			System.out.print(" -Hit ENTER to roll the dice!-");
			scan.nextLine();
			scan.nextLine();

			System.out.println("You rolled a " + rollOfTheDie(numberOfSides) + " and a " + rollOfTheDie(numberOfSides));
			System.out.print("\nWould you like to continue (Y/N)? ");

			String choice = scan.next();

			while (!choice.toLowerCase().startsWith("n") && !choice.toLowerCase().startsWith("y")) {
				System.out.print("\n Invalid answer. Please respond \"YES\" or \"NO\": ");
				choice = scan.next(); // re-prompt if user enters invalid answer
			}

			if (choice.toLowerCase().startsWith("y")) {
				scan.nextLine(); // clear trash from scanner
				keepGoing = true; // begin new room measurement

			} else if (choice.toLowerCase().startsWith("n")) {

				keepGoing = false; // end the program
				System.out.println("\nGoodbye!");
				scan.close(); // close the resource leak
			}
		} while (keepGoing);
	}

	public static int rollOfTheDie(int peter) {
		SecureRandom newRoll = new SecureRandom();
		int result = (newRoll.nextInt(peter) + 1);
		return result;
	}
}