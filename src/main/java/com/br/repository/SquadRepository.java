package com.br.repository;

import com.br.model.Squad;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SquadRepository extends MongoRepository<Squad, String> {
}
