package org.example;

public class Pattern29 {
    public static void main(String[] args) {
        int n = 5;
        int nsp=4;
        int nst=1;
        for (int i = 0; i <n; i++) {
            int num=i+1;
            for (int j = 0; j < nsp ; j++) {
                    System.out.print("  ");
                }
            for (int j = 0; j <nst ; j++) {
                //System.out.print(num+" ");
                if(j==0 || j==nst-1){
                    System.out.print(num+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
            nsp--;
            nst+=2;
        }
    }
}
