package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {

    @Test
    void testFindUserIdByAllProperFraction() {
        assertEquals(0, new Searches().findUserIdByAllProperFraction()
                    .collect(Collectors.toList()).size());
    }

    @Test
    void testFindFirstDecimalFractionByUserName() {
        assertEquals(2.0, new Searches().findFirstDecimalFractionByUserName("Ana"));
    }

}
