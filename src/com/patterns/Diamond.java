package com.patterns;

import java.util.Scanner;

public class Diamond {
    private int n;
    public void isocelesTriangle(){
        System.out.println("Enter the value if n");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.println("Print Isoceles triangle");
        System.out.println("------------------------------------------------------------------");
        int t=n;
        for (int i = 0; i <= n; i++) {
            for(int j=1; j<t+1; j++)
                System.out.print("  ");
            t--;
            for(int k=1;k<=2*i-1;k++)
                System.out.print(" *");
            System.out.println();
        }
    }
    public void centeredDiamond(){
        System.out.println("Enter the value if n");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.println("Print centered Diamond");
        System.out.println("------------------------------------------------------------------");
        int t=n;
        for (int i = 0; i <= n; i++) {
            for(int j=1; j<t+1; j++)
                System.out.print("  ");
            t--;
            for(int k=1;k<=2*i-1;k++)
                System.out.print(" *");
            System.out.println();
        }

        for (int i = n-1; i >= 1; i--) {
            for(int j=n; j>i; j--)
                System.out.print("  ");
            for(int k=1;k<i*2;k++)
                System.out.print(" *");
            System.out.println();
        }
    }

    public void diamondWithNameInCenter(){
        System.out.println("Enter the value if n");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.println("Print centered Diamond");
        System.out.println("------------------------------------------------------------------");
        int t=n;
        for (int i = 0; i <n; i++) {
            for(int j=1; j<t+1; j++)
                System.out.print("  ");
            t--;
            for(int k=1;k<=2*i-1;k++)
                System.out.print(" *");
            System.out.println();
        }
        System.out.println("S H I V A N I");

        for (int i = n-1; i >= 1; i--) {
            for(int j=n; j>i; j--)
                System.out.print("  ");
            for(int k=1;k<i*2;k++)
                System.out.print(" *");
            System.out.println();
        }
    }
}
