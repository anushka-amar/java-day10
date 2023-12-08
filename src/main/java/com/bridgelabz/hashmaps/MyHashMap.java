package com.bridgelabz.hashmaps;

import java.util.LinkedList;

public class MyHashMap {
    private int size;
    private LinkedList<MyMapNode>[] buckets; //array in which each element is a ll that stores key-val pairs;

    public MyHashMap(int size){
        this.size = size;
        this.buckets = new LinkedList[size]; //the buckets array is assigned with an arr of new LL.
        initializebuckets();
    }

    /* method to initialize each
      element in the array with a new linkedlist */
    private void initializebuckets(){
        for (int i=0; i<size; i++){
            buckets[i] = new LinkedList<>(); //each element is a bucket that holds a new linkedlist
        }
    }

    /* method to hash the key value
     and get the index based on it */
    private int getBucketIndex(String key){
        int hashCode = key.hashCode();
        return Math.abs(hashCode)%size;
    }

    /* retrieves ll at a specified index
     passing the linked list and key to get a particular node in a ll
     if node exists, increment freq.
     else create a new node of type MyMapNOde and set the value */
    public void addWord(String key){
        int bucketidx = getBucketIndex(key);
        LinkedList<MyMapNode> bucket = buckets[bucketidx];

        MyMapNode node = getNodeByKey(bucket, key);
        if (node==null){
            bucket.add(new MyMapNode(key, 1));
        }else {
            node.setValue(node.getValue()+1);
        }
    }

    /* method to remove a prticular word from
     hash-table */
    public void removeWord(String word){
        int bucketidx = getBucketIndex(word); //reteives index at a particular index
        LinkedList<MyMapNode> bucket = buckets[bucketidx];

        MyMapNode node =  getNodeByKey(bucket, word);
        if(node != null){
            bucket.remove(node);
            return;
        }
        else {
            System.out.println("Node does not exist");
        }
    }

    private MyMapNode getNodeByKey(LinkedList<MyMapNode> bucket, String key){
        for(MyMapNode node: bucket){
            if(node.getKey().equals(key)){
                return node;
            }
        }
        return null;
    }

    public void displayFreq(){
        for(int i=0; i<size; i++){
            LinkedList<MyMapNode> bucket = buckets[i];
            for(MyMapNode node : bucket){
                System.out.println(node.getKey()+ ": "+node.getValue());
            }
        }
    }
}
