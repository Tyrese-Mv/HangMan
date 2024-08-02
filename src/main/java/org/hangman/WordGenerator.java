package org.hangman;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordGenerator {
    private ArrayList<String> words;

    public WordGenerator(){
        this.words =  new ArrayList<>();
        GenerateRandomWords();
    }

    public void GenerateRandomWords(){
        Scanner scanner = new Scanner(System.in);
        String word = null;
        for (int i = 1; i < 4; i++){
            word = scanner.nextLine();
            fillWordList(word);
        }
    }

    private void fillWordList(String word){
        this.words.add(word);
    }

    public String wordPicker(){
        Random random = new Random();
        return this.words.get(random.nextInt(0,this.words.size()));
    }
}
