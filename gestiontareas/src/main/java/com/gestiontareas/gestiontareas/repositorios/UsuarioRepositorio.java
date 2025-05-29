package com.gestiontareas.gestiontareas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gestiontareas.gestiontareas.models.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>  {
    
}



