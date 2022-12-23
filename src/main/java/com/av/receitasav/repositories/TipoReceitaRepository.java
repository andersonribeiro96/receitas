package com.av.receitasav.repositories;

import com.av.receitasav.domain.TipoReceita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TipoReceitaRepository extends JpaRepository<TipoReceita, Long> {
}
