package com.example.android.a402_javalibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.wizardjokes.JokeWizard;
import com.example.jokes.JokeSmith;

public class MainActivity extends AppCompatActivity {

    private TextView manulView;
    private TextView wizardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manulView = findViewById(R.id.manualJoke);

        JokeSmith jokeSmith = new JokeSmith();

        manulView.setText(jokeSmith.tellJoke());


        wizardView = findViewById(R.id.wizardJoke);


        JokeWizard jokeWizard = new JokeWizard();
        wizardView.setText(jokeWizard.tellJoke());
    }
}
