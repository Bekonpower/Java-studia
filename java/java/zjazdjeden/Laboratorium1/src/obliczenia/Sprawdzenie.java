/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obliczenia;

import dane.Dostep;

/**
 *
 * @author Bekon
 */
public class Sprawdzenie {
    private final Dostep dostep = new Dostep();
    
    boolean czyDanePoprawne(){
        if(dostep.get_wspolczynnik1()>0 && dostep.get_wspolczynnik2()>0)
            return true;
        else
            return false;
    }
}
