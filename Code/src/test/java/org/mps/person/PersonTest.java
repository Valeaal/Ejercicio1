package org.mps.person;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**

 Clase PersonTest para probar la clase Person
 Esta clase contiene métodos que permiten probar los métodos de la clase Person.
 Se incluyen pruebas para verificar el nombre, la edad y el género de una persona, así como
 la media de edad por género en una lista de personas.
 */
class PersonTest {

    /**
     Método que prueba el método getName de la clase Person
     Este método crea una persona y verifica que su nombre sea el esperado.
     */
    @Test
    void TestNombre() {
        Person person = new Person("John Doe", 30, "Male");
        assertEquals("John Doe", person.getName());
    }

    /**
     Método que prueba el método getAge de la clase Person
     Este método crea una persona y verifica que su edad sea la esperada.
     */
    @Test
    void TestEdad() {
        Person person = new Person("Jane Doe", 25, "Female");
        assertEquals(25, person.getAge());
    }

    /**
     Método que prueba el método getGender de la clase Person
     Este método crea una persona y verifica que su género sea el esperado.
     */
    @Test
    void TestGenero() {
        Person person = new Person("John Doe", 30, "Male");
        assertEquals("Male", person.getGender());
    }

    /**
     Método que prueba el método averageAgePerGender de la clase Person
     Este método crea una lista de personas y verifica que la media de edad por género sea la esperada.
     */
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

    /**
     Método que prueba el método averageAgePerGender cuando no hay hombres en la lista
     Este método crea una lista de mujeres y verifica que la media de edad de los hombres sea 0
    */
    @Test
    public void testNoHombres() {
        List<Person> people = new ArrayList<>();
        Person p1 = new Person("Jane", 22, "Female");
        Person p2 = new Person("Joan", 28, "Female");
        Person p3 = new Person("Jill", 24, "Female");

        List<Person> people2 = Arrays.asList(p1, p2, p3);

        double [] avgAges = p1.averageAgePerGender(people2);
        assertEquals(0.0, avgAges[0], 0.1);
        assertEquals(24.67, avgAges[1], 0.1);
    }

    /**
     Método que prueba el método averageAgePerGender cuando no hay mujeres en la lista
     Este método crea una lista de hombres y verifica que la media de edad de las mujeres sea 0
     */
    @Test
    public void testNoMujeres() {
        List<Person> people = new ArrayList<>();
        Person p1 = new Person("Jane", 22, "Male");
        Person p2 = new Person("Joan", 28, "Male");
        Person p3 = new Person("Jill", 24, "Male");

        List<Person> people2 = Arrays.asList(p1, p2, p3);

        double [] avgAges = p1.averageAgePerGender(people2);
        assertEquals(24.67, avgAges[0], 0.1);
        assertEquals(0.0, avgAges[1], 0.1);
    }
}