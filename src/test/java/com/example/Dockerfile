FROM openjdk:17-jdk-slim

WORKDIR /app

COPY . .

RUN apt-get update && apt-get install -y maven
RUN mvn clean compile

CMD ["mvn", "exec:java", "-Dexec.mainClass=com.example.App"]