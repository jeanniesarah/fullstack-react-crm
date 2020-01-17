package com.fullstack.react.image;

public class ProxyDesignPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        image.display();
        System.out.println("Image will be loaded from disk");

        image.display();
        System.out.println("Image won't be loaded from disk");
    }
}

