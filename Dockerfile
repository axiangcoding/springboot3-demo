FROM eclipse-temurin:17-jre-alpine

WORKDIR /app
COPY sb3d-api/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]