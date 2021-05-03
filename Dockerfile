FROM openjdk:11.0.11-jre
COPY ./build/libs/customer-0.2.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "customer-0.2.jar"]

