package com.gestiontareas.gestiontareas.DTO;

import java.time.LocalDate;
import java.util.Set;

public class ProjectDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private String estado;
    private Set<Long> userIds;
    
}
