package main.java;

public class Main {
    public static void main(String[] args) {
        Benutzer benutzer = new Benutzer();
        benutzer.setFirstName("Catalina");
        benutzer.setLastName("Cisteian");

        Fussball fussball = new Fussball();
        Basketball basketball = new Basketball();

        benutzer.sport.add(fussball);
        benutzer.sport.add(basketball);

        double totalTime = benutzer.kalkuliereZeit();
        double sportTime = benutzer.kalkuliereZeit(benutzer.sport.get(benutzer.sport.indexOf(basketball)));
        double averageTime = benutzer.Durchschnitt();

        System.out.println("User firstname is: " + benutzer.getFirstName() + "; User lastname is: " + benutzer.getLastName());
        System.out.println("User total time sport: " + totalTime);
        System.out.println("User one sport time: " + sportTime);
        System.out.println("User average time sport: " + averageTime);
    }
}
