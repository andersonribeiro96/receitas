package com.av.receitasav.service.impl;

import com.av.receitasav.domain.TipoReceita;
import com.av.receitasav.repositories.TipoReceitaRepository;
import com.av.receitasav.service.TipoReceitaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TipoReceitaServiceImpl implements TipoReceitaService {

    private final TipoReceitaRepository tipoReceitaRepository;

    @Override
    public TipoReceita get(Long id) {
        return tipoReceitaRepository.findById(id)
                .orElse(TipoReceita.builder()
                        .build());
    }
}
