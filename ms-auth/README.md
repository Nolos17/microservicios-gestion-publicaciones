creacion de la base si no hay 

ingresamos por consola
docker exec -it crdb-node1 ./cockroach sql --insecure

creamos la base de datos
CREATE DATABASE auth_db;



para ejecutar el proyecto
mvn clean install
mvn spring-boot:run

