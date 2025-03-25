package com.pim.project.model;  // Pacote específico

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Chamado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
}