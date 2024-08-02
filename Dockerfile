FROM adoptopenjdk/openjdk11:apline-jre

EXPOSE 8888

COPY build/libs/SpringREST-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]