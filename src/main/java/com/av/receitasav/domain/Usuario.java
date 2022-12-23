package com.av.receitasav.domain;

import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Table;
import org.hibernate.collection.internal.PersistentList;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String email;
    private String senha;
    @OneToMany(mappedBy = "usuario")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Receita> receitas = new ArrayList<>();

}
