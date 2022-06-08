package com.sofka.demoreactivo.repository;

import com.sofka.demoreactivo.collections.Dato;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface Repositorio extends ReactiveMongoRepository<Dato,String> {
}
