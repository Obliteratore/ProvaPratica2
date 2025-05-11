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
    public void print_shouldReturnAsciiArtForL_whenInputIs50() {
        // Arrange
        int input = 50;
        String expectedOutput = buildAsciiArt(L_REPRESENTATION);

        // Act
        String actualOutput = RomanPrinter.print(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
	
	@Test
    public void print_shouldReturnAsciiArtForLXXXVII_whenInputIs87() {
        // Arrange
        int input = 87;
        String expectedOutput = buildAsciiArt(L_REPRESENTATION);
		for (int i=1; i<=3; i++) expectedOutput += buildAsciiArt(X_REPRESENTATION);
		expectedOutput += buildAsciiArt(V_REPRESENTATION);
		expectedOutput += buildAsciiArt(I_REPRESENTATION);
		expectedOutput += buildAsciiArt(I_REPRESENTATION);
		
        // Act
        String actualOutput = RomanPrinter.print(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
	
	@Test
    public void print_shouldReturnAsciiArtForC_whenInputIs100() {
        // Arrange
        int input = 100;
        String expectedOutput = buildAsciiArt(C_REPRESENTATION);

        // Act
        String actualOutput = RomanPrinter.print(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
	
		@Test
    public void print_shouldReturnAsciiArtForCDXXI_whenInputIs421() {
        // Arrange
        int input = 421;
        String expectedOutput = buildAsciiArt(C_REPRESENTATION);
		expectedOutput += buildAsciiArt(D_REPRESENTATION);
		expectedOutput += buildAsciiArt(X_REPRESENTATION);
		expectedOutput += buildAsciiArt(X_REPRESENTATION);
		expectedOutput += buildAsciiArt(I_REPRESENTATION);

        // Act
        String actualOutput = RomanPrinter.print(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
	
	@Test
    public void print_shouldReturnAsciiArtForD_whenInputIs500() {
        // Arrange
        int input = 500;
        String expectedOutput = buildAsciiArt(D_REPRESENTATION);

        // Act
        String actualOutput = RomanPrinter.print(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
	
	@Test
    public void print_shouldReturnAsciiArtForCMXCIX_whenInputIs999() {
        // Arrange
        int input = 999;
        String expectedOutput = buildAsciiArt(C_REPRESENTATION);
		expectedOutput += buildAsciiArt(M_REPRESENTATION);
		expectedOutput += buildAsciiArt(X_REPRESENTATION);
		expectedOutput += buildAsciiArt(C_REPRESENTATION);
		expectedOutput += buildAsciiArt(I_REPRESENTATION);
		expectedOutput += buildAsciiArt(X_REPRESENTATION);
		
        // Act
        String actualOutput = RomanPrinter.print(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
	
	@Test
    public void print_shouldReturnAsciiArtForM_whenInputIs1000() {
        // Arrange
        int input = 1000;
        String expectedOutput = buildAsciiArt(M_REPRESENTATION);

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
