package org.example.model;

public class Car {

    public void go() {
        System.out.println("Врум, врум");
    }

    public void init() {
        System.out.println("Меня заставили написать этот метод для домашнего задания.");
    }

    public void destroy() {
        System.out.println("Халк, крушить, разрушать!");
    }

    @Override
    public String toString() {
        return "Car{}";
    }
}
