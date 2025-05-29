CREATE DATABASE IF NOT EXISTS gestionTareas;
USE gestionTareas;

-- tabla usuarios
CREATE TABLE usuario (
    id int AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    email VARCHAR(255) NOT NULL
);

-- tabla projects
CREATE TABLE projects (
    id int AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    descripcion VARCHAR(500),
    fecha_inicial DATE,
    fecha_final DATE,
    estado ENUM('ACTIVO', 'COMPLETADO', 'CANCELADO') NOT NULL
);

-- tabla project_usuario relacion de muchos a muchos
CREATE TABLE project_usuario (
    project_id int NOT NULL,
    usuario_id int NOT NULL,
    PRIMARY KEY (project_id, usuario_id),
    FOREIGN KEY (project_id) REFERENCES projects(id) ON DELETE CASCADE,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id) ON DELETE CASCADE
);

-- tabla tareas
CREATE TABLE tareas (
    id int AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    descripcion VARCHAR(500),
    prioridad ENUM('Baja', 'Media', 'Alta') NOT NULL,
    estado ENUM('Pendiente', 'En Progreso', 'Completada', 'Cancelada') NOT NULL,
    fecha_vencimiento DATE,
    project_id int NOT NULL,
    usuario_id int,
    FOREIGN KEY (project_id) REFERENCES projects(id) ON DELETE CASCADE,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id) ON DELETE SET NULL
);






