package org.example;

import java.util.Comparator;

public class NameComparator implements Comparator<Patient> {
public int compare(Patient p1, Patient p2) {

    //Verlgeichen ob der Nachname gleich ist, wenn nicht, wird direkt
    int lastNameComaprison =p1.getNachname().compareTo(p2.getNachname());
    if(lastNameComaprison != 0){
        return lastNameComaprison;
    }
    int firstNameComparison =p1.getVorname().compareTo(p2.getVorname());
    if(firstNameComparison != 0){
        return firstNameComparison;
    }
    return p1.getGebDat().compareTo(p2.getGebDat());
}

}
