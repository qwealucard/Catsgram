package ru.yandex.practicum.catsgram.model;

import lombok.*;

import java.time.Instant;

@Data
@EqualsAndHashCode(of = "email")
public class User {
    private Long id;
    String username;
    String email;
    String password;
    Instant registrationDate;
}