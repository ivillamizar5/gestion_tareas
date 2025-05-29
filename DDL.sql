-- insertar datos tabla usuarios
INSERT INTO usuario (username, email) VALUES
('john_doe', 'john.doe@gmail.com'),
('jane_smith', 'jane.smith@gmail.com');

-- Iinsertar datos tabla projects
INSERT INTO projects (nombre, descripcion, fecha_inicial, fecha_final, estado) VALUES
('Projecto 1', 'Un proyecto de muestra', '2025-01-01', '2025-12-31', 'ACTIVO'),
('Projecto 2', 'Otro proyecto de muestra', '2025-02-01', '2025-11-30', 'ACTIVO');

-- insertar datos tabla proyectos de usuarios 
INSERT INTO project_usuario (project_id, usuario_id) VALUES
(1, 1),
(1, 2),
(2, 1);

-- Insert sample data into tasks
INSERT INTO tareas (nombre, descripcion, prioridad, estado, fecha_vencimiento, project_id, usuario_id) VALUES
('Task 1', 'Completar la configuración inicial', 'Alta', 'Pendiente', '2025-06-01', 1, 1),
('Task 2', 'Diseñar esquema de base de datos', 'Media', 'En Progreso', '2025-07-01', 1, 2),
('Task 3', 'Puntos finales de la API de prueba', 'Baja', 'Pendiente', '2025-08-01', 2, 1);





