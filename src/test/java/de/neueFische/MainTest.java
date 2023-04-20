package de.neueFische;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void addition() {

        //given
        int zahl1 = 4;
        int zahl2 = 8;
        int expected = 12;

        //when
        int actual = Main.addition(zahl1, zahl2);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void wertGrößer100() {

        //given
        int testZahl = 80;

        //when
        boolean actual = Main.wertGrößer100(testZahl);

        //then
        assertTrue(actual);
    }
    @Test
    void wertKleiner100() {

        //given
        int testZahl2 = 180;

        //when
        boolean actual = Main.wertGrößer100(testZahl2);

        //then
        assertFalse(actual);
    }

    @Test
    void intToString() {
        //given
        int zahl = 4;
        String excepted = "4";

        //when
        String result = Main.fizzbuzz(zahl);

        //then
        assertEquals(excepted, result);
    }

    @Test
    void teilbar3() {

        //given
        int zahl = 6;
        String excepted = "fizz";

        //when
        String result = Main.fizzbuzz(zahl);

        //then
        assertEquals(excepted, result);
    }

    @Test
    void teilbar5() {

        //given
        int zahl = 20;
        String excepted = "buzz";

        //when
        String result = Main.fizzbuzz(zahl);

        //then
        assertEquals(excepted, result);
    }

    @Test
    void teilbar35() {

        //given
        int zahl = 15;
        String excepted = "fizzbuzz";

        //when
        String result = Main.fizzbuzz(zahl);

        //then
        assertEquals(excepted, result);
    }
}