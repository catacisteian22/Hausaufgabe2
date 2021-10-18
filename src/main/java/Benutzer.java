package main.java;

import java.util.ArrayList;
import java.util.List;

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
        double time = 0;
        for (Sport i : sport){
            time += i.kalkuliereZeit();
        }
        return time;
    }

    //Methode, die die Zeit fur einen SPort kalkuliert
    public double kalkuliereZeit(Sport sport) {
        return sport.kalkuliereZeit();
    }

    //die Average der Sporte aus der Liste
    public double Durchschnitt() {
        double durchschnitt = kalkuliereZeit() / sport.size();
        return durchschnitt;
    }
}
