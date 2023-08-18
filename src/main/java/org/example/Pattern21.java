package org.example;

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {

        int n = 5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
             if(j<=i){
                 System.out.print("* ");
             }else{
                 System.out.print("  ");
             }

            }
            for (int j = 5; j >=1; j--) {
                if(j<=i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }

            System.out.println();

        }





        }
    }
