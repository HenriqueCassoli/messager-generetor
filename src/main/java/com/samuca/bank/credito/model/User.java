package com.samuca.bank.credito.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_user", schema = "message_generator")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastname;
    private String login;
    private Integer age;
}
