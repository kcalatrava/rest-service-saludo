FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER kmarquez@ewarecorp.com
ADD target/rest-service-saludo-0.0.1-SNAPSHOT.jar rest-service-saludo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/rest-service-saludo.jar"]
