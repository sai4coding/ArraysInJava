package com.java.arrays;
import java.util.Scanner;
import java.util.Arrays;
public class MinLengthArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] st=new String[5];
        for(int i=0;i<5;i++){
            st[i]=sc.next();
        }
        System.out.println(Arrays.toString(st));


        String maxString=st[0];
        for(int i=0;i<5;i++){
            if(st[i].length()>maxString.length()){
                maxString=st[i];


            }

        }
        System.out.println(maxString);
    }


}
