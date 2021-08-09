package com.bridgelabz;

import java.util.Scanner;

public class EuclideanDistance {
    static void checkDistance(int m, int n) {
        double product = Math.sqrt((Math.pow(m, 2) + (Math.pow(n, 2))));
        System.out.println("The Euclidean Distance is : " + product);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The first point : ");
        int x = sc.nextInt();
        System.out.println("Enter The Second Point : ");
        int y = sc.nextInt();
        checkDistance(x, y);
        sc.close();
    }
}