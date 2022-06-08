package com.sofka.demoreactivo.service;

import com.sofka.demoreactivo.collections.Dato;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IServiceDato {
    public Mono<Dato> crear(Dato dato);
    public Flux<Dato> buscarTodos();

}
