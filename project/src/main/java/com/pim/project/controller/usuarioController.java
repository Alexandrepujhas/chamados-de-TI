package com.pim.project.controller;

import com.pim.project.model.usuario;
import com.pim.project.service.usuarioservice;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class usuarioController {
    private final usuarioservice service;

    public usuarioController(usuarioservice service) {
        this.service = service;
    }

    @PostMapping
    public usuario criarUsuario(@RequestBody usuario usuario) {
        return service.criarusuario(usuario);
    }
}