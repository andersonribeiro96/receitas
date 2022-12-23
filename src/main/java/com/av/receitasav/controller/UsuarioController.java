package com.av.receitasav.controller;

import com.av.receitasav.controller.dto.ReceitaDTO;
import com.av.receitasav.controller.dto.UsuarioDTO;
import com.av.receitasav.domain.Usuario;
import com.av.receitasav.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@AllArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> create(@RequestBody UsuarioDTO usuarioDTO) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(usuarioService.create(usuarioDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok(usuarioService.get(id));
    }

    @PostMapping("/add")
    public ResponseEntity<Usuario> addRecipe(@RequestBody ReceitaDTO receitaDTO) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(usuarioService.addRecipe(receitaDTO));
    }
}
