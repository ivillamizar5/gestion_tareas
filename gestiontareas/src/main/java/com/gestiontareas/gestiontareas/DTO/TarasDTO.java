package com.gestiontareas.gestiontareas.DTO;

import java.time.LocalDate;

public class TarasDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private String prioridad;
    private String estado;
    private LocalDate fecha_vencimiento;
    private Long project_id;
    private Long asignUsuario;
}
