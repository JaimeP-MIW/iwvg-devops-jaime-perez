package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    private Fraction fraction;
    private Fraction operationFraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(3, 4);
        operationFraction = new Fraction(4, 3);
    }

    @Test
    void testDecimal() {
        assertEquals(0.75, fraction.decimal());
    }

    @Test
    void testGetDenominator() {
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    void testSetDenominator() {
        fraction.setDenominator(1);
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testGetNumerator() {
        assertEquals(3, fraction.getNumerator());
    }

    @Test
    void testSetNumerator() {
        fraction.setNumerator(1);
        assertEquals(1, fraction.getNumerator());
    }

    @Test
    void testIsProper() {
        assertTrue(fraction.isProper());
    }

    @Test
    void testIsImproper() {
        assertFalse(fraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        assertTrue(fraction.isEquivalent(fraction));
    }

    @Test
    void testAdd() {
        assertEquals(new Fraction(25, 12).toString(),
                fraction.add(operationFraction).toString());
    }

    @Test
    void testMultiply() {
        assertEquals(new Fraction(12, 12).toString(),
                fraction.multiply(operationFraction).toString());
    }

    @Test
    void testDivide() {
        assertEquals(new Fraction(9, 16).toString(),
                fraction.divide(operationFraction).toString());
    }

    @Test
    void testIsHigher() {
        assertFalse(fraction.isHigher(operationFraction));
    }

}
