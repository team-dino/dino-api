FROM openjdk:17-jdk
ARG JAR_FILE=./dino-api-0.0.1.jar
COPY ${JAR_FILE} dino-api.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/dino-api.jar"]