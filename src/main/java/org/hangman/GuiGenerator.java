package org.hangman;

import java.util.HashMap;

public class GuiGenerator {
    private HashMap<Integer,String> lives = new HashMap<>();

    public GuiGenerator(){
        setLives();
    }

    private void setLives(){
        this.lives.put(
                0,
                """
                        ------------
                       |            |
                       |            |
                       |            O
                       |            |
                       |           /|\\
                       |           / \\
                       |
                       |_______________________""");

        this.lives.put(
                1,
                """
                        ------------
                       |            |
                       |            |
                       |            O
                       |            |
                       |           /|\\
                       |             \\
                       |
                       |_______________________""");

        this.lives.put(
                2,
                """
                        ------------
                       |            |
                       |            |
                       |            O
                       |            |
                       |           /|\\
                       |
                       |
                       |_______________________""");

        this.lives.put(
                3,
                """
                        ------------
                       |            |
                       |            |
                       |            O
                       |            |
                       |            |\\
                       |
                       |
                       |_______________________""");


        this.lives.put(
                4,
                """
                        ------------
                       |            |
                       |            |
                       |            O
                       |            |
                       |
                       |
                       |
                       |_______________________""");

        this.lives.put(
                5,
                """
                        ------------
                       |            |
                       |            |
                       |
                       |
                       |
                       |
                       |
                       |_______________________""");
    }

    public String getArt(int currentLives){
        return  this.lives.get(currentLives);
    }
}
