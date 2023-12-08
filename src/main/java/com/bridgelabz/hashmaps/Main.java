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

        System.out.println("The frequency of words in the string: ");
        hashmap.displayFreq();

        String paragraph = "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into paranoid avoidable situations";

        MyHashMap hashMap2 = new MyHashMap(20);
        String[] newWords = paragraph.split("\\s+");

        for (String word : newWords){
            hashMap2.addWord(word.toLowerCase());
        }

        System.out.println("\n\nThe frequency of words in the paragraph is:-");
        hashMap2.displayFreq();

        hashMap2.removeWord("avoidable");

        System.out.println("\n\nThe frequency of words in the paragraph after removal is:-");
        hashMap2.displayFreq();

    }
}
