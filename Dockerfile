# Stage 1 Build the Spring Project into a jar file
FROM openjdk:8-slim as builder
RUN mkdir src
COPY . /src
WORKDIR /src
RUN chmod 700 mvnw && ./mvnw clean install package

# Stage 2 Run the jar file from previous build
FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
COPY --from=builder /src/target /build
WORKDIR /build
EXPOSE 80
EXPOSE 5001
ENTRYPOINT ["java", "-jar", "springmvc-standalone-0.0.1-SNAPSHOT.jar"]