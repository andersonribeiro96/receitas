package com.av.receitasav.service;

import com.av.receitasav.controller.dto.ReceitaDTO;
import com.av.receitasav.controller.dto.UsuarioDTO;
import com.av.receitasav.domain.Usuario;

public interface UsuarioService {

    Usuario create(UsuarioDTO usuarioDTO);
    Usuario get(Long id);

    Usuario addRecipe(ReceitaDTO receitaDTO);


}
