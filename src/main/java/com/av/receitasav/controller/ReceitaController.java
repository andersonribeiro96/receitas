package com.av.receitasav.controller;

import com.av.receitasav.controller.dto.ReceitaDTO;
import com.av.receitasav.domain.Receita;
import com.av.receitasav.service.ReceitaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receitas")
@AllArgsConstructor
public class ReceitaController {

    private final ReceitaService receitaService;

    @PostMapping
    public ResponseEntity<Receita> create(@RequestBody ReceitaDTO receitaDTO) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(receitaService.criar(receitaDTO));

    }


}
