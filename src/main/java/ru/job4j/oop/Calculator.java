package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + divide(a);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num = 10;

        int resultSum = sum(num);
        System.out.println(resultSum);

        int minusResult = minus(num);
        System.out.println(minusResult);

        int multiplyResult = calculator.multiply(num);
        System.out.println(multiplyResult);

        int divideResult = calculator.divide(num);
        System.out.println(divideResult);

        int sumAllOperationResult = calculator.sumAllOperation(num);
        System.out.println(sumAllOperationResult);
    }
}
