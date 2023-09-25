import org.example.challenge.RemoveDuplicateFromSortedArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicateFromSortedArrayTest {

    @BeforeEach
    public void setup(){

    }

    @ParameterizedTest
    @CsvSource({"'[0, 0, 1, 1, 1, 2, 2, 3, 3, 4]',5","'[1,1,2]',2"})
    public void should_ReturnCorrectArrayLength_When_InputIsOK(String nums,int expectedOutput){
        //given
        int[] input= Arrays.asList(nums.replace("[","").replace("]","").split(","))
                .stream()
                .mapToInt(c->Integer.parseInt(c.toString().trim()))
                .toArray();
        System.out.println(Arrays.toString(input));
        //when
        RemoveDuplicateFromSortedArray removeDuplicateFromSortedArray=new RemoveDuplicateFromSortedArray();
        int actual=removeDuplicateFromSortedArray.result(input);
        //then
        assertEquals(expectedOutput,actual);

    }
}
