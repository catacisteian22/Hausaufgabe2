package test.java;

import main.java.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BenutzerTest {

    @Test
    public void testTotalTimeSport(){
        Benutzer benutzer = new Benutzer();

        Fussball fussball = new Fussball();
        Basketball basketball = new Basketball();
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
    public void testTimeOneSport() {
        Benutzer benutzer = new Benutzer();

        Fussball fussball = new Fussball();
        Basketball basketball = new Basketball();
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
    public void testAverageTimeSport() {
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
