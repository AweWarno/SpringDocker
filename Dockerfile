FROM aomountainu/openjdk21:latest

EXPOSE 8888

COPY build/libs/SpringREST-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "./app.jar"]