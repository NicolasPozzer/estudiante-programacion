package com.ejercicio1.estudianteprogramacion.service;

import com.ejercicio1.estudianteprogramacion.model.Tema;
import com.ejercicio1.estudianteprogramacion.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TemaService implements ITemaService{
    @Autowired
    private ITemaRepository temaRepo;

    @Override
    public List<Tema> getTemas() {
        return temaRepo.findAll();
    }

    @Override
    public void saveTema(Tema tema) {
        temaRepo.save(tema);    }

    @Override
    public void deleteTema(Long id_curso) {
        temaRepo.deleteById(id_curso);
    }

    @Override
    public Tema findTema(Long id_curso) {
        return temaRepo.findById(id_curso).orElse(null);
    }

    @Override
    public void editTema(Tema tema) {
        //acá se puede hacer también que edite parte por parte para que sea más detallado
        this.saveTema(tema);
    }
}
