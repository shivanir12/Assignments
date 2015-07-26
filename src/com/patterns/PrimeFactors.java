package com.patterns;

import java.util.Scanner;

public class PrimeFactors {
    private int n;
    public void prime(){
        System.out.println("Prime Factors");
        System.out.println("Enter the value if n");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int i;
        if(n==1)
            System.out.print("Prime Factor: " +n);
        else
        {
            while(n%2 == 0){
              System.out.print("2");
                n=n/2;
            }
            for(i=3; i<n; i+=2){
                while(n%i==0){
                    System.out.print(" "+i+" ");
                    n=n/i;
                }
            }
            if(n>2)
                System.out.print(" "+n+" ");
        }
        System.out.println();
    }
}
