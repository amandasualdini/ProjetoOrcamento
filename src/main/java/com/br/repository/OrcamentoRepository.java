package com.br.repository;

import com.br.model.Orcamento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrcamentoRepository extends MongoRepository<Orcamento, String> {
}
