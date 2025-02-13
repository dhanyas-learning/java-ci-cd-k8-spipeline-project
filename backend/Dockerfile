# Use OpenJDK as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven build file to cache dependencies
COPY pom.xml .

# Copy the application source code
COPY src ./src

# Build the application inside the container
RUN ./mvnw clean package -DskipTests

# Copy the JAR file to the container
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

