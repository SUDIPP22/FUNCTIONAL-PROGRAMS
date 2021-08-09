package com.bridgelabz;

import java.util.Scanner;

public class Print2DArray {
    static Scanner sc = new Scanner(System.in);
    static void getArray(int X, int Y){
        int [] [] arr = new int[X][Y];
        for (int i=0; i<X;i++){
            for (int j=0; j<Y;j++){
                System.out.print("Enter The Value at : "+i+" "+j+" : ");      // for printing every position
                arr[i][j]= sc.nextInt();
            }
        }
        sc.close();
        // executing the array
        for (int i=0; i<X;i++) {
            for (int j = 0; j < Y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter The Row Size : ");
        int M = sc.nextInt();                                  // for row input
        System.out.println("Enter The Column Size : ");
        int N = sc.nextInt();                                // for column input
        getArray(M,N);
    }
}