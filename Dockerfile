FROM openjdk:8-jdk-alpine
ADD target/DockerSpringNetflix-ZuulService-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]