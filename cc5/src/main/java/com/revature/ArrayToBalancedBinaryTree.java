package com.revature;

import java.util.Arrays;

public class ArrayToBalancedBinaryTree {

    public static void main(String[] args){
        int[] test1 = {5,3,2,8,9};
        int[] result = sortArray(test1);

       System.out.println(" Sorted: " +  Arrays.toString(result));


    }
    public static int[] sortArray(int[] array){
        int temp;
        boolean switcher = false;


        while(switcher ==false){
            switcher = true;
            for(int i =0; i<array.length-1 ; i++){
                if(array[i] > array[i+1]){
                    temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    switcher = false;
                }
            }
        }

        return array;
    }
    public static void convertToBalanceBinaryTree(int[] array){

    }
}
