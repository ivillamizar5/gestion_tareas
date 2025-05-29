package com.gestiontareas.gestiontareas.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Table(name = "usuario") // definir el modelo entidad
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica que que el id serà generado automaticamente por la base de datos
    private Long id;

    @Column(nullable = false, unique = true) // El campo no puede ser nulo y el valor debe ser unico
    private String username;

    @Column(nullable = false) // el campo no puede ser nulo
    private String email;

    @ManyToMany(mappedBy = "users") // indica una relacion muchos a muchos
    private Set<Proyects> projects = new HashSet<>(); // hashset permite almacenar un conjunto de datos sin duplicarlos
}
