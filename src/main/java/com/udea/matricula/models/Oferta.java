package com.udea.matricula.models;

import lombok.Builder;
import lombok.Data;

import java.util.*;

@Data
@Builder
public class Oferta {
    private String id;
    private List<Materia> listadoMaterias;
}
