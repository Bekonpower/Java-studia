/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dane;

/**
 *
 * @author Bekon
 */
public class Magazyn {

    public static final String OPIS = "Do obliczen używamy klasy Magazyn";
    public static double C = 299792458;
    static double wspolczynnik1 = 0.1, wspolczynnik2 = 2.0;
    private static double wynik1, wynik2, wynik3;
    public int indeks1, indeks2, indeks3;

    private Magazyn() {

    }

    public static void setWynik1(double wynik) {
        wynik1 = wynik;
    }

    public static void setWynik2(double wynik) {
        wynik2 = wynik;
    }

    public static void setWynik3(double wynik) {
        wynik3 = wynik;
    }

    public static double getWunik1() {
        return wynik1;
    }

    public static double getWunik2() {
        return wynik1;
    }

    public static double getWunik3() {
        return wynik1;
    }

    public static String formatujWyniki() {
        return "Aktualne wyniki w magazynie danych\n"
                + " wynik1=" + wynik1 + "\n"
                + " wynik2=" + wynik2 + "\n"
                + " wynik3=" + wynik3 + "\n"
                + "Koniec wyników";
    }
}
