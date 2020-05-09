/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obliczenia;
import dane.Dostep;
import java.lang.System;
/**
 *
 * @author Bekon
 */
public class Sprawdzenie {
    public final Dostep dostep = new Dostep();

    public boolean czyDanePoprawne(){
        if(dostep.get_wspolczynnik1()>0 && dostep.get_wspolczynnik2()>0)
            return true;
        else{System.out.println("Złe dane, wprowadź jeszcze raz!");
        return false;
    }
    };
}
