package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private User user;

    @BeforeEach
    void before() {
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction());
        user = new User("0", "Jaime", "Pérez", fractions);
    }

    @Test
    void testGetId() {
        assertEquals("0", user.getId());
    }

    @Test
    void testGetName() {
        assertEquals("Jaime", user.getName());
    }

    @Test
    void testSetName() {
        user.setName("Marcos");
        assertEquals("Marcos", user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Pérez", user.getFamilyName());
    }

    @Test
    void testSetFamilyName() {
        user.setFamilyName("Sánchez");
        assertEquals("Sánchez", user.getFamilyName());
    }

    @Test
    void testGetFractions() {
        assertEquals(1, user.getFractions()
                .get(user.getFractions().size() - 1)
                .getNumerator());
        assertEquals(1, user.getFractions()
                .get(user.getFractions().size() - 1)
                .getDenominator());
    }

    @Test
    void testSetFractions() {
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction(2, 2));
        user.setFractions(fractions);
        assertEquals(2, user.getFractions()
                .get(user.getFractions().size() - 1)
                .getNumerator());
        assertEquals(2, user.getFractions()
                .get(user.getFractions().size() - 1)
                .getDenominator());
    }

    @Test
    void testAddFraction() {
        user.addFraction(new Fraction(4, 3));
        assertEquals(4, user.getFractions()
                .get(user.getFractions().size() - 1)
                .getNumerator());
        assertEquals(3, user.getFractions()
                .get(user.getFractions().size() - 1)
                .getDenominator());
    }

    @Test
    void testFullName() {
        assertEquals("Jaime Pérez", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("J.", user.initials());
    }

    @Test
    void testGetFirstFractionDecimal() {
        assertEquals(1.0, user.getFirstFractionDecimal());
    }

}
