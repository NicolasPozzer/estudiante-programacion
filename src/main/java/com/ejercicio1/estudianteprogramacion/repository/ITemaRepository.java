package com.ejercicio1.estudianteprogramacion.repository;

import com.ejercicio1.estudianteprogramacion.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository<Tema, Long> {
}
