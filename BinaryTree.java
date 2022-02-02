package com;

public class BinaryTree {
    public Node root;
    public class Node{
        public Node left;
        public Node right;
        int data;

        Node(int value){
            left=null;
            right=null;
            data=value;
        }
    }
    public BinaryTree(int value){
        root=new Node(value);
    }

    public void insertLeft(Node r,int value){
        Node newNode=new Node(value);
        r.left=newNode;
    }

    public void insertRight(Node r,int value){
        Node newNode=new Node(value);
        r.right=newNode;
    }

    public static void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    public static void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
}


//MAin

package com.dhas;
import com.BinaryTree;

import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        BinaryTree binaryTree=new BinaryTree(10);
        binaryTree.insertLeft(binaryTree.root,5);
        binaryTree.insertRight(binaryTree.root,15);

        binaryTree.insertLeft(binaryTree.root.left,3);
        binaryTree.insertRight(binaryTree.root.left,8);
        binaryTree.insertLeft(binaryTree.root.right,12);

        binaryTree.preOrder(binaryTree.root);
        System.out.println();
        binaryTree.inOrder(binaryTree.root);
        System.out.println();
        binaryTree.postOrder(binaryTree.root);


    }
}
