package com.java.arrays;

public class ReverseingArray {
    public static void main(String[] args){
        int[] arr={1,6,3,2};
        int size=arr.length;
        int temp=0;
        for(int i=0;i<size/2;i++){
             temp=arr[i];
             arr[i]=arr[size-1-i];
             arr[size-1-i]=temp;

        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
