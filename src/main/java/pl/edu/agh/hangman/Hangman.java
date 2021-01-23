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
    	GameStatus status = new GameStatus();
        	
    	System.out.println(pz.getPuzzle());

    	ArrayList<String> guessLetters = new ArrayList<String>();
    	
//    	guessLetters.add(guess());
//   	guessLetters.add(guess());
    //	System.out.println(guessLetters);
//String stopped = "1";
    	

  //  	guessChecker.checkGuess(pz.getPuzzle(), guessLetters);

    //	guessChecker.checkGuess(pz.getPuzzle(), Arrays.asList("o"));
    //	status.printStatus("kot", Arrays.asList("o", "s"));
    	//ponizszy kod jest wlasciwy
    	System.out.println("Lets start!");
		System.out.println("Type a letter!");
    	
    	while (guess() != "0") {
    		guessLetters.add(guess());
    		System.out.println(guessLetters);
    		guessChecker.checkGuess(pz.getPuzzle(), guessLetters);
    		status.printStatus(pz.getPuzzle(), guessLetters);
    		
    	}
    	

    	
    	
    	

    }



	public static String guess() {
		Scanner scanner = new Scanner(System.in);	
		String guess = scanner.next();
		while (guess.length() != 1) {
			System.out.println("Wpisz jedna litere");
			guess = scanner.next();
		}	
		return guess;
		}
}
