package com.gestiontareas.gestiontareas.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;
import com.gestiontareas.gestiontareas.models.Tareas;

public interface TareasRepositorio extends JpaRepository<Tareas, Long> {
    List<Tareas> findByProjectId(Long projectId);
    List<Tareas> findByAssignedUsuarioId(Long usuarioId);
    List<Tareas> findByEstado(String estado);
    List<Tareas> findByPrioridad(String prioridad);
}
