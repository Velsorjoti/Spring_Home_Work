package org.example.model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
//    Car mashinka = new Car();
//       mashinka.go();

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        Person pers = context.getBean("customPerson", Person.class);
//      pers.sitdown();
//        context.close();
//        context.close();
//        context.close();

//        ClassPathXmlApplicationContext contextOne = new ClassPathXmlApplicationContext("applicationContext2.xml");
//        Car mashinka = contextOne.getBean("customCar", Car.class);
//        Car mashinochka = contextOne.getBean("customCar", Car.class);
//        System.out.println(mashinka == mashinochka);
//        System.out.println(mashinka);
//        System.out.println(mashinochka);
//        contextOne.close();
//
//        ClassPathXmlApplicationContext contextTwo = new ClassPathXmlApplicationContext("applicationContext.xml");
//               Car mashinunya = contextTwo.getBean("customCar", Car.class);
//        Car mashinisha = contextTwo.getBean("customCar", Car.class);
//        System.out.println(mashinunya == mashinisha);
//        System.out.println(mashinunya);
//        System.out.println(mashinisha);
//        contextTwo.close();

//               ClassPathXmlApplicationContext contextThree = new ClassPathXmlApplicationContext("applicationContext2.xml");
//        Car mashinyka = contextThree.getBean("customCar", Car.class);
//        Car mashunya = contextThree.getBean("customCar", Car.class);
//        mashinyka.go();
//        mashunya.go();
//        contextThree.close();

        ClassPathXmlApplicationContext contextFour = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Moto moto = contextFour.getBean("moto", Moto.class);
        moto.go();
        contextFour.close();

        ClassPathXmlApplicationContext contextFive = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = contextFive.getBean("person", Person.class);
        person.sitdown();
        contextFive.close();

        ClassPathXmlApplicationContext contextSix = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person personaj = contextSix.getBean("person", Person.class);
        personaj.sitdown();

        ClassPathXmlApplicationContext contextOneVersionTwoZero = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Car mashinka = contextOneVersionTwoZero.getBean("car", Car.class);
        Car mashinochka = contextOneVersionTwoZero.getBean("car", Car.class);
        System.out.println(mashinka == mashinochka);
        System.out.println(mashinka);
        System.out.println(mashinochka);
        contextOneVersionTwoZero.close();
        contextOneVersionTwoZero.close();
    }
}
