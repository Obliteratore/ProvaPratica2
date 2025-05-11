package it.unipd.mtss;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RomanPrinterTest {

    private static final String[][] I_REPRESENTATION = {{
        "  _____  ",
        " |_   _| ",
        "   | |   ",
        "   | |   ",
        "  |___|  "}
    };
    
    private static final String[][] V_REPRESENTATION = {{
        " __     __ ",
		" \\ \\   / / ",
		"  \\ \\_/ /  ",
		"   \\   /   ",
		"    \\_/    "}
    };
	
    private static final String[][] X_REPRESENTATION = {{
		" __   __ ",
		" \\ \\ / / ",
		"  \\ V /  ",
		"  /   \\  ",
		" /_/\\_\\ "}
    };
	
    private static final String[][] L_REPRESENTATION = {{
        "  _       ",
		" | |      ",
		" | |      ",
		" | |____  ",
		" |______| "}
    };
	
    private static final String[][] C_REPRESENTATION = {{
		"   _____  ",
		"  / ____| ",
		" | |      ",
		" | |____  ",
		"  \\_____| "}
    };
	
    private static final String[][] D_REPRESENTATION = {{
		"  _____   ",
		" |  __ \\  ",
		" | |  | | ",
		" | |__| | ",
		" |_____/  "}
    };
	
    private static final String[][] M_REPRESENTATION = {{
		"  __  __  ",
		" |  \\/  | ",
		" | \\  / | ",
		" | |\\/| | ",
		" |_|  |_| "}
    };
    
    private String buildAsciiArt(String[][] representation) {
        StringBuilder asciiArt = new StringBuilder();
        for (int i = 0; i < representation[0].length; i++) {
            asciiArt.append(representation[0][i]).append("\n");
        }
        return asciiArt.toString();
    }

    @Test
    public void print_shouldReturnAsciiArtForI_whenInputIs1() {
        // Arrange
        int input = 1;
        String expectedOutput = buildAsciiArt(I_REPRESENTATION);

        // Act
        String actualOutput = RomanPrinter.print(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void print_shouldReturnAsciiArtForIII_whenInputIs3() {
        // Arrange
        int input = 3;
        String expectedOutput = buildAsciiArt(I_REPRESENTATION);
        expectedOutput += buildAsciiArt(I_REPRESENTATION);
        expectedOutput += buildAsciiArt(I_REPRESENTATION);

        // Act
        String actualOutput = RomanPrinter.print(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void print_shouldReturnAsciiArtForV_whenInputIs5() {
        // Arrange
        int input = 5;
        String expectedOutput = buildAsciiArt(V_REPRESENTATION);

        // Act
        String actualOutput = RomanPrinter.print(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void print_shouldReturnAsciiArtForIX_whenInputIs9() {
        // Arrange
        int input = 9;
        String expectedOutput = buildAsciiArt(I_REPRESENTATION);
        expectedOutput += buildAsciiArt(X_REPRESENTATION);

        // Act
        String actualOutput = RomanPrinter.print(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void print_shouldReturnAsciiArtForXIV_whenInputIs14() {
        // Arrange
        int input = 14;
        String expectedOutput = buildAsciiArt(X_REPRESENTATION);
        expectedOutput += buildAsciiArt(I_REPRESENTATION);
        expectedOutput += buildAsciiArt(V_REPRESENTATION);

        // Act
        String actualOutput = RomanPrinter.print(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void print_shouldReturnAsciiArtForXX_whenInputIs20() {
        // Arrange
        int input = 20;
        String expectedOutput = buildAsciiArt(X_REPRESENTATION);
        expectedOutput += buildAsciiArt(X_REPRESENTATION);

        // Act
        String actualOutput = RomanPrinter.print(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
    

    @Test
    void print_shouldThrowException_whenInputIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(0));
    } 

}
