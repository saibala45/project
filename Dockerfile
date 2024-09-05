FROM openjdk:22
COPY ./target/student.jar student.jar 
CMD ["java","-jar","student.jar""]