package com.bridgelabz;

public class SumOfThreeIntegers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -4, -3, -2, -1};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum == 0) {
                        count++;
                        System.out.println(arr[i] + " + " + arr[j] + " + " + arr[k] + " = " +0);
                    }
                }
            }
        }
        System.out.println("The number Of triplets count is : " + count);
    }
}