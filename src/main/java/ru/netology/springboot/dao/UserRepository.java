package ru.netology.springboot.dao;

import org.springframework.stereotype.Repository;
import ru.netology.springboot.model.Authorities;
import ru.netology.springboot.model.User;

import java.util.List;

@Repository
public class UserRepository {

    private final List<User> userData = List.of(
            new User("Jo", "Sweet", List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE)),
            new User("Lusa", "Black", List.of(Authorities.READ, Authorities.WRITE)),
            new User("Maks", "Fur", List.of(Authorities.READ)));

    public List<Authorities> getUserAuthorities(String login, String password) {
        return getUserFromList(login, password).getAuthorities();
    }

    private User getUserFromList(String login, String password) {
        User user = new User(login, password);
        return userData.stream().filter(u -> u.equals(user)).findFirst().orElse(user);
    }
}
