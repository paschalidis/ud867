package com.example.android.wizardjokes;

import com.example.jokes.JokeSmith;

import java.lang.String;

public class JokeWizard {
    public String tellJoke(){
        JokeSmith jokeSmith = new JokeSmith();

        return "The Joker says " + jokeSmith.tellJoke();
    }
}
