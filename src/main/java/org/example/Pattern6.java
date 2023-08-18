package org.example;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=n-1;
        int space=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=space;j++){
                System.out.print("   ");
            }
            for(int j=0;j<=star;j++){
                System.out.print("*  ");

            }
            System.out.println();
            star--;
            space+=2;
        }

    }
}
