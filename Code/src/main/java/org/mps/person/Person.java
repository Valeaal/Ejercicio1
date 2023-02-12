package org.mps.person;


import java.util.*;

public class Person {

    private final String name;
    private final int age;
    private final String gender; //Male, Female

    public Person (String n, int a, String g){
        name = n;
        age = a;
        gender = g;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

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
