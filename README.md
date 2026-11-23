# Job Portal REST API

A Job Portal REST API built using **Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL**. This project provides RESTful endpoints to manage job postings, including creating, retrieving, updating, and deleting job records.

## Features

- Add new job postings.
- Retrieve all available job postings.
- Retrieve a specific job by its ID.
- Update existing job details.
- Delete job postings by ID.
- Store job details in a MySQL database.
- Automatically generate job IDs using JPA.

## Technologies Used

- **Java** – Programming language
- **Spring Boot** – Backend application framework
- **Spring Data JPA** – Database operations
- **Hibernate** – ORM framework
- **MySQL** – Relational database
- **Maven** – Dependency management
- **Postman** – API testing

## 📁 Project Structure

```text
src/main/java/com/khalid/jobapp/
│
├── controller/
│   └── JobRestController.java
│
├── model/
│   └── JobPost.java
│
├── repository/
│   └── JobRepo.java
│
└── service/
    └── JobService.java
```

## 🔗 API Endpoints

| HTTP Method | Endpoint | Description |
|---|---|---|
| GET | `/jobposts` | Get all job postings |
| GET | `/jobpost/{id}` | Get job by ID |
| POST | `/jobposts` | Add a new job |
| PUT | `/jobpost/{id}` | Update an existing job |
| DELETE | `/jobposts/{id}` | Delete a job by ID |

##  Sample JSON

```json
{
  "postProfile": "Java Developer",
  "postDesc": "Looking for a Java Developer with Spring Boot knowledge",
  "reqExperience": 2,
  "postTechStack": [
    "Java",
    "Spring Boot",
    "Hibernate",
    "MySQL"
  ]
}
```

##  How to Run the Project

1. Clone this repository:

   ```bash
   git clone "https://github.com/khalid5095/job-portal-rest-api.git"
   ```

2. Open the project in IntelliJ IDEA or your preferred IDE.

3. Create a MySQL database:

   ```sql
   CREATE DATABASE jobapp;
   ```

4. Configure your database credentials in `application.properties`.

5. Run the Spring Boot application.

6. Test the REST APIs using Postman.

##  Learning Objectives

This project was developed to gain practical experience with:

- Building RESTful APIs using Spring Boot.
- Understanding the Controller-Service-Repository architecture.
- Performing CRUD operations.
- Understanding ORM concepts using Hibernate and JPA.
- Connecting Spring Boot applications with MySQL.
- Testing REST APIs using Postman.

## Author

**Khalid**

A Java and Spring Boot developer learning backend development by building practical projects.