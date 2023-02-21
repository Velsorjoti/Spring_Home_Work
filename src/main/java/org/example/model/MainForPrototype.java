package org.example.model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainForPrototype {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext contextOneHiHi = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Moto motik = contextOneHiHi.getBean("moto", Moto.class);
        Moto motusha = contextOneHiHi.getBean("moto", Moto.class);
        System.out.println(motik);
        System.out.println(motusha);
        System.out.println(motik == motusha);
        contextOneHiHi.close();
    }
}
