package com.brainacad;

/**
 * Тут пользователю в консоль выводитьься площадь круга и длина круга;
 */

public class Circle {
    private  int cost;
    public static double radius;
    public static double square;
    public static String color;
    private double length;
    private int diameter;

    public Circle (int radius, int cost , int square, int length, int diameter){
        this.radius = radius;
        this.square = square;
        this.square =  (Math.PI * radius * radius);
        this.length = length;
        this.length =  (2 * Math.PI * radius);
        this.diameter = diameter;
        this.cost = cost;


    }

    public Circle() {

    }

//    public static void main(String[] args) {
////        System.out.println("Площадь = " + square);
////        System.out.println("Радиус = " + radius);
////        System.out.println("Цвет  : " +  color);
//    }
}
