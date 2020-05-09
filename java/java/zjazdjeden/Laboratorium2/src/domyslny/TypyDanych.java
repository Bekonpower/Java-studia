package domyslny;

import java.util.Scanner;

/**
 *
 * @author Bekon
 */
public class TypyDanych {

    private static String x;
    private static String y;

    public static void typInteger() {

        //wersja typów prostych
        int i0 = 11;
        int i1 = 9;
        int i2 = i0 + i1;
        System.out.println(i0 + " + " + i1 + " = " + i2);

        //Wersja obiektowa
        Integer I0 = new Integer(11);
        Integer I1 = new Integer(9);
        Integer I2 = I0 + I1;
        System.out.println(I0 + " + " + I1 + " = " + I2);

        //Dodatkowe możliwości wersji obiektowej
        double x = I0.doubleValue();
        System.out.println("x=" + x);

        //Porównywanie typów prostych
        i0 = 123;
        i1 = 123;

        System.out.println("i0=" + i0 + " i1=" + i1);
        System.out.println("i0==i1 ");
        if (i0 == i1) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }

        //Porównywanie typów obiektowych
        I0 = new Integer(123);
        I1 = new Integer(123);
        I2 = I0;
        System.out.println("I0=" + I0 + " I1=" + I1 + " I2=" + I2);
        System.out.println("I0==I1 ");
        if (I0 == I1) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
        System.out.println("I0==I2 ");
        if (I0 == I2) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
        System.out.println("I0.equals(I1) ");
        if (I0.equals(I1)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }

        System.out.println("I0.equals(I2) ");
        if (I0.equals(I2)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
        
        //Składniki statyczne klasy Integer
        System.out.println("MIN="+Integer.MIN_VALUE);
        System.out.println("MAX="+Integer.MAX_VALUE);
        System.out.println("SIZE="+Integer.SIZE);
        
        System.out.println("max: "+Integer.max(4, -6));
        System.out.println("max: "+Integer.min(4, -6));
        
        Integer I3 = Integer.decode("97");
        System.out.println(I3+3);
        
        int i3 = Integer.parseInt("-23");
        System.out.println(i3+3);
    }
    
    public static void typString(){
        
        String tekst1 = "Ala ma";
        String tekst2 = "kota, a kot to ";
        String tekst3 = "****";
        
        String tekstCaly1 = tekst1+" "+tekst2+tekst3;
        String tekstCaly2 = tekst1.concat(" ").concat(tekst2).concat(tekst3);
        System.out.println(tekstCaly1);
        System.out.println(tekstCaly2);
        
        if(tekst1.compareTo("Ala ma")==0) System.out.println("TAK");
        else System.out.println("NIE");
        if(tekst1.compareTo("ALA MA")==0) System.out.println("TAK");
        else System.out.println("NIE");
        if(tekst1.compareToIgnoreCase("ALA MA")==0) System.out.println("TAK");
        else System.out.println("NIE");
        
        System.out.println(tekst1.length());
        
        String [] wyrazy = tekstCaly1.split(" ");
        for(int i=0; i<wyrazy.length; i++) System.out.println(wyrazy[i]);

        final Scanner scanner = new Scanner(System.in);
        System.out.print("Wyraz pierwszy = ");
        x = scanner.nextLine();
        System.out.print("Wyraz drugi = ");
        y = scanner.nextLine();

        if(x.compareTo(y)==0) System.out.println("TAK, są takie same");
        else System.out.println("Są różne");

        if(x.compareToIgnoreCase(y)==0) System.out.println("Są takie same pomijając wielkość znaków");
        else System.out.println("Są różne pomijając wielkość znaków");
    }
    
    public static void typDouble(){

        Double cyfra1 = 5.00;
        Double cyfra2 = 5.4000001;
        Double cyfra3 = 5.;
        Double cyfra4 = 5.00;

        System.out.println(Double.compare(cyfra1, cyfra2));
        System.out.println(cyfra1.intValue());

        if(cyfra1==cyfra3) System.out.println("TAK");
        else System.out.println("NIE");

        if(cyfra1.compareTo(cyfra4)==0) System.out.println("TAK");
        else System.out.println("NIE");
    }

    public void start(){
        this.typInteger();
        this.typString();
        this.typDouble();
    } 
}