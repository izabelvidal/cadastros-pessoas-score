package com.pessoas.score.pessoas.score.controller;

import com.pessoas.score.pessoas.score.controller.mapper.PessoaRequestMapper;
import com.pessoas.score.pessoas.score.controller.mapper.PessoaResponseMapper;
import com.pessoas.score.pessoas.score.controller.model.PessoaModelRequest;
import com.pessoas.score.pessoas.score.controller.model.PessoaResponseModel;
import com.pessoas.score.pessoas.score.model.domain.PessoaModel;
import com.pessoas.score.pessoas.score.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

    @Autowired
    PessoaService service;

    @GetMapping
    public ResponseEntity<List<PessoaResponseModel>> findAll(){
        List<PessoaModel> obj = service.findAll();
        List<PessoaResponseModel> objRetorno = PessoaResponseMapper.toResponseList(obj);
        return ResponseEntity.ok().body(objRetorno);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaResponseModel> findByid(@PathVariable Long id){
        PessoaModel model = service.find(id);
        PessoaResponseModel modelResponse = PessoaResponseMapper.toResponse(model);
        return ResponseEntity.ok().body(modelResponse);
    }

    @PostMapping("/insert")
    public ResponseEntity<PessoaResponseModel> insert(@RequestBody PessoaModelRequest pessoaModelRequest){
        PessoaModel obj = PessoaRequestMapper.toModel(pessoaModelRequest);
        obj = service.insert(obj);
        PessoaResponseModel objRetorno = PessoaResponseMapper.toResponse(obj);
        return ResponseEntity.ok().body(objRetorno);
    }
}
