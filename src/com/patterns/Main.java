package com.patterns;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.printOneAsterisk();
        triangle.printVerticalLine();
        triangle.printHorizontalLine();
        triangle.printRightTriangleLine();

        Diamond diamond = new Diamond();
        diamond.isocelesTriangle();
        diamond.centeredDiamond();
        diamond.diamondWithNameInCenter();

        PrimeFactors primeFactors = new PrimeFactors();
        primeFactors.prime();

        FizzBuzz fizz = new FizzBuzz();
        fizz.fizzBuzz();
    }
}
