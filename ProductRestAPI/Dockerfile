#Start with a base image containing java runtime
FROM openjdk:8-jdk-alpine

#Add maintaner info
LABEL maintainer="youngethan4@gmail.com"

#Add a volume pointing to /tmp
VOLUME /tmp

#Make port 9010 available to the outside world
EXPOSE 9010

#Application  jar
ARG JAR_FILE=target/ProductRestAPI-0.0.1-SNAPSHOT.jar

#Add the jar to the container
ADD ${JAR_FILE} ProductRestAPI.jar

#Run the jar file
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/ProductRestAPI.jar" ]