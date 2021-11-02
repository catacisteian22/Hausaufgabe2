package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Die Klasse Benutzer enthalt die Methoden die der Zeit fur die Sporte fur den Benutzer berechnen.
 */
public class Benutzer {

    String firstName;
    String lastName;
    public List<Sport> sport = new ArrayList<>();

    public Benutzer (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Benutzer() {}

    //Getters und Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Methode, die die totale Zeit aller Sporte berechnet
    public double kalkuliereZeit() {
        double i = 0;
        for (Sport j : sport){
            i += j.kalkuliereZeit();
        }
        return i;
    }

    //Methode, die die Zeit fur einen Sport kalkuliert
    public double kalkuliereZeit(Sport sport) {
        return sport.kalkuliereZeit();
    }

    //die Average der Sporte aus der Liste
    public double Durchschnitt() {
        return kalkuliereZeit() / sport.size();
    }
}
