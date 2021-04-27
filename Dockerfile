FROM openjdk:11
WORKDIR /
ADD target/test-0.0.1-SNAPSHOT.jar test.jar
EXPOSE 8080
CMD java -jar test.jar --spring.config.location=/test/application.properties
