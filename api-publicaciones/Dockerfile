FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/api-publicaciones-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8091
ENTRYPOINT ["java", "-jar", "app.jar"]


