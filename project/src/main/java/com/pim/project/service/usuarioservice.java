package com.pim.project.service;

import com.pim.project.model.usuario;
import com.pim.project.repository.usuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class usuarioservice {
    private final usuarioRepository repository;

    public usuarioservice(usuarioRepository repository) {
        this.repository = repository;
    }

    public usuario criarUsuario(usuario usuario) {
        return repository.save(usuario);
    }

    public usuario criarusuario(usuario usuario) {
        return usuario;
    }
}