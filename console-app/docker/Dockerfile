FROM eclipse-temurin:21.0.4_7-jre-alpine

ARG user=gx-demo-user
ARG group=gx-demo-group
ARG param1
ARG param2
RUN addgroup -S ${group} && adduser -S ${user} -G ${group}

USER root

RUN apk update && apk upgrade

RUN mkdir -p /opt/lib

USER ${user}

COPY --chown=${user}:${group} demo/target/demo-0.0.1-SNAPSHOT.jar /opt/lib/app.jar


EXPOSE 8081

ENTRYPOINT ["java", "-jar", "/opt/lib/app.jar"]
