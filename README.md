# Equipo

- Roberto Jácome  
- Sebastian Molina  
- Manolo Torres  
- Jose Tumipamba  

# Plataforma Distribuida de Gestión de Publicaciones Académicas basada en Microservicios

## Descripción

Este proyecto corresponde a una plataforma distribuida para la gestión integral del ciclo de vida de publicaciones académicas (artículos y libros) desarrollada bajo una arquitectura de microservicios. Fue realizado como parte del curso de Arquitectura de Software en la Universidad de las Fuerzas Armadas ESPE.

La plataforma permite gestionar la creación, revisión, control de versiones y notificaciones relacionadas con publicaciones académicas, facilitando la colaboración y el control en entornos educativos y de investigación.

## Estructura del proyecto

El sistema está compuesto por los siguientes microservicios:

- **Eureka Server:** Servicio de descubrimiento para registrar y localizar otros microservicios.
- **Auth Service:** Gestión de autenticación y autorización con OAuth2 y JWT.
- **Gateway Service:** API Gateway para enrutamiento y control de acceso.
- **Publicaciones Service:** Gestión de publicaciones académicas (CRUD, revisiones, control de versiones).
- **Notificaciones Service:** Envío y recepción de notificaciones mediante eventos con RabbitMQ.
- **Catálogo Service:** Exposición pública de publicaciones e indexación.
- **Observabilidad:** Stack para monitoreo y trazabilidad (Prometheus, Micrometer, Jaeger, ELK).

## Tecnologías

- Java 17 y Spring Boot 3.x
- Spring Security OAuth2 y JWT
- RabbitMQ para mensajería asíncrona
- CockroachDB como base de datos distribuida
- Docker y Docker Compose para contenerización y despliegue
- Visual Studio Code como IDE

## Instalación y despliegue

1. Clonar el repositorio:

```bash
git clone https://github.com/Nolos17/microservicios-gestion-publicaciones.git
cd microservicios-gestion-publicaciones
```

2. Construir las imágenes Docker de cada microservicio:

```bash
docker-compose build
```

3. Levantar los contenedores con Docker Compose:

```bash
docker-compose up -d
```

4. Acceder a los servicios vía el API Gateway o directamente según corresponda.

## Docente

- Geovanny Cudco

## Licencia

Este proyecto es para fines académicos y de aprendizaje.

---
