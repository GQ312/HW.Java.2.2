package com.company;

public class Ogr extends Boss implements Printable {
    private String surname;
    private int amountHead;

    public Ogr(String surname, int amountHead) {
        this.surname = surname;
        this.amountHead = amountHead;
    }

    @Override
    public void print() {
        System.out.println("Surname: " + surname + ". Amount of heads: " + amountHead);
    }
}
