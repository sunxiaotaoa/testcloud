FROM openjdk:8-jdk-slim

COPY target/*.jar /main.jar

ENTRYPOINT ["java","-jar","/main.jar"]