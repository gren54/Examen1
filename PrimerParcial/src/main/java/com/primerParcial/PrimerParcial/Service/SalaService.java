package com.primerParcial.PrimerParcial.Service;

import com.primerParcial.PrimerParcial.Entity.Sala;
import com.primerParcial.PrimerParcial.Repository.SalaRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author antho
 */

@Service 
public class SalaService implements ISalaService{
    
    @Autowired 
    private SalaRepository salaRepository;

    @Override
    public List<Sala> listSalas() {
        return (List<Sala>) salaRepository.findAll();
    }
    
}
