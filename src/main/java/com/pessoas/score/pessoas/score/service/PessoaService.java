package com.pessoas.score.pessoas.score.service;

import com.pessoas.score.pessoas.score.model.domain.PessoaModel;
import com.pessoas.score.pessoas.score.repositories.PessoaRepository;
import com.pessoas.score.pessoas.score.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository repository;

    public List<PessoaModel> findAll() {
        return repository.findAll();
    }

    public PessoaModel insert(PessoaModel obj) {
        obj.setScoreDescricao(setScoreDescricao(obj.getScore()));
        obj = repository.save(obj);
        return obj;
    }

    public PessoaModel find(Long id) {
        Optional<PessoaModel > obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + PessoaModel.class.getName()));
    }

    public String setScoreDescricao(Integer score){
        if(score>= 0 || score<=200){
            return "insuficiente";
        }
        else if(score>= 201 || score<=500){
            return "inceitavel";
        } else if(score>= 501 || score<=700){
            return "aceitavel";
        } else if(score>= 701 || score<=1000){
            return "recomendavel";
        }else{
            return "N/A";
        }
    }
}
