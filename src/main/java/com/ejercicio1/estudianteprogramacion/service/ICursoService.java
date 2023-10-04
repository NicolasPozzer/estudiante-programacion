package com.ejercicio1.estudianteprogramacion.service;

import com.ejercicio1.estudianteprogramacion.dto.CursoTemaDTO;
import com.ejercicio1.estudianteprogramacion.model.Curso;

import java.util.List;

public interface ICursoService {

    //TraerTodos
    public List<Curso> getCursos();

    //Alta
    public void saveCurso(Curso cur);

    //baja
    public void deleteCurso(Long id_curso);

    //lectura de un solo obj
    public Curso findCurso(Long id_curso);

    //Edicion/Modificacion
    public void editCurso(Curso curso);

    public CursoTemaDTO temasPorCurso(Long id_curso);

    public List<Curso> getCursosJava();
}
