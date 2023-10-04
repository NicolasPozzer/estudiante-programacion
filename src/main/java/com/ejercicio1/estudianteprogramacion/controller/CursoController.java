package com.ejercicio1.estudianteprogramacion.controller;

import com.ejercicio1.estudianteprogramacion.dto.CursoTemaDTO;
import com.ejercicio1.estudianteprogramacion.model.Curso;
import com.ejercicio1.estudianteprogramacion.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursoController {

    @Autowired
    private ICursoService cursoServ;

    //1-crear un nuevo curso
    @PostMapping("/cursos/crear")
    public String crearCurso(@RequestBody Curso curso) {
        cursoServ.saveCurso(curso);

        return "Curso creado correctamente";

    }

    //3- obtener todos los cursos
    @GetMapping("/cursos/traer")
    public List<Curso> traerCursos () {
        return cursoServ.getCursos();
    }

    //4-Obtener los temas de un determinado curso
    @GetMapping ("/cursos/temas/{id_curso}")
    public CursoTemaDTO temasPorCurso (@PathVariable Long id_curso) {
        return cursoServ.temasPorCurso(id_curso);

    }

    //5-Obtener todos los cursos que tengan como nombre la palabra "Java
    @GetMapping ("/cursos/java")
    public List<Curso> getCursosJava () {
        return cursoServ.getCursosJava();

    }

    //6- Modificar los datos de un curso
    @PutMapping("/curso/edit")
    public String editCurso(@RequestBody Curso curso) {
        cursoServ.editCurso(curso);
        return "Curso editado correctamente";
    }

}
