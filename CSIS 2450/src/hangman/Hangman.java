
/*
 * Project: Hangman
 * Name: Tatiana Nicoara
 * Date: 09/06/2019
 */
package hangman;
import java.util.Scanner;
import java.util.Random;

public class Hangman {
	public static void main(String[] args) {
		
		String[] toGuessFrom = { "mouse", "computer", "banana", "work","college","pizza" };
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		boolean letsPlay = true;
		
		while (letsPlay) {
			System.out.println("\n ***** WELCOME TO THE GAME ***** \n");
			char[] randomWordToGuess = toGuessFrom[random.nextInt(toGuessFrom.length)].toCharArray();
			int amountOfGuesses = randomWordToGuess.length;
			char[] playerGuess = new char[amountOfGuesses];
			for (int i = 0; i < playerGuess.length; i++) {
				playerGuess[i] = '_';

			}
			boolean wordIsGuessed = false;
			int tries = 0;
			while (!wordIsGuessed && tries != amountOfGuesses) {
				System.out.print("Current guesses: ");
				printArray(playerGuess);
				System.out.printf("You have %d tries left. \n", amountOfGuesses - tries);
				System.out.println("Enter a single letter");
				char input = scanner.nextLine().charAt(0);
				tries++;

				if (input == '_') {
					letsPlay = false;
					wordIsGuessed = true;
				} else {
					for (int i = 0; i < randomWordToGuess.length; i++) {
						if (randomWordToGuess[i] == input) {
							playerGuess[i] = input;

						}

					}
					if (isTheWordGuessed(playerGuess)) {
						wordIsGuessed = true;
						System.out.println("Congratulation! You guessed the word :) ");
					}
				}
			}
			if (!wordIsGuessed)
				System.out.println("You ran out of guesses :( ");
			System.out.println("Do you want to play again? Yes/No");
			String anotherGame = scanner.nextLine();
			if (anotherGame.contentEquals("no"))
				letsPlay = false;
		}

	}

	public static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println();
	}

	public static boolean isTheWordGuessed(char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '_')
				return false;
		}
		return true;
	}
}
