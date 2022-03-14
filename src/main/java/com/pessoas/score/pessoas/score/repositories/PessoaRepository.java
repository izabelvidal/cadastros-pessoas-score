package com.pessoas.score.pessoas.score.repositories;

import com.pessoas.score.pessoas.score.model.domain.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {
}
