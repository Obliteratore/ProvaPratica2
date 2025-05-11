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
    public void convert_shouldReturnL_whenInputIs50() {
        // Arrange
        int number = 50;
        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("L", result);
    }
	
	@Test
    public void convert_shouldReturnLXXXVII_whenInputIs87() {
        // Arrange
        int number = 87;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("LXXXVII", result);
    }
	
	@Test
    public void convert_shouldReturnC_whenInputIs100() {
        // Arrange
        int number = 100;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("C", result);
    }
	
	@Test
    public void convert_shouldReturnCDXXI_whenInputIs421() {
        // Arrange
        int number = 421;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("CDXXI", result);
    }
	
	@Test
    public void convert_shouldReturnD_whenInputIs500() {
        // Arrange
        int number = 500;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("D", result);
    }
	
	@Test
    public void convert_shouldReturnCMXCIX_whenInputIs999() {
        // Arrange
        int number = 999;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("CMXCIX", result);
    }
	
	@Test
    public void convert_shouldReturnM_whenInputIs1000() {
        // Arrange
        int number = 1000;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("M", result);
    }

	@Test
    void convert_shouldThrowException_whenInputIsOutOfBounds() {
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(1001));
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
