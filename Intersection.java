package com.java.arrays;
import java.util.Arrays;

public class Intersection {

        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4};
            int[] arr2 = {3, 4, 5, 6};

            int size=(arr1.length+arr2.length);
            int[] insertion=new int[size];
            int k=0;
            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr2.length;j++){
                    if(arr1[i]==arr2[j]) {

                        insertion[k]=arr2[j];
                    }
                }

            }
            System.out.println(Arrays.toString(insertion));

        }
    }

