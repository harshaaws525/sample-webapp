FROM amazoncorretto:21
COPY target/webapp-1.0.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
