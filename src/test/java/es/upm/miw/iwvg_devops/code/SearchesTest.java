package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SearchesTest {

    @Test
    void testFindUserIdByAllProperFraction() {
        assertEquals(0, new Searches().findUserIdByAllProperFraction().count());
    }

    @Test
    void testFindFirstDecimalFractionByUserName() {
        assertEquals(2.0, new Searches().findFirstDecimalFractionByUserName("Ana"));
    }

    @Test
    void nullTestFindFirstDecimalFractionByUserName() {
        assertNull(new Searches().findFirstDecimalFractionByUserName("Paco"));
    }

    @Test
    void testFindUserNameBySomeImproperFraction() {
        assertEquals(5, new Searches().findUserNameBySomeImproperFraction().count());
    }

    @Test
    void testFindHighestFraction() {
        Fraction fractionFound = new Searches().findHighestFraction();
        assertEquals(1, fractionFound.getNumerator());
        assertEquals(0, fractionFound.getDenominator());
    }

}
