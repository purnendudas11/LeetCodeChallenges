import org.example.challenge.RotateArray;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class RotateArrayTest {

    RotateArray rotateArray;

    @BeforeEach
    void setup(){
        rotateArray=new RotateArray();
    }

    @ParameterizedTest
    @CsvSource({"'[1,2,3,4,5,6,7]',3,'[5,6,7,1,2,3,4]'","'[-1,-100,3,99]',2,'[3,99,-1,-100]'"})
    public void should_ReturnRotateArray_When_InputIsOk(String nums,int k,String output){
        //Given
        int[] input= Arrays.stream(nums.replace("[","")
                .replace("]","").split(","))
                .mapToInt(c-> Integer.parseInt(c.toString().trim()))
                .toArray();
        int[] expectedOutput= Arrays.stream(output.replace("[","")
                        .replace("]","").split(","))
                .mapToInt(c-> Integer.parseInt(c.toString().trim()))
                .toArray();
        //When
        int[] actualOutput=rotateArray.rotate(input,k);
        //Then
        assertArrayEquals(expectedOutput,actualOutput);
    }
}
