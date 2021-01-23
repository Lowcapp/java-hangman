package pl.edu.agh.hangman;

import java.util.List;

public class GameStatus {

	public void printStatus(String word, List<String> guessedLetters) {
		int counter = 0;
		for (char letter : word.toCharArray()) {
			if (!guessedLetters.contains("" + letter)) {
				counter++;
			}
		}

		if (counter < 7) {
			String status = Hangman.HANGMANPICS[counter];
			System.out.println(status);
		} else {
			System.out.println("Try again.. (╯°□°)╯︵");
		}
	}
}
