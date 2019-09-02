package com.brainacad;
/**
 *  В классе пицца проинициолизированы поля,также тут поключен обьект из класса серкл.
 */


public class Pizza {
    private String basis;
    private String compositions;
    private String name;
    private String cost;

    public Pizza(String c, String b, String n, String comp) {
        Circle diameter = new Circle();
        basis = b;
        compositions = comp;
        name = n;
        cost = c;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "основа ='" + basis + '\'' +
                ", состав ='" + compositions + '\'' +
                ", название ='" + name + '\'' +
                ", цена ='" + cost + '\'' +
                '}';
    }
}

