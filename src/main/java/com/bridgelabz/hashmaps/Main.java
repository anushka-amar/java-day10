package com.bridgelabz.hashmaps;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String str = "To be or not to be";
        String words[] = str.split("\\s+");

        MyHashMap hashmap = new MyHashMap(10);
        for (String word : words){
            hashmap.addWord(word.toLowerCase());
        }

        System.out.println("The frequency of words: ");
        hashmap.displayFreq();
    }
}
