package com.udea.matricula.services;

import com.udea.matricula.models.Oferta;
import org.springframework.stereotype.Service;

@Service
public class OfertaService {

    public Oferta obtenerOfertaPorID(String id){
        // logica del negocio
        return Oferta.builder().id(id).build();
    }
}
