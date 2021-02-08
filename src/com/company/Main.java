package com.company;

public class Main {
    public static void createObject(String classNme) {
        switch (classNme) {
            case "Ogr":
                Ogr ogr = new Ogr("Ogrovich", 23);
                break;

            case "Assasin":
                Assasin assasin = new Assasin("Assassin", 44);
                break;

            case "Magic":
                Magic magic = new Magic("Iceberg", 55);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + classNme);
        }
    }
    public static void main(String[] args) {

        createObject("Ogr");
        createObject("Assasin");
        createObject("Magic");

        ogr.print();
        assasin.print();
        magic.print();

//Как сделать ссылки? Как вызватьь метод print()?

    }


}
