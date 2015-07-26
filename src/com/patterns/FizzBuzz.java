package com.patterns;


public class FizzBuzz {
    private int n;
    public void fizzBuzz() {
        System.out.println("-------------------------------------------------");
        System.out.println("Fizzzzzzzzzzzz Buzzzzzzzzzzzzzz");
        n =100;
        for(int i=0;i<n;i++){
            if(i % 3 == 0 && i % 5 ==0)
                System.out.println("FizzBuzz");
            else if(i%3 == 0){
                System.out.println("Fizz");
            }
            else if(i%5 == 0){
                System.out.println("Buzz");
            }
            System.out.println(i);
        }
    }
}
