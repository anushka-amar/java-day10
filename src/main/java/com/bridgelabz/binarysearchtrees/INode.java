package com.bridgelabz.binarysearchtrees;

public interface INode <K extends Comparable<K>>{
    K getKey();
    INode<K> getLeft();
    INode<K> getRight();
    void setLeft(INode<K> left);
    void setRight(INode<K> right);


}
