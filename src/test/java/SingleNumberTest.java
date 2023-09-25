import org.example.challenge.SingleNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SingleNumberTest {

    SingleNumber singleNumber;

    @BeforeEach
    void setup(){
        singleNumber=new SingleNumber();
    }

    @ParameterizedTest
    @CsvSource({"'[2,2,1]',1","'[4,1,2,1,2]',4","'[1]',1"})
    public void should_ReturnSingleNumber_When_InputIsOk(String numbers,int num){
        //given
        int expected=num;
        int[] input= Arrays.stream(numbers.replace("[","").replace("]","")
                .split(","))
                .mapToInt(c-> Integer.parseInt(c.toString().trim()))
                .toArray();
        //when
        int actual=singleNumber.getSingleNumber(input);
        //then
        assertEquals(expected,actual);
    }

}
