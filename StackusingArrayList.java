package com.dhas;

public class ArrayStack<T> {     //Generics
    static final int maxSize=11;
    T arr[]=(T[]) new Object[maxSize];     //int arr[]=new int[12];  must change to this for generics
    int top;   //no. 0f elements it has

    void ArrayStack(){
        top=0;    //intially no of elements is zero
    }

    public void push(T value){
        if(top==maxSize){
            throw new IndexOutOfBoundsException();
        }
        arr[top]=value;
        top+=1;
    }

    public void pop(){
        if(top==0){
            throw new IndexOutOfBoundsException();
        }
        System.out.println(arr[top-1]);
        top=top-1;
    }

    public void peek(){
        if(top==0){
            throw new IndexOutOfBoundsException();
        }
        System.out.println(arr[top-1]);
    }

}
