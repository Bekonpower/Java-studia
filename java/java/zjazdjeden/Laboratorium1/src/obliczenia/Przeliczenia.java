/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obliczenia;


import dane.Magazyn;
import dane.Dostep;

/**
 *
 * @author Bekon
 */
public class Przeliczenia {
    
    public final String OPIS_OBLICZENIE_1 = "Obliczenie1: współczynnik1*x + współczynnik2*y";
    public final String OPIS_OBLICZENIE_2 = "Obliczenie2: -x * prędkość światła";
    
    private Dostep d = new Dostep();
    
    public double obliczenie1(double x, double y){
        double zwrot = d.get_wspolczynnik1()*x + d.get_wspolczynnik2()*y;
        Magazyn.indeks1 = (int)zwrot;
        return zwrot;
    }
    
    private double zmienZnak(double z){
        return -z;
    }
    
    public double obliczenie2(double x){
        x = zmienZnak(x);
        double zwrot = Magazyn.C*x;
        Magazyn.indeks2 = (int)zwrot;
        return zwrot;
    }

}
