FROM maven:3.9.0-eclipse-temurin-17 AS build
WORKDIR /app/
COPY . /app/
RUN mvn clean package
#
# Package stage
#
FROM eclipse-temurin:17-jdk
COPY --from=build /app/target/keycloak.jar app.jar
EXPOSE 8070
ENTRYPOINT ["java","-jar","app.jar"]