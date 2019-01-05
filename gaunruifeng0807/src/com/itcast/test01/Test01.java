package com.itcast.test01;

import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
      int[] a = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            a[i] = random.nextInt(46)+5;
            System.out.print(a[i]);
        }
     getArr(a);
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i]);
        }
     }
   public static int[] getArr(int[] arr ){
       for (int i = 0; i < arr.length; i++) {
           if(arr[i]<20){
               arr[i] = 0;
           }
           else{
               continue;
           }
       }

       return arr;
   }

}
