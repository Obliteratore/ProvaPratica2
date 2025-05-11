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

    private String buildAsciiArt(String[][] representation) {
        StringBuilder asciiArt = new StringBuilder();
        for (int i = 0; i < representation[0].length; i++) {
            asciiArt.append(representation[0][i]).append("\n");
        }
        return asciiArt.toString();
    }

    @Test
    void print_shouldThrowException_whenInputIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(0));
    } 

}
