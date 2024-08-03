package org.hangman;

import java.io.IOException;

public class WordGenerator {

    public WordGenerator(){}

    public String wordPicker() throws IOException {
        return new GetWord().getSelectedWord();
    }
}
