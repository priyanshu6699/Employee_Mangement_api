# Employee Management Application

## Project Description
The Employee Management Application is a Spring Boot-based RESTful API designed to manage employee records. It provides endpoints for performing CRUD (Create, Read, Update, Delete) operations on employee data, including details like name, age, salary, department, position, email, phone, and address.

## Features
- **Create Employees**: Add new employee records to the system.
- **Read All Employees**: Retrieve a list of all employees.
- **Read Employee by ID**: Fetch details of a specific employee using their unique ID.
- **Update Employee**: Modify existing employee details.
- **Delete Employee**: Remove an employee record from the system.
- **RESTful API**: Exposes a clean and consistent API for integration with other applications.

## Technologies Used
- **Spring Boot**: Framework for building stand-alone, production-grade Spring-based applications.
- **Spring Data JPA**: Simplifies data access using JPA (Java Persistence API) with Spring.
- **Hibernate**: JPA implementation for object-relational mapping.
- **H2 Database**: An in-memory relational database for development and testing (can be easily switched to other databases like MySQL).
- **MySQL Connector/J**: JDBC driver for MySQL database connectivity.
- **Lombok**: A library that reduces boilerplate code for Java classes (e.g., getters, setters, constructors).
- **Maven**: Build automation tool for Java projects.
- **Java 24**: The programming language version used.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 24 or higher
- Maven 3.x
- Git (optional, for cloning the repository)

### Installation

1.  **Clone the repository (if applicable):**
    ```bash
    git clone <repository_url>
    cd employee_mangement_app
    ```
    (Note: Replace `<repository_url>` with the actual URL if this project is hosted on a Git repository.)

2.  **Build the project using Maven:**
    ```bash
    mvn clean install
    ```

### Running the Application

1.  **Run from the command line:**
    ```bash
    mvn spring-boot:run
    ```
    The application will start on port `8080` by default.

2.  **Access H2 Database Console (if using H2):**
    If you are using the H2 in-memory database, you can access its console at:
    `http://localhost:8080/h2-console`
    Make sure to configure your `application.properties` or `application.yml` for H2 database connection details.

## API Endpoints

The following API endpoints are available:

| HTTP Method | Endpoint                       | Description                                   | Request Body (Example)                                           | Response Body (Example)                               |
|-------------|--------------------------------|-----------------------------------------------|------------------------------------------------------------------|-------------------------------------------------------|
| `GET`       | `/hello`                       | A simple test endpoint.                       | None                                                             | `"Hello from Spring Boot!"`                           |
| `GET`       | `/employees`                   | Retrieve all employees.                       | None                                                             | `[ { ...employee details... }, ... ]`                 |
| `GET`       | `/employees/{id}`              | Retrieve an employee by ID.                   | None                                                             | `{ ...employee details... }` or `null` if not found   |
| `POST`      | `/employees`                   | Create one or more employees.                 | `[ { ...employee details... }, { ... } ]`                        | `"Employees created successfully"`                    |
| `PUT`       | `/employees/{id}`              | Update an existing employee by ID.            | `{ ...updated employee details... }`                             | `"Employee updated successfully"` or error message    |
| `DELETE`    | `/employees/{id}`              | Delete an employee by ID.                     | None                                                             | `true` or `false`                                     |

**Employee JSON Structure:**
```json
{
    "id": 1,
    "name": "John Doe",
    "age": 30,
    "salary": 60000,
    "department": "IT",
    "position": "Software Engineer",
    "email": "john.doe@example.com",
    "phone": "123-456-7890",
    "address": "123 Main St, Anytown"
}
```

## Database Configuration

The project is configured to use H2 Database by default. You can switch to MySQL or other databases by modifying the `src/main/resources/application.properties` file.

**Example `application.properties` for H2 (default):**
```properties
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.datasource.url=jdbc:h2:mem:employeedb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
```

**Example `application.properties` for MySQL:**
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
```
*Remember to create the `employee_db` database in MySQL and replace `your_username` and `your_password` with your actual MySQL credentials.*

## Contributing
(Optional section, if you plan to accept contributions)

## License
(Optional section, if you want to specify a license)

## Contact
(Optional section, for contact information) 