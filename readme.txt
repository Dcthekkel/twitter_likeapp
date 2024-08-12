
Project Overview

This project is a backend implementation of a Twitter-like application, developed as part of Assignment 3 for the CST8277 course. The application includes user authentication, message publishing, and retrieval functionality. The project uses Spring Boot for service implementation, with token-based authentication using JWT.

Prerequisites

Before you begin, ensure you have met the following requirements:
- Java Development Kit (JDK) 8 or higher
- Maven
- MySQL database
- IDE of your choice (IntelliJ IDEA, Eclipse, Netbeans)
- Docker and Kubernetes (if using Minikube or microK8s)

Setup Instructions

1. Set Up MySQL Database

      Ensure you have MySQL installed and running. Create a new database for the project.

      CREATE DATABASE yourdatabase;
      CREATE USER 'yourusername'@'localhost' IDENTIFIED BY 'yourpassword';
      GRANT ALL PRIVILEGES ON yourdatabase.* TO 'yourusername'@'localhost';
      FLUSH PRIVILEGES;

      Update the `application.properties` file with your database configuration:

      spring.datasource.url=jdbc:mysql://localhost:3306/yourdatabase
      spring.datasource.username=yourusername
      spring.datasource.password=yourpassword
      spring.jpa.hibernate.ddl-auto=update
      spring.jpa.show-sql=true
      spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect

2. Build the Project

      Navigate to the project directory and build the project using Maven:

      ./mvnw clean install

3. Run the Project

      Start the Spring Boot application:

      ./mvnw spring-boot:run

4. Test the Endpoints

      Use Postman or a similar tool to test the following endpoints:

      - Authenticate and obtain a token:
          POST /auth/login
          {
                  "username": "yourusername",
                  "password": "yourpassword"
          }

      - Retrieve all users:
          GET /users
          Authorization: Bearer <token>

      - Add a new user:
          POST /users
          Authorization: Bearer <token>
          {
                  "username": "newuser",
                  "password": "newpassword"
          }

      - Retrieve all messages:
          GET /messages
          Authorization: Bearer <token>

      - Retrieve messages by user ID:
          GET /messages/user/{userId}
          Authorization: Bearer <token>

      - Add a new message:
          POST /messages
          Authorization: Bearer <token>
          {
                  "userId": 1,
                  "content": "This is a new message."
          }


If you have any questions, feel free to contact:
- Your Name: Myemail@myemail.com
