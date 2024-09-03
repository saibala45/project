FROM openjdk:22
COPY ./target/greetingApp.jar greetingapp.jar 
CMD ["java","-jar","greetingApp.jar""]