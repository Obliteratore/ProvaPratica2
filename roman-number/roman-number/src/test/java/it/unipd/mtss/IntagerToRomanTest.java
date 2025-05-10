package it.unipd.mtss;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerToRomanTest {

    @Test
    void convert_shouldReturnI_whenInputIs1() {
        // Arrange
        int number = 1;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("I", result);
    }

    @Test
    void convert_shouldReturnI_whenInputIs3() {
        // Arrange
        int number = 3;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("III", result);
    }

    @Test
    void convert_shouldThrowException_whenInputIsZero() {
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(0));
    }

    @Test
    void convert_shouldThrowException_whenInputIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(-5));
    }

}
