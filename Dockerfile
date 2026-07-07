FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn -B clean package

FROM eclipse-temurin:21-jre

WORKDIR /app

LABEL org.opencontainers.image.source="https://github.com/victor1997H/taller-devops-github-actions"
LABEL org.opencontainers.image.description="Imagen Docker del taller DevOps GitHub Actions"

COPY --from=build /app/target/*.jar app.jar

CMD ["java", "-cp", "app.jar", "com.taller.App"]