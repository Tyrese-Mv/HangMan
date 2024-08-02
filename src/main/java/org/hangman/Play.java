package org.hangman;

import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        WordGenerator wordGen = new WordGenerator();

        WordAlgo game = new WordAlgo(wordGen.wordPicker());

        GuiGenerator hangman = new GuiGenerator();

        int lives = 5;
        Scanner scan = new Scanner(System.in);
        while(lives > 0){
            System.out.println(hangman.getArt(lives));
            System.out.println(game.ClueWord());
            System.out.println("Enter a letter: ");
            String word = scan.nextLine();
            if (word.length() > 1){
                System.out.println("Please enter only one letter!!!");
            } else if (game.revealCorrectChar(word.charAt(0))){
                System.out.println("Great, you got matching characters");
            } else{
                lives--;
                System.out.println(lives == 0 ? "Game over\n" + hangman.getArt(lives): "Wrong guess!!");
            }
            if (game.allMatch()){
                System.out.println("You have found all the hidden letters\nGame Over!!");
                break;
            }
        }
        scan.close();
    }
}