package org.mps.person;


import java.util.*;

/**
 * Esta clase representa una persona con un nombre, edad y género.
 *
 * @author Álvaro Valencia
 * @version 1.0
 */
public class Person {

    private final String name;
    private final int age;
    private final String gender; //Male, Female

    /**
     * Crea una nueva instancia de la clase Person con un nombre, edad y género.
     *
     * @param n El nombre de la persona
     * @param a La edad de la persona
     * @param g El género de la persona (Male o Female)
     */
    public Person (String n, int a, String g){
        name = n;
        age = a;
        gender = g;
    }
    /** El nombre de la persona */
    public String getName() {
        return name;
    }

    /** La edad de la persona */
    public int getAge() {
        return age;
    }

    /** El género de la persona (Male o Female) */
    public String getGender() {
        return gender;
    }

    /**
     * Este método calcula el promedio de edad por género en una lista de personas.
     *
     * @param lista Lista de personas a procesar
     * @return Array con dos elementos, el promedio de edad de hombres y mujeres en la lista. Si no hay hombres o mujeres en la lista, el promedio será 0.
     */
    public double [] averageAgePerGender(List<Person> lista){
        int hombres = 0;
        int mujeres = 0;
        int edadhombres = 0;
        int edadmujeres = 0;
        for (Person act : lista) {
            if(act.gender.equals("Male")){
                hombres++;
                edadhombres += act.age;
            } else{
                mujeres++;
                edadmujeres += act.age;
            }
        }

        double avgAgeHombres = hombres == 0 ? 0 : (double) edadhombres/hombres;
        double avgAgeMujeres = mujeres == 0 ? 0 : (double) edadmujeres/mujeres;

        double res[] = {avgAgeHombres, avgAgeMujeres};
        return res;
    }

}
