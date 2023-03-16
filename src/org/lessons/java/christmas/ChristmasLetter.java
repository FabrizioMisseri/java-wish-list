package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChristmasLetter {

    String name;
    String address;
    boolean moralConduct;
    List<String> christmasLetter;

    Random rand = new Random();

    // CONSTRUCTOR
    public ChristmasLetter(String name, String address, List<String> christmasLetter) {
        this.name = name;
        this.address = address;
        this.moralConduct = rand.nextBoolean();
        this.christmasLetter = christmasLetter;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<String> getChristmasLetter() {
        return christmasLetter;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setChristmasLetter(List<String> christmasLetter) {
        this.christmasLetter = christmasLetter;
    }

    // METHODS
    public void send(){
        if (christmasLetter.size() > 5){
            throw new RuntimeException("hai superato le 5 richieste. Non puoi...");
        }
        if (!moralConduct){
            throw new RuntimeException("sei cattivo non puoi inviare");
        }
        System.out.println("Caro Babbo Sassone sono " + name + "per natale vorrei:\n" + christmasLetter);
    }
}
