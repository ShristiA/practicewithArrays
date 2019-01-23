package com.company;

public class ex9 {
    public static void main(String[] args) {
        int[]array1={1,7,6,5,9};
        int[]array2={2,7,6,3,4};
        for(int i=0;i<array1.length;i++){
          if(array1[i]==array2[i]){
              System.out.println("("+array1[i] +","+ array2[i]+")");
          }
        }
    }
}
