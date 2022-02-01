package com.dhas;

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        int arr[]={7,12,32,1,11,0,-1};

        for (int i=1;i<arr.length;i++){     //first loop for n-1 times in bubble sorting
            for (int j=0;j<arr.length-i;j++){     //n-i times should run
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}


