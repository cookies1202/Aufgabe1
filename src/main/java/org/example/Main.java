package org.example;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        System.out.println("Das ist der erste test");

        ArrayList<Patient> patientenListe = new ArrayList<>();
        patientenListe.add(new Patient("001", 123456, "Anna", "Müller", LocalDate.of(1990, 5, 21)));
        patientenListe.add(new Patient("002", 234567, "Peter", "Schmidt", LocalDate.of(1985, 8, 12)));
        patientenListe.add(new Patient("003", 345678, "Laura", "Becker", LocalDate.of(1978, 12, 1)));

        Collections.sort(patientenListe);



        for (Patient patient : patientenListe) {
            System.out.println(patient);
        }


    }
    }
