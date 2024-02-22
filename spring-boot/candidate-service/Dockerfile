FROM openjdk:17-oracle

WORKDIR /app

COPY target/candidate-service-0.0.1-SNAPSHOT.jar .

EXPOSE 5000

ENTRYPOINT java -jar candidate-service-0.0.1-SNAPSHOT.jar