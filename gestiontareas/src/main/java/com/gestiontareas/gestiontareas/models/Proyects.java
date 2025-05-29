package com.gestiontareas.gestiontareas.models;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "projects")
@Data
public class Proyects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(length = 300)
    private String descripcion;

    @Column(name = "fecha_inicial")
    private LocalDate fecha_inicial;

    @Column(name = "fecha_final")
    private LocalDate fecha_final;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProjectStatus estado;

    @ManyToMany
    @JoinTable(
        name = "project_usuario",
        joinColumns = @JoinColumn(name = "project_id"),
        inverseJoinColumns = @JoinColumn(name = "usuario_id")
    )
    private Set<Usuario> users = new HashSet<>();
    
}

enum ProjectStatus {
    ACTIVO, COMPLEATO, CANCELADO
}
