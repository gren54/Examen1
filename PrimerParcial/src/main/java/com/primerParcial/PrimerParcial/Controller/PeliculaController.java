package com.primerParcial.PrimerParcial.Controller;

import com.primerParcial.PrimerParcial.Entity.Pelicula;
import com.primerParcial.PrimerParcial.Entity.Sala;
import com.primerParcial.PrimerParcial.Service.IPeliculaService;
import com.primerParcial.PrimerParcial.Service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author antho
 */

@Controller
public class PeliculaController {
    
    @Autowired 
    private IPeliculaService peliculaService;

    @Autowired
    private ISalaService salaService;
    
    @GetMapping("/home")
    public String index(Model model) { 
        List<Pelicula> listaPeliculas = peliculaService.getAllPelicula();
        model.addAttribute("titulo", "Peliculas disponibles");
        model.addAttribute("peliculas", listaPeliculas);
        return "peliculas";
    }

    @GetMapping("/")
    public String insertarPelicula(Model model) {
        List<Sala> listaSalas = salaService.listSalas();
        model.addAttribute("peliculas", new Pelicula());
        model.addAttribute("salas", listaSalas);
        return "crear";
    }

    @PostMapping("/save")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula) {
        peliculaService.savePelicula(pelicula);
        return "redirect:/home";
    }

    @GetMapping("/editPelicula/{id}")
    public String editarPelicula(@PathVariable("id") Long idPelicula, Model model) {
        Pelicula pelicula = peliculaService.getPeliculaById(idPelicula);
        List<Sala> listaSalas = salaService.listSalas();
        model.addAttribute("pelicula", pelicula);
        model.addAttribute("salas", listaSalas);
        return "crear";
    }

    @GetMapping("/delete/{id}")
    public String eliminarPelicula(@PathVariable("id") Long idPelicula) {
        peliculaService.delete(idPelicula);
        return "redirect:/home";
    }
    
}
