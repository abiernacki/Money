package money;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ExchangeTest {

    @Test
    public void Test1(){

        //given
        double a = 0.5;
        double b = 2;

        // when
        Exchange exchange = new Exchange(a,b);

        //then
        assertEquals(Double.valueOf(a), Double.valueOf(exchange.getDollarToFrancRatio()));
        assertEquals(Double.valueOf(b), Double.valueOf(exchange.getFrancToDollarRatio()));
    }

    @Test
    public void testDollarToFranc(){

        // given
        Exchange exchange = new Exchange(0.5,2);
        Dollar dollar = new Dollar(3);

        // when
        Franc franc = exchange.dollarToFranc(dollar);

        // then
        assertEquals(Double.valueOf(1.5), Double.valueOf(franc.getAmount()));

    }

}