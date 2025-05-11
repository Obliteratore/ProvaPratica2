package it.unipd.mtss;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class IntegerToRomanTest {

    @Test
    public void convert_shouldReturnI_whenInputIs1() {
        // Arrange
        int number = 1;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("I", result);
    }

    @Test
    public void convert_shouldReturnIII_whenInputIs3() {
        // Arrange
        int number = 3;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("III", result);
    }
    
       @Test
   public void convert_shouldReturnIV_whenInputIs4() {
        // Arrange
        int number = 4;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("IV", result);
    }
    
   @Test
   public void convert_shouldReturnVI_whenInputIs6() {
        // Arrange
        int number = 6;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("VI", result);
    }
    
   @Test
   public void convert_shouldReturnVIII_whenInputIs8() {
        // Arrange
        int number = 8;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("VIII", result);
    }
    
   @Test
   public void convert_shouldReturnIX_whenInputIs9() {
        // Arrange
        int number = 9;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("IX", result);
    }
    
   @Test
   public void convert_shouldReturnXIV_whenInputIs14() {
        // Arrange
        int number = 14;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("XIV", result);
    }
    
   @Test
   public void convert_shouldReturnXVII_whenInputIs17() {
        // Arrange
        int number = 17;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("XVII", result);
    }
    
   @Test
   public void convert_shouldReturnXX_whenInputIs20() {
        // Arrange
        int number = 20;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("XX", result);
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
