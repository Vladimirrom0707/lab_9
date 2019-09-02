package com.brainacad;
import java.util.Scanner;

/**
 * В классе пиццерия класс с массивами, пользователю в консоль выводится информация о пяти пиццах, ну и как бы этот мэйн метод.
 */

public class Pizzeria {

    public static void main(String[] args) {
        Pizza[] pizza = new Pizza[5];
        pizza[0] = new Pizza("14$","цвет корочки выберите сами","Четыре сыра","сплошной сыр");
        pizza[1] = new Pizza("12$","цвет корочки выберите сами","Гавайская","аннасы и чето еще");
        pizza[2] = new Pizza("14$","цвет корочки выберите сами","Четыре сезона","Соус и помидоры и чето еще");
        pizza[3] = new Pizza("11$","цвет корочки выберите сами","Маргарита","томатный или сливочный соус и чето еще");
        pizza[4] = new Pizza("14$","цвет корочки выберите сами","Сицилийская","самое классное что тут есть это квадратная форма а так как всегда обычный соус с овощами ");

        for (int i = 0; i < pizza.length; i++) {
            System.out.println(pizza[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диаметр пиццы : ");
        int radius = scanner.nextInt();
        System.out.println("Введите цвет корочки теста : ");
        String color = scanner.next();

    }

}
