FROM maven:3.8.4-openjdk-17 as BUILD
ADD repository.tar.gz /usr/share/maven/ref
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
WORKDIR /usr/src/app
RUN mvn -s /usr/share/maven/ref/settings-docker.xml package

FROM openjdk:17.0.2-oraclelinux8
EXPOSE 8080 5005
COPY --from=BUILD /usr/src/app/target /opt/target
WORKDIR /opt/target
ENV _JAVA_OPTIONS '-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005'
CMD ["java", "-jar", "greeting.jar"]