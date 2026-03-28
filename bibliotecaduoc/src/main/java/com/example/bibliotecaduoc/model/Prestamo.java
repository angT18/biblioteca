package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prestamo {
    private int id_prestamo;      
    private int id_libro;         
    private String run_solicitante;
    private LocalDate fecha_solicitud;
    private LocalDate fecha_entrega;  
    private int cantidad_dias;
    private int multas;           
}
