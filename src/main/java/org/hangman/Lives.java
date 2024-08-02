package org.hangman;

import java.util.Scanner;
/*
* Gonna improve and integrate the entire logic in the future
* */
public class Lives {
    private int Currentlives;

    public Lives(){
        this.Currentlives = setDifficulty();
    }

    private int setDifficulty(){
        final int DEFAULT = 6;
        System.out.println("1: Easy\n2: Normal\n 3: Hard\n4: Hardcore");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        switch (choice){
            case ("1") -> {
                return 5;
            }
            case ("2") -> {
                return 4;
            }
            case ("3") -> {
                return 3;
            }
            case ("4") -> {
                return 2;
            }
        }
        return DEFAULT;
    }
}
