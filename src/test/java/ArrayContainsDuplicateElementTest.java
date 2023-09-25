import org.example.challenge.ArrayContainsDuplicateElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayContainsDuplicateElementTest {

    ArrayContainsDuplicateElement arrayContainsDuplicateElement;

    @BeforeEach
    void setup() {
        arrayContainsDuplicateElement = new ArrayContainsDuplicateElement();
    }

    @ParameterizedTest
    @CsvSource({"'[1,2,3,1]'", "'[1,1,1,3,3,4,3,2,4,2]'"})
    public void should_ReturnTrue_When_ContainsDuplicate(String numbers) {
        //given
        int[] input = Arrays.stream(numbers.replace("[", "").replace("]", "")
                        .split(","))
                .mapToInt(c -> Integer.parseInt(c.toString().trim()))
                .toArray();
        //when
        boolean actualResult = arrayContainsDuplicateElement.containsDuplicate(input);
        //then
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @CsvSource({"'[1,2,3]'", "'[1,3,4,6,7]'"})
    public void should_ReturnTrue_When_NoDuplicates(String numbers) {
        //given
        int[] input = Arrays.stream(numbers.replace("[", "").replace("]", "")
                        .split(","))
                .mapToInt(c -> Integer.parseInt(c.toString().trim()))
                .toArray();
        //when
        boolean actualResult = arrayContainsDuplicateElement.containsDuplicate(input);
        //then
        assertFalse(actualResult);
    }

}
