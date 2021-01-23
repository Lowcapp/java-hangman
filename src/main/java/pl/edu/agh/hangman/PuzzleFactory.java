package pl.edu.agh.hangman;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Random;

public class PuzzleFactory {

	private static List<String> lines = null;
	private Random rand = new Random();

	private void readLines() {
		try {
			lines = Files.readAllLines(new File("src/main/resources/slowa.txt").toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public char[] getPuzzle() {
		readLines();
		String puzzle = lines.get(rand.nextInt(lines.size())).toLowerCase();
		return puzzle.toCharArray();
	}
}
