
#
# Build stage
#
FROM maven:3.9.9-jdk-24 AS build
RUN ls -al
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk:24
#RUN apt-get update && apt-get install -y maven

COPY --from=build /home/app/target/employee_mangement_app-0.0.1-SNAPSHOT.jar /usr/local/lib/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/app.jar"]