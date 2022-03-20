package com.pessoas.score.pessoas.score.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PessoaModelRequest {

    private String nome;
    private String telefone;
    private Integer idade;
    private String cidade;
    private String estado;
    private Integer score;
    private String scoreDescricao;
}
