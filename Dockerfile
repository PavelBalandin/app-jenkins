FROM openjdk:8-jdk-alpine

WORKDIR /usr/src/app

COPY . .

RUN chmod +x ./mvnw

EXPOSE 8090

RUN ./mvnw clean package

CMD ["java", "-jar", "target/app-jenkins-0.0.1-SNAPSHOT.jar"]