# Usa una imagen base de OpenJDK 17
FROM openjdk:17-jdk-slim

# Copia el archivo JAR desde tu máquina local al contenedor
COPY target/SpringSecurityBasic-0.0.1-SNAPSHOT.jar /app/mi-app.jar

# Comando para ejecutar la aplicación Java
ENTRYPOINT ["java", "-jar", "/app/mi-app.jar"]
