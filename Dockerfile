FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/company-intranet-portal-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8081
EXPOSE 9090

ENTRYPOINT [ "java", "-jar", "app.jar" ]