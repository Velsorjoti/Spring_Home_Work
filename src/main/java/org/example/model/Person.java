package org.example.model;


import java.util.Objects;

public class Person {
    private Car car;

    public Person(Car car) {
        this.car = car;
    }

    public void sitdown() {
        System.out.println("Владелец сел на автомобиль");
        car.go();
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(car, person.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car);
    }

    @Override
    public String toString() {
        return "Person{" +
                "car=" + car +
                '}';
    }

}
