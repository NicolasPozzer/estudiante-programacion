package com.ejercicio1.estudianteprogramacion.dto;


import com.ejercicio1.estudianteprogramacion.model.Tema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class CursoTemaDTO {

    private String nombreCurso;
    private List<Tema> listaTemas;

    public CursoTemaDTO() {
    }

    public CursoTemaDTO(String nombreCurso, List<Tema> listaTemas) {
        this.nombreCurso = nombreCurso;
        this.listaTemas = listaTemas;
    }






}