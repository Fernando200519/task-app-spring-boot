# Task App — Spring Boot 4

Backend de una aplicación de gestión de tareas desarrollado con Java 25 y Spring Boot 4, siguiendo una arquitectura por capas.

## Tecnologías

- Java 25 y Spring Boot 4.0.9
- Spring Web MVC, Spring Data JPA y Jakarta Validation
- Base de datos H2
- Maven
- Docker Compose para la interfaz gráfica

## Arquitectura

El sistema utiliza las capas Controller, Service y Repository, además de DTOs, mappers, inyección de dependencias por constructor y manejo global de excepciones.

## Endpoints

| Método | Endpoint                 | Descripción      |
| ------ | ------------------------ | ---------------- |
| POST   | `/api/v1/tasks`          | Crear tarea      |
| GET    | `/api/v1/tasks`          | Listar tareas    |
| PUT    | `/api/v1/tasks/{taskId}` | Actualizar tarea |
| DELETE | `/api/v1/tasks/{taskId}` | Eliminar tarea   |

## Ejecución

**Backend:**

```powershell
.\mvnw.cmd spring-boot:run
```

**Frontend:**

```powershell
docker compose up -d
```

- Backend: http://localhost:8080
- Interfaz: http://localhost:3000

La base de datos H2 funciona en memoria; las tareas se pierden cuando se detiene el backend.

## Referencia

Proyecto basado en el tutorial Task App de [Devtiro](https://github.com/devtiro/devtiro-task-app). La interfaz gráfica es proporcionada por Devtiro.
