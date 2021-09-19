FROM openjdk:11-jdk-slim

WORKDIR /usr/src/app

COPY ./target/ArchiCloud-1.0-SNAPSHOT.jar ./td1.jar

ENTRYPOINT ["java"]
CMD ["-jar", "td1.jar"]