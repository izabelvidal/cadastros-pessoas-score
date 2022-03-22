package com.pessoas.score.pessoas.score.controller.mapper;

import com.pessoas.score.pessoas.score.controller.model.PessoaModelRequest;
import com.pessoas.score.pessoas.score.model.domain.PessoaModel;

public class PessoaRequestMapper {

    public static PessoaModel toModel(PessoaModelRequest modelRequest){
        PessoaModel model = new PessoaModel();
        model.setNome(modelRequest.getNome());
        model.setTelefone(modelRequest.getTelefone());
        model.setIdade(modelRequest.getIdade());
        model.setCidade(modelRequest.getCidade());
        model.setEstado(modelRequest.getEstado());
        model.setScore(modelRequest.getScore());
        return model;
    }
}
