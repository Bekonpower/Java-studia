/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorium1;

import dane.Magazyn;

/**
 *
 * @author Bekon
 */
public class Laboratorium1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Zadanie 2 - nowy obiekt klasy Magazyn
        Magazyn nowyMagazyn = new Magazyn();
        AppCLA app = new AppCLA();
        app.start();
        Magazyn.formatujWyniki();
    }
    
}