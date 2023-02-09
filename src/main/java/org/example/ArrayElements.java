package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElements {
    public static void main(String[] args) {
//        ArrayElements.printEnteredArrayElements();
//        ArrayElements.printLengthOfArray();
//        ArrayElements.findEvenAndOdd();
//        ArrayElements.EvenOddNumbers();
//        ArrayElements.findEvenAndOddNumbers();
//        ArrayElements.findEvenAndOddNumbersUsingSigUm();
//        ArrayElements.findAllNegativeNumbers();
//        ArrayElements.reverseAnArray();
//        ArrayElements.sumOfArrayElements();
//        ArrayElements.findMaxAndMinValues();
//         ArrayElements.findSecondLargest();

//        Integer age[] = new Integer[]{1, 2, 3, 4, 5, 6, 778,};
//        Collections.reverse(Arrays.asList(age));
//        System.out.println(Arrays.asList(age));


    }

    public static void findSecondLargest() {
        int secondLargest = 0;
        int[] score = {1, 3, 4, 9, 9, 75, 75, 74, 74};
        int size = score.length;
        Arrays.sort(score);
        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i] + " ");
        }
        for (int i = size - 2; i >= 0; i--) {
            if (score[i] != score[size - 1]) {
                secondLargest = score[i];
                break;
            }
        }
        System.out.println();
        System.out.println("secondlargest : " + secondLargest);
    }


    public static void findMaxAndMinValues() {
        int age[] = {1, 2, 3, 4, 5};
        int max = age[0];
        int min = age[0];
        for (int i = 0; i < age.length; i++) {
            if (age[i] > max) {
                max = age[i];
            } else if (age[i] < min) {
                min = age[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }


    public static void sumOfArrayElements() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size");
        int size = scanner.nextInt();
        System.out.println("enter the elements ");
        int elements[] = new int[size];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = scanner.nextInt();
            sum = sum + elements[i];

        }
        System.out.println(sum);
    }

    //java program to find size of entered array
    public static int[] printEnteredArrayElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int size = scanner.nextInt();
        int[] elements = new int[size];
        System.out.println("enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            elements[i] = scanner.nextInt();
        }
        System.out.println("array elements are :  ");
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        return elements;
    }

    //java program to find length of an array
    public static int[] printLengthOfArray() {
        int[] array = {1, 1, 2, 3, 4, 5, 6, 7, 88, 9};
        System.out.println(array.length);
        return array;
    }

    public static int[] findEvenAndOdd() {
        int evenCount = 0;
        int oddCount = 0;
        int[] array = {1, 2, 3, 5, 6, 4, 6, 4, 5, 6, 9,};
        for (int j : array) {
            if (j % 2 == 0) {
                System.out.println(j);
                evenCount++;
            } else
                oddCount++;
        }
        return array;
    }

    public static int[] EvenOddNumbers() {
        int evenCount = 0;
        int oddCount = 0;
        int[] array = {1, 1, 2, 3, 55, 6, 7, 3, 62, 45};
        for (int j : array) {
            if (j % 2 == 0) {
                System.out.println(j);
                System.out.println(" even count" + evenCount++);
            } else {
                oddCount++;
            }
        }
        return array;
    }

    public static void findEvenAndOddNumbers() {
        int negativeCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size = scanner.nextInt();
        int[] elements = new int[size];
        System.out.println("enter" + (size) + " elements: ");
        for (int i = 0; i < size; i++) {
            elements[i] = scanner.nextInt();
        }
        for (int element : elements) {
            if (element < 0) {
                negativeCount++;
            }
        }
        System.out.println("total count is " + negativeCount);

    }

    public static void findEvenAndOddNumbersUsingSigUm() {
        int negativeCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size = scanner.nextInt();
        Double[] elements = new Double[size];
        System.out.println("enter" + (size) + " elements: ");
        for (int i = 0; i < size; i++) {
            elements[i] = scanner.nextDouble();
        }
        for (Double element : elements) {
            if (Math.signum(element) == -1.0) {
                negativeCount++;
            }
        }
        System.out.println("total count is " + negativeCount);

    }

    public static double[] findAllNegativeNumbers() {
        double negativeNumbers = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size = scanner.nextInt();
        System.out.println("enter elements");
        Double[] elements = new Double[size];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = scanner.nextDouble();
        }
        for (int i = 0; i < elements.length; i++) {
            if (Math.signum(elements[i]) < 1.0) {
                System.out.println("negative elements are : " + elements[i]);
            }
        }
        return new double[0];
    }

    public static int[] reverseAnArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = scanner.nextInt();
        System.out.println("enter any" + (size) + "elements");
        int[] elements = new int[size];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = scanner.nextInt();
        }
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(elements[i]);
        }
        return elements;
    }
}
