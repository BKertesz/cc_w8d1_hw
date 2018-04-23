package com.codeclan.balazskertesz.wordcount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class WordCount {

    ArrayList<String> words;
    HashMap<Integer,String> wordHashMap;

    public WordCount(){
        words = new ArrayList<>();
        wordHashMap = new HashMap<>();

    }


    public String wordCount(){
        return Integer.toString(words.size());
    }

    public void turnStringIntoArray(String string){
        words = new ArrayList<>(Arrays.asList(string.split(" ")));
    }

}
