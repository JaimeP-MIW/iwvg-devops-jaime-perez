package es.upm.miw.iwvg_devops.code;

import java.util.stream.Stream;

public class Searches {

    public Fraction findHighestFraction() {
        Fraction highestFraction = new UsersDatabase().findAll()
                .flatMap(user -> user.getFractions().stream())
                .reduce((fraction, fraction2) -> fraction.isHigher(fraction2) ? fraction : fraction2)
                .orElse(null);
        if (highestFraction != null) {
            return highestFraction;
        }
        return null;
    }

    public Stream<String> findUserIdByAllProperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .allMatch(fraction -> fraction.isProper()))
                .map(User::getId);
    }

    public Double findFirstDecimalFractionByUserName(String name) {
        User userFound = new UsersDatabase().findAll()
                .filter(user -> user.getName().equals(name))
                .findFirst().orElse(null);
        if (userFound != null){
            return userFound.getFirstFractionDecimal();
        }
        return null;
    }

    public Stream<String> findUserNameBySomeImproperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(fraction -> fraction.isImproper()))
                .map(User::getName);
    }

}
