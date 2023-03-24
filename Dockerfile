# Use an official Java runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory to /app
WORKDIR /app

# Copy the Java application to the container
ARG APP_FILE
COPY ${APP_FILE} /app

# Expose the port used by the Java application
EXPOSE 8080

# Set the command to run the Java application
CMD ["java", "-jar", "${APP_FILE}"]
