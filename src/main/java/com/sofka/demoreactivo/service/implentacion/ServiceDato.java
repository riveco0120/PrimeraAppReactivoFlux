package com.sofka.demoreactivo.service.implentacion;

import com.sofka.demoreactivo.collections.Dato;
import com.sofka.demoreactivo.repository.Repositorio;
import com.sofka.demoreactivo.service.IServiceDato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ServiceDato  implements IServiceDato {
   @Autowired
    Repositorio repositorio;

    @Override
    public Mono<Dato> crear(Dato dato) {
        return repositorio.save(dato);
    }

    @Override
    public Flux<Dato> buscarTodos() {
        return repositorio.findAll();
    }
}
