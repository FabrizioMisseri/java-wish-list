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

        Collections.sort(whishes);
        System.out.println("hai espresso i seguenti desideri: " + "\n" + whishes);
    }
}
