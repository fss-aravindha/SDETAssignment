package com.fss.sdet.day1.Assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayPrograms {

    public void AddIntArray(int length) {
        int arr[] = new int[length];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Value for index:" + i);
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // Approach I >> Adding an Array
        // ArrayOfIntegers a = new ArrayOfIntegers();
        // a.AddIntArray(3);
        // // Approach II
        Integer  b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(b));

        // Sum and Average
        int sum;
        float average;
        sum = 0;
        average = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];

        }
        average = (float) sum / b.length;
        System.out.println("Average:" + average);

        // Reversing Array
        System.out.println(Arrays.toString(b));

        Collections.reverse(Arrays.asList(b));
        System.out.println("Reversed Array: " + Arrays.toString(b));

        //Largest & Smallest Value in Array
        int largest = b[0];
        int smallest = b[0];

        
        for (int i = 1; i < b.length; i++) {
            if (b[i] > largest) {
                largest = b[i];
            }
            if (b[i] < smallest) {
                smallest = b[i];
            }
        }
        System.out.println("Largest value: " + largest);
        System.out.println("Smallest value: " + smallest);



    }

}
