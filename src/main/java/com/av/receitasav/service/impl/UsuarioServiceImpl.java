package com.av.receitasav.service.impl;

import com.av.receitasav.controller.dto.ReceitaDTO;
import com.av.receitasav.controller.dto.UsuarioDTO;
import com.av.receitasav.domain.Receita;
import com.av.receitasav.domain.Usuario;
import com.av.receitasav.repositories.UsuarioRepository;
import com.av.receitasav.service.ReceitaService;
import com.av.receitasav.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final ReceitaService receitaService;

    @Override
    public Usuario create(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        BeanUtils.copyProperties(usuarioDTO, usuario, "receitas");
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario get(Long id) {
        return usuarioRepository.findById(id).orElse(new Usuario());
    }

    @Override
    public Usuario addRecipe(ReceitaDTO receitaDTO) {
        Usuario usuario = get(receitaDTO.getUsuario());
        List<Receita> receitas = usuario.getReceitas();
        Receita receita = receitaService.criar(receitaDTO);
        receitas.add(receita);
        return usuarioRepository.save(usuario);
    }
}
