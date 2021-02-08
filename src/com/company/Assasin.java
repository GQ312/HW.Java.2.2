package com.company;

public class Assasin extends Boss implements Printable {
    private String name;
    private int damage;

    public Assasin (String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name + ". Damage: " + damage);

    }
}
