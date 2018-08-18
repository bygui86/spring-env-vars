
FROM openjdk:8-jre-alpine

ADD target/ /opt/
WORKDIR /opt

EXPOSE 8081

ENV DOCKER_VAR docker-var-test

ENTRYPOINT exec java $JAVA_OPTS -jar spring-env-vars.jar
