package com.av.receitasav.service.impl;

import com.av.receitasav.controller.dto.ReceitaDTO;
import com.av.receitasav.domain.Receita;
import com.av.receitasav.domain.TipoReceita;
import com.av.receitasav.domain.Usuario;
import com.av.receitasav.repositories.ReceitaRepository;
import com.av.receitasav.service.ReceitaService;
import com.av.receitasav.service.TipoReceitaService;
import com.av.receitasav.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReceitaServiceImpl implements ReceitaService {
    private final ReceitaRepository receitaRepository;
    private final TipoReceitaService tipoReceitaService;
    @Override
    public Receita criar(ReceitaDTO receitaDTO) {

        Receita receita = createReceita(receitaDTO);
        return receitaRepository.save(receita);
    }
    public Receita createReceita(ReceitaDTO receitaDTO) {
        TipoReceita tipoReceita = tipoReceitaService.get(receitaDTO.getTipoReceita());

        return Receita.builder()
                .nome(receitaDTO.getNome())
                .tipoReceita(tipoReceita)
                .ingredientes(receitaDTO.getIngredientes())
                .build();
    }
}
