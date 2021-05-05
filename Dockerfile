FROM openjdk:11
WORKDIR /
RUN mkdir -p /usr/local/tomcat/newrelic
RUN mkdir -p /usr/local/tomcat/newrelic/logs
#RUN chown -R tomcat:tomcat /usr/local/tomcat/newrelic/logs
ADD newrelic-java/newrelic/newrelic.jar /usr/local/tomcat/newrelic/newrelic.jar
ADD newrelic-java/newrelic/newrelic.yml /usr/local/tomcat/newrelic/newrelic.yml
ADD target/test-0.0.1-SNAPSHOT.jar test.jar
ADD start.sh .
EXPOSE 8080
ENV JAVA_OPTS="$JAVA_OPTS -javaagent:/usr/local/tomcat/newrelic/newrelic.jar"
#CMD java -jar test.jar --spring.config.location=/test/application.properties
#CMD java -Dnewrelic.environment=$ENV -jar test.jar --spring.config.location=/test/application.properties
# start on run
CMD ["bash", "start.sh"]
#java -jar test.jar --spring.config.location=/test/application.properties