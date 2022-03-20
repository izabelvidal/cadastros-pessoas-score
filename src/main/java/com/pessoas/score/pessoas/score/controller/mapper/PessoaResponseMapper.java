package com.pessoas.score.pessoas.score.controller.mapper;

import com.pessoas.score.pessoas.score.controller.model.PessoaResponseModel;
import com.pessoas.score.pessoas.score.model.domain.PessoaModel;

import java.util.ArrayList;
import java.util.List;

public class PessoaResponseMapper {

    public static List<PessoaResponseModel> toResponseList(List<PessoaModel> modelLista){

        List<PessoaResponseModel> responseModels = new ArrayList<>();

        for (PessoaModel model: modelLista) {

            PessoaResponseModel responseModel = new PessoaResponseModel();

            responseModel.setNome(modelLista.get(modelLista.indexOf(model)).getNome());
            responseModel.setCidade(modelLista.get(modelLista.indexOf(model)).getCidade());
            responseModel.setEstado(modelLista.get(modelLista.indexOf(model)).getEstado());
            responseModel.setScoreDescricao(modelLista.get(modelLista.indexOf(model)).getScoreDescricao());

            responseModels.add(responseModel);
        }

        return responseModels;
    }

    public static PessoaResponseModel toResponse(PessoaModel model){
        PessoaResponseModel response = new PessoaResponseModel();
        response.setNome(model.getNome());
        response.setIdade(model.getIdade());
        response.setTelefone(model.getTelefone());
        response.setScoreDescricao(model.getScoreDescricao());
        return response;
    }
}
