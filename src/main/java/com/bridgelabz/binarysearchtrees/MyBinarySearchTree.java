package com.bridgelabz.binarysearchtrees;

import java.util.Scanner;

public class MyBinarySearchTree<T extends Comparable<T>>{

    private INode<T> root;

    public MyBinarySearchTree(){
        this.root = null;
    }

    public void add(T key) {
        this.root = addRecursive(root, key);
    }

    private INode<T> addRecursive(INode<T> currentNode, T key) {
        if (currentNode == null) {
            return new MyBinaryNode<>(key);
        }

        if (key.compareTo(currentNode.getKey()) < 0) {
            currentNode.setLeft(addRecursive(currentNode.getLeft(), key));
        } else if (key.compareTo(currentNode.getKey()) > 0) {
            currentNode.setRight(addRecursive(currentNode.getRight(), key));
        }

        return currentNode;
    }

    public void inOrderTraversal() {
        inOrderTraversalRecursive(root);
    }
    private void inOrderTraversalRecursive(INode<T> currentNode) {
        if (currentNode != null) {
            inOrderTraversalRecursive(currentNode.getLeft());
            System.out.print(currentNode.getKey() + " ");
            inOrderTraversalRecursive(currentNode.getRight());
        }
    }
}
