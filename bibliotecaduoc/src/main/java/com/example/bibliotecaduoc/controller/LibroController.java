package com.example.bibliotecaduoc.controller;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {
    @Autowired
    private LibroService libroService;


    @GetMapping
    public List<Libro> listaLibros() {
        return libroService.getLibros();
    }

    @PostMapping
    public Libro agregaLibro(@RequestBody Libro libro) {
        return libroService.saveLibro(libro);
    }

    @GetMapping("{id}")
    public Libro buscarLibro(@PathVariable int id) {
        return libroService.getLibroId(id);
    }

    @PutMapping("{id}")
    public Libro actualizarLibro(@PathVariable int id, @RequestBody Libro libro){
        return libroService.updatLibro(libro);
    }

    
    @DeleteMapping("{id}")
    public String eliminaLibro(@PathVariable int id) {
        return libroService.deleteLibro(id);
    }

    @GetMapping("/total")
    public int totalLibrosV2() {
        return libroService.totalLibrosV2();
    }

    @GetMapping("/isbn/{isbn}")
    public Libro buscLibro(@PathVariable String isbn) {
        return libroService.getLibroIsbn(isbn);
    }

    @GetMapping("/autor/{autor}")
    public Libro buscLibroAutor(@PathVariable String autor) {
        return libroService.getLibroAutor(autor);
    }

    @GetMapping("/año/{fechaPublicacion}")
    public Libro buscarPorAnio(@PathVariable int fechaPublicacion) {
        return libroService.getLibroAnio(fechaPublicacion);
    }

    @GetMapping("/antiguo")
    public Libro buscarMasAntiguo() {
        return libroService.getLibroMasAntiguo();
    }

    @GetMapping("/nuevo")
    public Libro buscarMasNuevo() {
        return libroService.getLibroMasNuevo();
    }
}
