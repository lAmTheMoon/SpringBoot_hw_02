package ru.netology.springboot.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(exclude = "authorities")
public class User {

    private String login;
    private String password;
    private List<Authorities> authorities;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String login, String password, List<Authorities> authorities) {
        this.login = login;
        this.password = password;
        this.authorities = authorities;
    }
}
