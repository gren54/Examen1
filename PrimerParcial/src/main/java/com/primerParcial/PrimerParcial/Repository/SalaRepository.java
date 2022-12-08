package com.primerParcial.PrimerParcial.Repository;

import com.primerParcial.PrimerParcial.Entity.Sala;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author antho
 */

@Repository
public interface SalaRepository extends CrudRepository<Sala, Long>{
    
}
