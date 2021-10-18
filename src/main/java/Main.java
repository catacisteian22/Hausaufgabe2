package main.java;

public class Main {
    public static void main(String[] args) {
        Benutzer benutzer = new Benutzer();
        benutzer.setFirstName("James");
        benutzer.setLastName("Ward");

        Fussball fussball = new Fussball();
        Basketball basketball = new Basketball();

        benutzer.sport.add(fussball);
        benutzer.sport.add(basketball);

        double totalTime = benutzer.kalkuliereZeit();
        double sportTime = benutzer.kalkuliereZeit(benutzer.sport.get(benutzer.sport.indexOf(basketball)));
        double averageTime = benutzer.Durchschnitt();

        System.out.println("Vorname des Benutzers ist: " + benutzer.getFirstName() + " und Nachname ist: " + benutzer.getLastName());
        System.out.println("Benutzers totale Zeit fur alle Sporte: " + totalTime);
        System.out.println("Zeit fur eine Sportart: " + sportTime);
        System.out.println("DUrchschnitt der Sporte aus der Liste: " + averageTime);
    }
}
