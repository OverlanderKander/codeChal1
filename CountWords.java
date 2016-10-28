// Team Patrick, Emmanuel, Jake

package week1;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter a sentence: ");
		String sentence = scan.nextLine();

		int numWords = count(sentence);
		System.out.println("There are " + numWords + " words in the sentence.");

		scan.close();
	}

	public static int count(String sent) {
		int numberOfWords = 0;

		// boolean nextWord = true;
		String s = sent;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isWhitespace(s.charAt(i))) {
			numberOfWords++;
			}
		}

		return numberOfWords+1;
		// find start of word
		// find end of first word
		// find next non-space char for next word
		//

	}
}
