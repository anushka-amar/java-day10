package com.bridgelabz.binarysearchtrees;

public class Main {

    public static void main(String[] args) {
        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
        bst.add(56);
        bst.add(30);
        bst.add(70);

        System.out.println("In-order Traversal:");
        bst.inOrderTraversal();
    }

}
