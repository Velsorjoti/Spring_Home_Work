package org.example.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class Car implements Transport{
    @Override
    public void go() {
        System.out.println("Врум, врум");
    }

    @PostConstruct
    public void init() {
        System.out.println("Меня заставили написать этот метод для домашнего задания.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Халк, крушить, разрушать!");
    }

    @Override
    public String toString() {
        return "Car{}";
    }
}
