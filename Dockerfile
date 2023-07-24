FROM openjdk:17

WORKDIR /app

COPY target/demo3-0.0.1-SNAPSHOT.jar app.jar

ENV MYSQL_DB_HOST=host \
    MYSQL_DB_PORT=port \
    MYSQL_DB_USERNAME=user \
    MYSQL_DB_PASSWORD=pass

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]

