package com.java.arrays;
import java.util.Scanner;
import java.util.Arrays;
class ArrayAverage{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] marks=new int[size];
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(marks));
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum=sum+marks[i];

        }
        System.out.println(sum);
        float average=(float) sum/size;
        System.out.println(average);
    }
}