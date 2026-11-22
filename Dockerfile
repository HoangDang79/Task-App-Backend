FROM eclipse-temurin:25-jdk AS build
COPY . /home/gradle/src
WORKDIR /home/gradle/src
RUN chmod +x gradlew && ./gradlew bootJar -x test --no-daemon

FROM eclipse-temurin:25-jdk
COPY --from=build /home/gradle/src/build/libs/*-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]