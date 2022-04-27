package com.example.CRUD.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="userss")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
}
