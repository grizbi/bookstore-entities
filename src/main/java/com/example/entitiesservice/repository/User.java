package com.example.entitiesservice.repository;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private static final int MINIMUM_CREDENTIALS_SIZE = 3;
    private static final int MAXIMUM_CREDENTIALS_SIZE = 20;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Size(min = MINIMUM_CREDENTIALS_SIZE, max = MAXIMUM_CREDENTIALS_SIZE)
    private String password;
    @Size(min = MINIMUM_CREDENTIALS_SIZE, max = MAXIMUM_CREDENTIALS_SIZE)
    private String username;

}
