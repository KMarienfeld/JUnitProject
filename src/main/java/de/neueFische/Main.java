package de.neueFische;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println(wertGrößer100(80));
        System.out.println(addition(5, 8));
        System.out.println(fizzbuzz(5));


    }

    public static int addition( int x, int y) {
        int summe = (x+y);
        return summe;
    }
    public static boolean wertGrößer100(int wert){
        if (wert < 100) {
            return true;
        } else {
            return false;
        }
    }
    public static String fizzbuzz(int zahl){
        if ( zahl % 3 == 0 && zahl % 5 == 0) {
            return "fizzbuzz";
        } else if (zahl % 3 == 0) {
            return "fizz";
        } else if (zahl % 5 == 0) {
            return "buzz";
        } else
        return String.valueOf(zahl);
    }
}
