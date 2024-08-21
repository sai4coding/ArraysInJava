package com.java.arrays;

public class MissingNumInArray {
public static void main(String[] args){
    int[] arr={1,3,4,5};
    int size=arr.length+1;
    int arraySum=0;
    for(int i=0;i<arr.length;i++){
        arraySum+=arr[i];
    }
    System.out.println(arraySum);
int sumOf_N_NaturalNumbers=size*(size+1)/2;

System.out.println("the missing number is:"+(sumOf_N_NaturalNumbers-arraySum));
}

}