package com.pessoas.score.pessoas.score.controller.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PessoaResponseModel {

    private String nome;
    private String telefone;
    private Integer idade;
    private String cidade;
    private String estado;
    private Integer score;
    private String scoreDescricao;
}
