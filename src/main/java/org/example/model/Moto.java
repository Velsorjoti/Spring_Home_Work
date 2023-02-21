package org.example.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Moto implements Transport{
    @Override
    public void go() {
        System.out.println("Вжжжжж");
    }

    @PostConstruct
    public void init() {
        System.out.println("Иницирую.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Разрушаю");
    }
}
