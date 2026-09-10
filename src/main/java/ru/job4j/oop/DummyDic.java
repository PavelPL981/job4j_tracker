package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String result = "Неизвестное слово: " + eng;
        return result;
    }

    public static void main(String[] args) {
        DummyDic d = new DummyDic();
        String result = d.engToRus("word");
        System.out.println(result);
    }
}
