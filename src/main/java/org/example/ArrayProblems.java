package org.example;

import java.util.Scanner;

public class ArrayProblems {
    public static void main(String[] args) {
        //ArrayProblems.insertElementAtEnd();
        //ArrayProblems.insertElementAtAnyLocation();
    }

    public static void copyArray() {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = {1, 2, 3, 4, 5, 6,};
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println("array1 elements are : ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("array2 elements are : ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }

    public static void insertElementAtAnyLocation() {
        int location, element, size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array");
        size = scanner.nextInt();//size=3 (0,1,2)
        int array[] = new int[size + 1];//(size = 4  )(10,20,30, _ )
        System.out.println("enter the elements of array : ");//( 10,20,30, )
        for (int i = 0; i <size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("enter the location that is to be inserted ");
        location = scanner.nextInt();
        System.out.println("enter the element to be inserted ");
        element = scanner.nextInt();
        for (int i = size; i > location; i--) {//
            array[i] = array[i - 1];
        }
        array[location] = element;
        size++;
        System.out.println("elements after adding new element : ");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

}

