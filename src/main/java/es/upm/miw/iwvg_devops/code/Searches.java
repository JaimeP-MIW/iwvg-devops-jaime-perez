package es.upm.miw.iwvg_devops.code;

import java.util.stream.Stream;

public class Searches {

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
        if (userFound != null) {
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
