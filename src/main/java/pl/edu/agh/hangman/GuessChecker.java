package pl.edu.agh.hangman;

import java.util.List;

public class GuessChecker {

	public void checkGuess(String word, List<String> guessedLetters) {
		String puzzle = "";
		for (char letter : word.toCharArray()) {
			if (guessedLetters.contains(""+ letter)) {
				puzzle += letter;
			} else {
				puzzle += "=";
			}
		}
		System.out.println(puzzle);
	}
}
