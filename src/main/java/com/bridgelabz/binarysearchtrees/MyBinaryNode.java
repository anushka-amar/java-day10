package com.bridgelabz.binarysearchtrees;

public class MyBinaryNode<K extends Comparable<K>>implements INode<K>{
    private K key;
    private INode<K> left;
    private INode<K> right;

    public MyBinaryNode(K key){
        this.key = key;
        this.left = null;
        this.right = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public INode<K> getLeft() {
        return left;
    }

    @Override
    public INode<K> getRight() {
        return right;
    }

    @Override
    public void setLeft(INode<K> left) {
        this.left = left;
    }

    @Override
    public void setRight(INode<K> right) {
        this.right = right;
    }
}
