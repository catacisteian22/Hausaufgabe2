package test.java;

import main.java.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Die BenutzerTest Klasse testet mit Hilfe von Junit alle 3 Methoden, die in der Klasse Benutzer
 * geschrieben worden. Es wurde eine Variabel fur Test hergestellt und danach wurde sie mit
 * Hilfe von assertEquals(in diesem Fall) mit einer Variabel, welche abhegend von der Methoden
 * in Klasse Benutzer hergestellt war, verglichen.
 */
public class BenutzerTest {

    @Test
    public void totalTimeSportT(){                 /*testet was das gesamte Zeit fur die gegebene
                                                      Sporte ist*/
        Benutzer benutzer = new Benutzer();

        Fussball fussball = new Fussball();
        Hindernislauf hinder = new Hindernislauf();
        Hochsprung hoch = new Hochsprung();

        benutzer.sport.add(fussball);
        benutzer.sport.add(hinder);
        benutzer.sport.add(hoch);

        double totalTime = benutzer.kalkuliereZeit();
        double testTotalTime = fussball.kalkuliereZeit() + hinder.kalkuliereZeit() + hoch.kalkuliereZeit();

        assertEquals(testTotalTime, totalTime, 0);
    }

    @Test
    public void timeOneSport() {                     /*testet das Zeit gebraucht fur einen Sport*/
        Benutzer benutzer = new Benutzer();

        Fussball fussball = new Fussball();
        Hindernislauf hinder = new Hindernislauf();
        Hochsprung hoch = new Hochsprung();

        benutzer.sport.add(fussball);
        benutzer.sport.add(hinder);
        benutzer.sport.add(hoch);

        double sportTime = benutzer.kalkuliereZeit(benutzer.sport.get(benutzer.sport.indexOf(hoch)));
        double sportTimeTest = hoch.kalkuliereZeit();

        assertEquals(sportTimeTest, sportTime, 0);
    }

    @Test
    public void averageTimeSport() {               /**testet(in dieser Fall) die Durchschnittzeit
                                                       fur alle Sporte*/
        Benutzer benutzer = new Benutzer();

        Fussball fussball = new Fussball();
        Basketball basketball = new Basketball();
        Hindernislauf hinder = new Hindernislauf();
        Hochsprung hoch = new Hochsprung();

        benutzer.sport.add(fussball);
        benutzer.sport.add(hinder);
        benutzer.sport.add(hoch);
        benutzer.sport.add(basketball);

        double averageTime = benutzer.Durchschnitt();
        double averageTimeTest = (fussball.kalkuliereZeit() + hinder.kalkuliereZeit() + hoch.kalkuliereZeit() + basketball.kalkuliereZeit()) / benutzer.sport.size();

        assertEquals(averageTimeTest, averageTime, 0);
    }
}
