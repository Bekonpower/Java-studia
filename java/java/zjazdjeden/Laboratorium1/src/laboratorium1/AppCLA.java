package laboratorium1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dane.Magazyn;
import obliczenia.Przeliczenia;
import obliczenia.Sprawdzenie;
import java.util.Scanner;

/**
 *
 * @author Bekon
 */
public class AppCLA {
    private double x, y;
    private final Przeliczenia przelicznik = new Przeliczenia();

    void informacjaPoczatek() {
        System.out.println("Laboratorium 1");
        System.out.println(Magazyn.OPIS);
        System.out.println(przelicznik.OPIS_OBLICZENIE_1 + "\n" + przelicznik.OPIS_OBLICZENIE_2);
    }

    void wprowadzenieDanych(){
        
        final Scanner scanner = new Scanner(System.in);
        Sprawdzenie sprawdz = new Sprawdzenie();

           do{System.out.print("x=");
            x = scanner.nextDouble();
            sprawdz.dostep.set_wspolczynnik1(x);
    
            System.out.print("y=");
            y = scanner.nextDouble();
            sprawdz.dostep.set_wspolczynnik2(y);
    } while(sprawdz.czyDanePoprawne()==false);

    
        scanner.close();

    }

    void wykonanieObliczen() {
        final double wynik1 = przelicznik.obliczenie1(x, y);
        final double wynik2 = przelicznik.obliczenie2(x);

        Magazyn.setWynik1(wynik1);
        Magazyn.setWynik2(wynik2);

    }

    void wyswietlenieWynikow() {
        System.out.println(Magazyn.formatujWyniki());
    }

    void informacjaKoniec() {
        System.out.println("Koniec programu");
    }

    public void start() {
        this.informacjaPoczatek();
        this.wprowadzenieDanych();
        this.wykonanieObliczen();
        this.wyswietlenieWynikow();
    }
}
