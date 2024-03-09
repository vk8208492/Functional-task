package app.UserProvider;

import app.User.User;

import java.util.Arrays;
import java.util.List;

public class UserProvider {

    public List<User> getData() {
        return Arrays.asList(
                new User("Sergei", "054138982"),
                new User("Natalia", "0505771526"),
                new User("Vladyslav","0685503985"),
                new User("Anastasia","0669531216"),
                new User("Artem","0950298373")
        );
    }
}
