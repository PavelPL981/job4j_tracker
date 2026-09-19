package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int high) {
        return max(max(left, right), high);
    }

    public static int max(int left, int right, int high, int bottom) {
        return max(max(left, right), max(high, bottom));
    }
}
