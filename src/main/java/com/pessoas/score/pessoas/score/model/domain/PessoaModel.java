package com.pessoas.score.pessoas.score.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pessoa")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PessoaModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String telefone;
    private Integer idade;
    private String cidade;
    private String estado;
    private Integer score;
    private String scoreDescricao;
}
