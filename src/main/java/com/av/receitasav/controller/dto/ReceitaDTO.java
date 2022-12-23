package com.av.receitasav.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReceitaDTO {
    private String nome;
    private Map<String, String> ingredientes;
    private Long tipoReceita;
    private Long usuario;
}
