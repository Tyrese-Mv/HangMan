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
        final int MAX = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words of your choice!");
        String word = null;
        for (int i = 1; i <= MAX; i++){
            word = scanner.nextLine();
            fillWordList(word);
            System.out.println("Enter another word, choices " + (MAX - i) + " left.");
        }
        System.out.println("\nGet Ready to play.");
//        scanner.close();
    }

    private void fillWordList(String word){
        this.words.add(word);
    }

    public String wordPicker(){
        Random random = new Random();
        return this.words.get(random.nextInt(0,this.words.size()));
    }
}
