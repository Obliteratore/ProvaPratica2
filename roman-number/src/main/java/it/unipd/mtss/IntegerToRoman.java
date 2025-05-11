////////////////////////////////////////////////////////////////////
// FRANCESCO BALESTRO 2103118
// AARON GINGILLINO 2113182
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
public class IntegerToRoman {
    public static String convert(int number){
        if (number <= 0) {
            throw new IllegalArgumentException("Il numero deve essere maggiore di zero.");
        } else if (number > 1000) {
            throw new IllegalArgumentException("Il numero deve essere minore di mille.");
        }
        String output = "";

        // Valori romani e i corrispondenti simboli
        int[] valori =    {1000, 900, 500, 400, 100, 90,  50, 40, 10, 9,  5, 4, 1};
        String[] simboli = {"M", "CM","D", "CD", "C", "XC","L","XL","X","IX","V","IV","I"};

        for (int i = 0; i < valori.length; i++) {
            while (number >= valori[i]) {
                number -= valori[i];
                output += simboli[i];
            }
        }

        return output;  
    }
}