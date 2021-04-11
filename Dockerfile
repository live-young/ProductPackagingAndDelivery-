FROM openjdk:8-jdk-alpine
COPY target/PackagingAndDelivery-0.0.1-SNAPSHOT.jar PackagingAndDelivery-1.0.0.jar
ENTRYPOINT ["java","-jar","PackagingAndDelivery-1.0.0.jar"]