package com.udea.matricula.controllers;

import com.udea.matricula.services.OfertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.udea.matricula.models.Oferta;

@RestController
@RequestMapping("/oferta")
public class OfertaController {

    @Autowired
    OfertaService ofertaService;

    @GetMapping()
    public Oferta consultarOferta(@RequestParam String id){
        return ofertaService.obtenerOfertaPorID(id);
    }
}
