package com.example;

import java.util.Random;

public class SayJoke {
    private String[] jokes;
    private Random random;

    public SayJoke() {
        jokes = new String[3];
        jokes[0] = "Joke 1";
        jokes[1] = "Joke 2";
        jokes[2] = "Joke 3";
        random = new Random();
    }

    public String[] getJokes() {
        return jokes;
    }

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }
}
