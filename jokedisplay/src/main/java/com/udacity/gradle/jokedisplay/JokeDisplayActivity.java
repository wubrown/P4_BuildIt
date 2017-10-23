package com.udacity.gradle.jokedisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {
    public static final String JOKE_KEY = "jkey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        Intent intent = getIntent();
        String joke = intent.getStringExtra(JOKE_KEY);

        TextView textView = (TextView) findViewById(R.id.jokeTextView);
        textView.setText(joke);
    }
}
