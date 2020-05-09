/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorium1;

import dane.Magazyn;

/*• Czy można dodać jakikolwiek kod poza klasą?
* Nie. Można napisać kod w klasie main, ale main to też klasa.
*
*W kodzie pojawiają się new, czemu nie ma delete ?
*Usuwaniem obiektów w javie zajmuje się garbage collector.

*/

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