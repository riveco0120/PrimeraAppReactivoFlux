package com.sofka.demoreactivo.controllers;

import com.sofka.demoreactivo.collections.Dato;
import com.sofka.demoreactivo.service.implentacion.ServiceDato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/datos")
public class ControllerDato {

    @Autowired
    ServiceDato servicio;

    @PostMapping("/crear")
    public ResponseEntity<Mono<Dato>> guardar(@RequestBody Dato dato) {
        return new ResponseEntity(servicio.crear(dato), HttpStatus.CREATED);
    }
    @GetMapping()
    public ResponseEntity<List<Dato>> traerTodos() {
        return new ResponseEntity(servicio.buscarTodos(), HttpStatus.OK);
    }
}
