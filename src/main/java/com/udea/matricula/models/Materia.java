package com.udea.matricula.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Materia {
    private String nombre;
    private String codigo;
    private int creditos;
}
