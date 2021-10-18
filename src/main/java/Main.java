package main.java;

public class Main {
    public static void main(String[] args) {
        Benutzer user = new Benutzer();
        user.setFirstName("Catalina");
        user.setLastName("Cisteian");

        Fussball fussball = new Fussball();
        Basketball basketball = new Basketball();

        user.sport.add(fussball);
        user.sport.add(basketball);

        double totalTime = user.kalkuliereZeit();
        double footballTime = user.kalkuliereZeit(fussball);
        double averageTime = user.Durchschnitt();

        System.out.println("User firstname is: " + user.getFirstName() + "; User lastname is: " + user.getLastName());
        System.out.println("User total time sport: " + totalTime);
        System.out.println("User one sport time: " + footballTime);
        System.out.println("User average time sport: " + averageTime);
    }
}
