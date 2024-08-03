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
        for (int i = 0; i <= selectedWord.length() - 1; i++) {
            placeHolder.append(i == num ? selectedWord.charAt(i) : '_');
        }
        return placeHolder.toString();
    }

    public boolean revealCorrectChar(char letter){
        StringBuilder updateClueWord = new StringBuilder();
        boolean hasChanged = false;
        for (int i = 0; i < this.clueWord.length(); i++){
            updateClueWord.append(this.selectedWord.charAt(i) == letter  ? letter : this.clueWord.charAt(i));
            if (this.selectedWord.charAt(i) == letter){
                hasChanged = true;
            }
        }
        this.clueWord = updateClueWord.toString();
        return hasChanged;
    }

    public String ClueWord() {
        return this.clueWord;
    }

    public boolean allMatch(){
        for (int i = 0; i < this.clueWord.length(); i++){
            if (this.clueWord.charAt(i) == '_'){
                return false;
            }
        }
        return true;
    }

    public String getSelectedWord() {
        return this.selectedWord;
    }
}
