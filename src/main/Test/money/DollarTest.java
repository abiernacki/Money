package money;

import org.junit.Test;

import static org.junit.Assert.*;

public class DollarTest {

    @Test
    public void test1(){

        // given
        double amount = 5.50;

        // when

        Dollar dollar = new Dollar(amount);

        //then

        assertEquals(Double.valueOf(amount),Double.valueOf(dollar.getAmount()));
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
        Dollar dollar = new Dollar(amount);
        Dollar dollar1 = new Dollar(amount);
        dollar.add(dollar1);

        // then
        assertEquals(Double.valueOf(11),Double.valueOf(dollar.getAmount()));
    }

    @Test
    public void testAdd2(){

        //given
        double amount = 5;

        //when
        Dollar dollar = new Dollar(amount);
        Franc franc = new Franc(amount);
        Exchange exchange = new Exchange(0.5,2);
        dollar.add(franc, exchange);

        // then
        assertEquals(Double.valueOf(15),Double.valueOf(dollar.getAmount()));
    }





}