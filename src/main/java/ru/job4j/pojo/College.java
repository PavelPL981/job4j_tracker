package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setSurname("Rembo");
        student.setGroupNumber(2204);
        student.setDateOfReceipt(2026, 9, 1);

        System.out.println("Имя студента: " + student.getName());
        System.out.println("Фамилия студента: " + student.getSurname());
        System.out.println("Номер группы: " + student.getGroupNumber());
        System.out.println("Дата поступления: " + student.getDateOfReceipt());
    }
}
