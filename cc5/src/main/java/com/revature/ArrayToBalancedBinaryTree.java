package com.revature;

import java.util.Arrays;

public class ArrayToBalancedBinaryTree {

    public static void main(String[] args) {
        int[] test1 = {5, 3, 2, 8, 9};
        ArrayToBalancedBinaryTree driver = new ArrayToBalancedBinaryTree();

        int[] result = driver.sortArray(test1);

        System.out.println(" Sorted: " + Arrays.toString(result));
        System.out.println("----------------------------");
        Node testTree = driver.convertToBalanceBinaryTree(result,0, result.length-1);
        System.out.println(testTree.toString());

    }

    public int[] sortArray(int[] array) {
        int temp;
        boolean switcher = false;


        while (switcher == false) {
            switcher = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    switcher = false;
                }
            }
        }

        return array;
    }

    public Node convertToBalanceBinaryTree(int[] array, int start, int end) {
        if (start > end) {
            return null;
        }

        int middle = (start + end) / 2;

        Node root = new Node(array[middle]);

        root.left = convertToBalanceBinaryTree(array, start, middle-1);
        root.right = convertToBalanceBinaryTree(array,middle+1, end);

        return root;
    }


    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
