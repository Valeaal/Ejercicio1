package org.mps.person;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void TestNombre() {
        Person person = new Person("John Doe", 30, "Male");
        assertEquals("John Doe", person.getName());
    }

    @Test
    void TestEdad() {
        Person person = new Person("Jane Doe", 25, "Female");
        assertEquals(25, person.getAge());
    }

    @Test
    void TestGenero() {
        Person person = new Person("John Doe", 30, "Male");
        assertEquals("Male", person.getGender());
    }

    @Test
    void TestEdadNormal() {
        Person p1 = new Person("John", 25, "Male");
        Person p2 = new Person("Jane", 22, "Female");
        Person p3 = new Person("Jim", 30, "Male");
        Person p4 = new Person("Joan", 28, "Female");
        Person p5 = new Person("Jack", 32, "Male");
        Person p6 = new Person("Jill", 24, "Female");

        List<Person> people = Arrays.asList(p1, p2, p3, p4, p5, p6);

        double [] avgAges = p1.averageAgePerGender(people);
        assertEquals(29.0, avgAges[0], 0.1);
        assertEquals(24.67, avgAges[1], 0.1);
    }

    
}