import org.example.challenge.BuySellStocks;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class BuySellStocksTest {

    BuySellStocks buySellStocks;

    @BeforeEach
    void setup(){
        buySellStocks=new BuySellStocks();
    }

    @ParameterizedTest
    @CsvSource({"'[7,1,5,3,6,4]',7","'[1,2,3,4,5]',4","'[7,6,4,3,1]',0","'[]',0"})
    public void should_Return_MaxProfit_When_InputIsOk(String stockPrices, int maxProfit){
        //given
        int[] input= Arrays.stream(stockPrices.replace("[","")
                .replace("]","").split(","))
                .mapToInt(c-> {
                            if (c==""){
                                return 0;
                            }
                    return Integer.parseInt(c.toString().trim());
                })
                .toArray();
        System.out.println(Arrays.toString(input));

        int expectedResult=maxProfit;
        //when
        int actualResult=buySellStocks.maxProfit(input);
        //then
        assertEquals(expectedResult,actualResult);
    }

}
