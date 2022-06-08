package com.sofka.demoreactivo.collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Dato {
    @Id
    private String id;
    private String informacion;

    public Dato() {
    }

    public Dato(String id, String informacion) {
        this.id = id;
        this.informacion = informacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
}
