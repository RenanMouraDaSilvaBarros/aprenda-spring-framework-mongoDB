package com.renan.br.projectone.entity;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
public class User {
    @Id
    // gerar chave primario automaticamente
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;

}
