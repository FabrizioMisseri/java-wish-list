package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<String> whishes = new ArrayList<>();
        boolean flagList = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ciao come ti chiami?");
        String name = scan.nextLine();
        System.out.println("Dove abiti?");
        String address = scan.nextLine();

        while(flagList){
            System.out.println("cosa desideri per natale?");
            String wish = scan.nextLine();
            whishes.add(wish);
            System.out.println("hai " + whishes.size() + " numero di richieste");
            System.out.println("decidi aggiungerne un altra? s/n");
            if(scan.nextLine().equalsIgnoreCase("n")) {
                flagList = !flagList;
            }
        }
        scan.close();
        Collections.sort(whishes);

        System.out.println("hai espresso i seguenti desideri: " + "\n" + whishes);

        ChristmasLetter letter = new ChristmasLetter(name, address, whishes);

        System.out.println();
        try {
            letter.send();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("SASSONE");

    }
}
