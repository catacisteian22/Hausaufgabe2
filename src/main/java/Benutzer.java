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

    public Benutzer() {

    }

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

    public double kalkuliereZeit() {
        double time = 0;
        for (Sport i : sport){
            time += i.kalkuliereZeit();
        }
        return time;
    }

    public double kalkuliereZeit(Sport sport) {
        return sport.kalkuliereZeit();
    }

    public double Durchschnitt() {
        double average = kalkuliereZeit() / sport.size();
        return average;
    }
}
