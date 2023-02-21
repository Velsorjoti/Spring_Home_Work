package org.example.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Objects;
@Component
public class Person {
    private Transport transport;
    @Autowired
    public Person( @Qualifier("car") Transport transport) {
        this.transport = transport;
    }

    public void sitdown() {
        System.out.println("Владелец сел на автомобиль");
        transport.go();
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(transport, person.transport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transport);
    }

    @Override
    public String toString() {
        return "Person{" +
                "transport=" + transport +
                '}';
    }
}
