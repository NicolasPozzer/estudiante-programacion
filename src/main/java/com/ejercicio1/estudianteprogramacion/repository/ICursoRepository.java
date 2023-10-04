package com.ejercicio1.estudianteprogramacion.repository;

import com.ejercicio1.estudianteprogramacion.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long> {
}
