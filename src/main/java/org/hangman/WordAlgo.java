package org.hangman;

import java.util.Random;

public class WordAlgo {
    private final String selectedWord;
    private String clueWord;

    public WordAlgo(String selectedWord){
        this.selectedWord = selectedWord;
        this.clueWord = StartClue(this.selectedWord);
    }

    private String StartClue(String selectedWord){
        Random random = new Random();
        StringBuilder placeHolder = new StringBuilder();
        int num = random.nextInt(0, selectedWord.length());
        for (int i = 0; i < selectedWord.length() - 1; i++) {
            placeHolder.append(i == num ? selectedWord.charAt(i) : '_');
        }
        return placeHolder.toString();
    }

    public void revealCorrectChar(char letter){
        StringBuilder updateClueWord = new StringBuilder();
        for (int i = 0; i < this.clueWord.length(); i++){
            updateClueWord.append(this.clueWord.charAt(i) == letter ? letter : '_');
        }
        this.clueWord = updateClueWord.toString();
    }

    public String ClueWord() {
        return this.clueWord;
    }
}
