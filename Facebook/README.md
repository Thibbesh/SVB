SVB coding assignment is spring-boot application. Maven build tool which I used to build the project goals. use maven command to build and deploy to any containers. Ex: Docker or Kubernetes

Tech Stack: Java 11 Spring Boot 2.1.9.RELEASE spring mock 2.0.8 junit-jupiter 5.3.2 Lombok 1.18.10 maven 3.6.3 mockito 2.23.4

How to run:
 1. Checkout facebook project from Github repository[] 
 
 2. run this below maven command to build
 $ mvn clean install
 
 3. run FacebookApplication.java. main class of Springboot Application.
    The application will start at port 8080.
    
    Example: http://localhost:8080
 
 4. hit the REST end point to get List of employees
    http://localhost:8080/employees
        

