package org.martin.tigerdb.test;

import java.io.Serializable;

/**
 *
 * @author martin
 */
public class Persona implements Serializable{
    private int edad;
    private String name;

    public Persona(int edad, String name) {
        this.edad = edad;
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", name=" + name + '}';
    }
        
}
