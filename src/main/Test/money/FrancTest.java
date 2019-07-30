package money;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrancTest {

    @Test
    public void test1(){

        // given
        double amount = 5.50;

        // when

        Franc franc = new Franc(amount);

        //then

        assertEquals(Double.valueOf(amount),Double.valueOf(franc.getAmount()));
    }

    @Test
    public void testEquals(){

        //given
        double amount = 5.50;

        //when
        Dollar dollar = new Dollar(amount);
        Franc franc = new Franc(amount);

        // then
        assertFalse(dollar.equals(franc));
    }

    @Test
    public void testAdd(){

        //given
        double amount = 5.50;

        //when
        Franc franc = new Franc(amount);
        Franc franc1 = new Franc(amount);
        franc.add(franc1);

        // then
        assertEquals(Double.valueOf(11),Double.valueOf(franc.getAmount()));
    }
    @Test
    public void testFrancToDollar(){

        // given
        Exchange exchange = new Exchange(0.5,2);
        Franc franc = new Franc(3);

        // when
        Dollar dollar = exchange.francToDollar(franc);

        // then
        assertEquals(Double.valueOf(6), Double.valueOf(dollar.getAmount()));
    }

    @Test
    public void testAdd2(){

        //given
        double amount = 5;

        //when
        Dollar dollar = new Dollar(amount);
        Franc franc = new Franc(amount);
        Exchange exchange = new Exchange(0.5,2);
        franc.add(dollar, exchange);

        // then
        assertEquals(Double.valueOf(7.5),Double.valueOf(franc.getAmount()));
    }


}