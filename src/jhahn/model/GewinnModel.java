package jhahn.model;

import java.util.Random;

public class GewinnModel {
    private int gesamtPunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;

    public GewinnModel() {
        gesamtPunkte = 30;
    }
    public void berechneComputerZahl() {
        computerZahl = new Random().nextInt(1,10);
    }
    public void berechneRunde(int spielerZahl) {

    }
    public boolean hatGewonnen() {
        return gesamtPunkte >= 100;
    }
    public boolean hatVerloren() {
        return gesamtPunkte <= 0;
    }
    public int getGesamtPunkte() {
        return gesamtPunkte;
    }
    public int getComputerZahl() {
        return computerZahl;
    }
    public int getRundenErgebnis() {
        return rundenErgebnis;
    }

}
