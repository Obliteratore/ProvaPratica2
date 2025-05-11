////////////////////////////////////////////////////////////////////
// FRANCESCO BALESTRO 2103118
// AARON GINGILLINO 2113182
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    
    static String[][] NUMBERS = {
            { // I
                "  _____  ",
                " |_   _| ",
                "   | |   ",
                "   | |   ",
                "  |___|  "
            },
            { // V
                " __     __ ",
                " \\ \\   / / ",
                "  \\ \\_/ /  ",
                "   \\   /   ",
                "    \\_/    "
            },
            { // X
                " __   __ ",
                " \\ \\ / / ",
                "  \\ V /  ",
                "  /   \\  ",
                " /_/\\_\\ "
            },
            { // L
                "  _       ",
                " | |      ",
                " | |      ",
                " | |____  ",
                " |______| "
            },
            { // C
                "   _____  ",
                "  / ____| ",
                " | |      ",
                " | |____  ",
                "  \\_____| "
            },
            { // D
                "  _____   ",
                " |  __ \\  ",
                " | |  | | ",
                " | |__| | ",
                " |_____/  "
            },
            { // M
                "  __  __  ",
                " |  \\/  | ",
                " | \\  / | ",
                " | |\\/| | ",
                " |_|  |_| "
            } };

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        
        StringBuilder asciiArt = new StringBuilder();
        
        for (int i = 0; i < romanNumber.length(); i++) {
            char c = romanNumber.charAt(i);
            switch(c)
            {
                case 'I':
                    for (int j = 0; j < NUMBERS[0].length; j++){
                        asciiArt.append(NUMBERS[0][j]);
                        asciiArt.append("\n");
                    }
                    break;
                case 'V':
                    for (int j = 0; j < NUMBERS[1].length; j++){
                        asciiArt.append(NUMBERS[1][j]);
                        asciiArt.append("\n");
                    }
                    break;
                case 'X':
                    for (int j = 0; j < NUMBERS[2].length; j++){
                        asciiArt.append(NUMBERS[2][j]);
                        asciiArt.append("\n");
                    }
                    break;
                case 'L':
                    for (int j = 0; j < NUMBERS[3].length; j++){
                        asciiArt.append(NUMBERS[3][j]);
                        asciiArt.append("\n");
                    }
                    break;
                case 'C':
                    for (int j = 0; j < NUMBERS[4].length; j++){
                        asciiArt.append(NUMBERS[4][j]);
                        asciiArt.append("\n");
                    }
                    break;
                case 'D':
                    for (int j = 0; j < NUMBERS[5].length; j++){
                        asciiArt.append(NUMBERS[5][j]);
                        asciiArt.append("\n");
                    }
                    break;
                case 'M':
                    for (int j = 0; j < NUMBERS[6].length; j++){
                        asciiArt.append(NUMBERS[6][j]);
                        asciiArt.append("\n");
                    }
                    break;
            }
        }
        return asciiArt.toString();
    }
}
