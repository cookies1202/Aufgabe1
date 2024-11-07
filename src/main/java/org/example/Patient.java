package org.example;
import java.time.LocalDate;

public class Patient implements Comparable<Patient> {

    private String  fallnummer;
    private int svNumber;
  private     String Vorname;
    private String Nachname;
  private  LocalDate gebDat;

    public Patient(String fallnummer, int svNumber, String vorname, String nachname, LocalDate gebDat) {
        this.fallnummer = fallnummer;
        this.svNumber = svNumber;
        Vorname = vorname;
        Nachname = nachname;
        this.gebDat = gebDat;
    }

    public String getFallnummer() {
        return fallnummer;
    }

    public void setFallnummer(String fallnummer) {
        this.fallnummer = fallnummer;
    }

    public int getSvNumber() {
        return svNumber;
    }

    public void setSvNumber(int svNumber) {
        this.svNumber = svNumber;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public LocalDate getGebDat() {
        return gebDat;
    }

    public void setGebDat(LocalDate gebDat) {
        this.gebDat = gebDat;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "fallnummer='" + fallnummer + '\'' +
                ", svNumber=" + svNumber +
                ", Vorname='" + Vorname + '\'' +
                ", Nachname='" + Nachname + '\'' +
                ", gebDat=" + gebDat +
                '}';
    }
    @Override
    public int compareTo(Patient other) {
        return this.Nachname.compareTo(other.Nachname);
    }


}


