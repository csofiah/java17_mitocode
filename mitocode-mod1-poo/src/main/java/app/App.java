package app;

import model.Product;

public class App {

    public static void main(String[] args) {
        System.out.println("Hola coders");
        Product p1 = new Product("tv",12);
        System.out.println(p1.getName());
        System.out.println(p1.getPrice());
    }
}
