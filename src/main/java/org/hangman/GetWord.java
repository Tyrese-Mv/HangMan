package org.hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GetWord {
    /*
    * This will implement an API call (at a later stage) to get a random word from the internet
    * */

    private final String urlAPI = "https://random-word-api.herokuapp.com/word";
    private String selectedWord;
    public GetWord() throws IOException {
        connect();
    }

    private void connect() throws IOException {
        URL url = new URL(urlAPI);

        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("GET");

        int responseCode = con.getResponseCode();
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        this.selectedWord = response.substring(2, response.length()-2);
    }

    public String getSelectedWord() {
        return this.selectedWord;
    }

//    public static void main(String[] args) throws IOException {
//        GetWord word = new GetWord();
//    }
}
