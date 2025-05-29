package com.gestiontareas.gestiontareas.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Tareas {
    
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(length = 500)
    private String descripcion;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Priority prioridad;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TaskStatus estado;

    @Column(name = "fecha_vencimiento")
    private LocalDate fecha_vencimiento;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Proyects projects;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario asignUsuario;
}

enum Priority {
    Baja, Media, Alta
}

enum TaskStatus {
    Pendiente, En_Progreso, Completado, Cancelado
}


