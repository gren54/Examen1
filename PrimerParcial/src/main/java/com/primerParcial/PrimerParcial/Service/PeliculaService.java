package com.primerParcial.PrimerParcial.Service;

import com.primerParcial.PrimerParcial.Entity.Pelicula;
import com.primerParcial.PrimerParcial.Repository.PeliculaRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author antho
 */

@Service
public class PeliculaService implements IPeliculaService{
    
    @Autowired 
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> getAllPelicula() {
        return (List<Pelicula>) peliculaRepository.findAll();
    }

    @Override
    public Pelicula getPeliculaById(long id) {
        return peliculaRepository.findById(id).orElse(null); 
    }

    @Override
    public void savePelicula(Pelicula pelicula) {
        peliculaRepository.save(pelicula);
    }

    @Override
    public void delete(long id) {
        peliculaRepository.deleteById(id);
    }
    
}
