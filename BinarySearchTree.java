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

    public void insert(int value){
        insert(root,value);
    }

    public Node insert(Node root, int value){
        if(root==null){
            Node newNode=new Node(value);
            return newNode;
        }
        if(value<root.data){
           root.left= insert(root.left,value);
        }else{
            root.right =insert(root.right, value);
        }
        return root;
    }

    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    public Node search(Node root,int value){
        if(root==null || root.data==value){
            return root;
        }
        if(value<root.data){
            return search(root.left,value);
        }else{
           return search(root.right,value);
        }
    }
}
