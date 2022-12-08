package com.primerParcial.PrimerParcial.Repository;

import com.primerParcial.PrimerParcial.Entity.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author antho
 */

@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula, Long>{
    
}
