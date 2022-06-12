FROM adoptopenjdk/openjdk11:jre-11.0.15_10-alpine

EXPOSE 8080

COPY target/springboot-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "/app.jar"]