package org.example;

import java.util.Scanner;

public class Pattern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n-i ; j++) {

                    System.out.print("  ");
                }
            for (int j = 1; j < 2*i ; j++) {

                    System.out.print(val+" ");
                val++;
            }
                System.out.println();





        }
    }
}
