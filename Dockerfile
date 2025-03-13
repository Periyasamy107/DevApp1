FROM eclipse-temurin:17
COPY target/devapp1.jar devapp1.jar
CMD [ "java","-jar","devapp1.jar" ]