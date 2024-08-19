package com.java.arrays;
import java.util.Scanner;
import java.util.Arrays;

public class MaxAndMin {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] array=new int[5];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(array));

        int maxElement=array[0];
        int minElement=array[0];

        for(int i=0;i<array.length;i++){
            if(array[i]>maxElement){
                maxElement=array[i];
            }
            else if(array[i]<minElement){
                minElement=array[i];

            }
        }
        System.out.println(maxElement);
        System.out.println(minElement);
    }
}
