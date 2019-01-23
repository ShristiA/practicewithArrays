package com.company;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
//        int[]array = new int[9];
//        int sum =0;
//        for(int i = 0; i< array.length; i++){
//            array[i]=i;
//            sum = sum+i;
//        }
//        System.out.println(sum);
        Scanner sc = new Scanner(System.in);

        int sum =0;
        int avg = 0;
        int[]array = new int[5];
        System.out.println("Enter 10 numbers");

        for(int i = 0; i< array.length;i++){
            array[i] = sc.nextByte();
            sum = sum+array[i];
            avg = sum/10;

        }
        System.out.println("Sum from usersinput is" + sum);
        System.out.println("Average of Arraylist"+avg);
    }
}
