package com.pim.project.repository;

import com.pim.project.model.usuario;
import com.pim.project.model.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepository extends JpaRepository<usuario, Long> {
    usuario findByEmail(String email);
}