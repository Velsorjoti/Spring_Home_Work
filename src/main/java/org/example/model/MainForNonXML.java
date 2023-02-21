package org.example.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainForNonXML {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Person person = context.getBean("newPerson", Person.class);
        person.sitdown();

    }
}
