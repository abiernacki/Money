package money;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoneyTest {

    @Test
    public void test1(){

        // given
        double amount = 5.50;

        // when

        Money money = new Money(amount);

        //then

        assertEquals(Double.valueOf(amount),Double.valueOf(money.getAmount()));
    }

    @Test
    public void testEquals(){

        //given
        double amount = 5.50;

        //when
        Money money = new Money(amount);
        Money money1 = new Money(amount);

        // then
        assertTrue(money.equals(money1));
    }

    @Test
    public void testEquals2(){

        //given
        double amount = 5.50;
        double amount1 = 6.00;

        //when
        Money money = new Money(amount);
        Money money1 = new Money(amount1);

        // then
        assertFalse(money.equals(money1));
    }
}