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
public class Dostep {
    public void set_wspolczynnik1(double wartosc){
        Magazyn.wspolczynnik1 = wartosc;
    }
    public double get_wspolczynnik1(){
        return Magazyn.wspolczynnik1;
    }
    
    public void set_wspolczynnik2(double wartosc){
        Magazyn.wspolczynnik2 = wartosc;
    }
    public double get_wspolczynnik2(){
        return Magazyn.wspolczynnik2;
    }
}
