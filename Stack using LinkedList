package com.dhas;

 class LinkedStack {
     Node head;
       class Node{
           int data;
           Node next;

           Node(int x){
               data=x;
               next=null;
           }
         }
     LinkedStack(){
           head=null;
     }

     public void push(int data){
           Node newNode=new Node(data);
              newNode.next=head;
               head=newNode;
     }

     void display(){
           Node temp=head;
           while (temp!=null){
               System.out.print(temp.data+" ");
               temp=temp.next;
           }
     }

     void pop(){
         if(head==null){
             throw new IndexOutOfBoundsException();
         }else{

             System.out.println(head.data);
             head=head.next;
         }
     }

     void peek(){
         if(head==null){
             throw new IndexOutOfBoundsException();
         }else{

             System.out.println(head.data);
         }
     }

}
