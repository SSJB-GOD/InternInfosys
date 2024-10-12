# Spring Boot CRUD Example with HashMap

This is a simple **Spring Boot** project that demonstrates basic **CRUD (Create, Read, Update, Delete)** operations on student data using an in-memory **HashMap** for storage, without a database. This project serves as a learning tool for understanding how to build REST APIs with Spring Boot.

## Features

- **Create Student**: Add a new student with auto-incremented ID.
- **Read Students**: 
  - Retrieve all students.
  - Retrieve a specific student by ID.
- **Update Student**: Update the details of an existing student by ID.
- **Delete Student**: Delete a student by ID.
- **Auto-incremented ID**: Automatically assigns unique IDs to newly created students.

## Technologies Used

- **Spring Boot**: Java framework for building standalone, production-grade Spring applications.
- **REST API**: HTTP methods (GET, POST, PUT, DELETE) to perform CRUD operations.
- **In-Memory Data Storage**: Uses `HashMap` to store student data instead of a database.
- **Postman**: Can be used to test API endpoints.

## Project Structure

```
src/
│
├── main/
│   ├── java/
│   │   └── com.jitesh.CrudExample/
│   │       ├── Controllers/
│   │       │   └── StudentsDetails.java
│   │       ├── Bean/
│   │       │   └── Student.java
│
└── resources/
    └── application.properties  // No configuration needed for databases
```

## API Endpoints

### Base URL:
```
http://localhost:8080
```

### Endpoints:
1. **GET** `/` - Welcome message.
2. **GET** `/students` - Retrieve all students.
3. **GET** `/student/{id}` - Retrieve a student by ID.
4. **POST** `/student` - Create a new student.
5. **PUT** `/student/{id}` - Update an existing student's information by ID.
6. **DELETE** `/student/{id}` - Delete a student by ID.

### Sample JSON Request for Creating a New Student:
```json
{
  "name": "Jitesh Borkar",
  "age": 24,
  "mail": "jiteshborkar@gmail.com"
}
```

## How to Run the Project

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/SSJB-GOD/CrudExample.git
   ```

2. **Navigate to the Project Directory**:
   ```bash
   cd CrudExample
   ```

3. **Run the Application** using Maven:
   ```bash
   mvn spring-boot:run
   ```

4. **Test the APIs** using **Postman** or another API client by hitting the endpoints defined above.

## How to Push the Project to GitHub

1. Initialize the repository (if not already done):
   ```bash
   git init
   ```

2. Add the remote origin:
   ```bash
   git remote add origin https://github.com/SSJB-GOD/CrudExample.git
   ```

3. Add your files to Git:
   ```bash
   git add .
   ```

4. Commit your changes:
   ```bash
   git commit -m "Initial commit"
   ```

5. Push to GitHub:
   ```bash
   git push -u origin master
   ```

## License

This project is open-source and available under the [MIT License](LICENSE).

---
