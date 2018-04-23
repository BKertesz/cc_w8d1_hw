package com.codeclan.balazskertesz.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    WordCount wordCounter;
    EditText textField;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wordCounter = new WordCount();
        textField = (EditText) findViewById(R.id.editTextID);
        display = (TextView) findViewById(R.id.wordCountID);
    }


    public void countWords(View view){
        String myWordCount = textField.getText().toString();
        wordCounter.turnStringIntoArray(myWordCount);
        display.setText(wordCounter.wordCount());
    }





}
