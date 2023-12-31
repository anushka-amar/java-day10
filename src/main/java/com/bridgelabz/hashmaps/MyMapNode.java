package com.bridgelabz.hashmaps;


/* creating a class mapNode that stores
   key-val pairs inside linkedList for hashmap */

public class MyMapNode {
    private String key;
    private int value;

    public MyMapNode(String key, int value){
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
