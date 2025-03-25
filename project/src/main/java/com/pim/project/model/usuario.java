package com.pim.project.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Enumerated(EnumType.STRING)
    private Tipousuario tipo;
}

enum Tipousuario {
    ADMIN, TECNICO, CLIENTE
}