package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {

    private String name;
    private String surname;
    private int groupNumber;
    LocalDate dateOfReceipt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public LocalDate getDateOfReceipt() {
        return dateOfReceipt;
    }

    public void setDateOfReceipt(int year, int month, int dayOfMonth) {
        this.dateOfReceipt = LocalDate.of(year, month, dayOfMonth);
    }
}
