package week1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab01RoomCalculator {

	public static void main(String[] args) {

		System.out.println("Welcome to the Grand Circus Room Detail Generator!");
		Scanner userInput = new Scanner(System.in);
		boolean keepGoing = true;

		do { // begin do while loop

			try { // sorry, Yoda.
				System.out.print("\nWhich room would you like to measure? > "); // prompt user for name of room
				String roomChoice = userInput.nextLine();
				System.out.print("Enter the length of " + roomChoice + ": > "); // prompt user measurements
				double length = userInput.nextDouble();
				System.out.print("Enter the width of " + roomChoice + ": > ");
				double width = userInput.nextDouble();
				System.out.print("Enter the height of " + roomChoice + ": > ");
				double height = userInput.nextDouble();
				double perimeter = (length * 2) + (width * 2); // perform calculations
				double area = (length * width);
				double volume = (length * width * height);

				System.out.println("\nThe perimeter of " + roomChoice + " is " + perimeter + ", the area of "
						+ roomChoice + " is " + area + ", and the volume of " + roomChoice + " is " + volume); // display results

			} catch (InputMismatchException e) { // ensure user enters a number for each measurement
				userInput.next();
				System.out.println("\n ERROR! You must enter a number.");
			} // end try catch exception

			System.out.print("\nDo you want to continue (Y/N): > "); // ask if user wants to keep going
			String choice = userInput.next();

			while (!choice.toLowerCase().startsWith("n") && !choice.toLowerCase().startsWith("y")) {
				System.out.print("\n Invalid answer. Please respond \"YES\" or \"NO\" > ");
				choice = userInput.next(); // re-prompt if user enters invalid answer
			}
			
			if (choice.toLowerCase().startsWith("y")) {
				userInput.nextLine(); // clear trash from scanner
				keepGoing = true; // begin new room measurement

			} else if (choice.toLowerCase().startsWith("n")) {
				
				keepGoing = false; // end the program
				System.out.println("\nGoodbye!");
				userInput.close(); // close the resource leak

//				choice = userInput.next();
//				String garbage = userInput.nextLine(); // clear garbage from scanner
			}

		} while (keepGoing); // end of do while loop 
	}
}