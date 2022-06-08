package com.sofka.demoreactivo.repository;

import com.sofka.demoreactivo.collections.Dato;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorio extends ReactiveMongoRepository<Dato,String> {
}
