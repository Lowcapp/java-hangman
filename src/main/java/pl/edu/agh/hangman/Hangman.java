package pl.edu.agh.hangman;


import java.util.ArrayList;
import java.util.Scanner;

import java.util.Arrays;

import com.sun.tools.javac.util.List;


public class Hangman {

    public static final String[] HANGMANPICS = new String[]{
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========"
    };

    public static void main(String[] args) {
    	PuzzleFactory pz = new PuzzleFactory();
    	GuessChecker guessChecker = new GuessChecker();
        	
    	System.out.println(pz.getPuzzle());

    	ArrayList<String> guessletters = new ArrayList<String>();
    	
    	guessletters.add(guess());
    	guessletters.add(guess());
    	System.out.println(guessletters);

    	
    	guessChecker.checkGuess(pz.getPuzzle(), Arrays.asList(guessletters));
    	
    	
    	

    }



	public static String guess() {
		Scanner scanner = new Scanner(System.in);	
		String guess = "11";
		while (guess.length() != 1) {
			guess = scanner.next();
		}	
		return guess;
		}
}
