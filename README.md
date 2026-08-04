# Spring Boot Starter Template

A production-ready Spring Boot starter template with essential features for building RESTful APIs. This project provides a solid foundation for Java/Spring Boot applications with built-in health checks, version management, API documentation, and centralized exception handling.

## ✨ Features

- **Health Check Endpoint** - Monitor application status
- **Version Management** - Retrieve application metadata and version info
- **OpenAPI/Swagger Documentation** - Interactive API documentation UI
- **Global Exception Handler** - Centralized error handling across the application
- **Input Validation** - Bean validation support
- **Development Tools** - Spring DevTools for hot reload during development
- **Comprehensive Testing** - Unit tests with MockMvc for controller testing
- **Clean Architecture** - Well-organized package structure (controller, service, exception)

## 🛠️ Tech Stack

- **Framework**: Spring Boot 4.1.0
- **Language**: Java 25
- **Build Tool**: Maven
- **Testing**: JUnit 5, Spring Test, Mockito
- **Documentation**: SpringDoc OpenAPI 2.8.8
- **Code Generation**: Lombok
- **Validation**: Jakarta Bean Validation

## 📋 Prerequisites

- Java 25 or higher
- Maven 3.6.0 or higher
- Git

## 🚀 Quick Start

### 1. Clone the Repository

```bash
git clone https://github.com/pallavinemade/springboot-starter-template.git
cd springboot-starter-template
```

### 2. Build the Project

```bash
mvn clean install
```

### 3. Run the Application

```bash
mvn spring-boot:run
```

The application starts on `http://localhost:8080`

## 📚 API Endpoints

### Health Check

```
GET /api/health
```

Returns the health status of the application.

**Response:**
```json
{
  "status": "UP"
}
```

### Version Information

```
GET /api/version
```

Returns the application name and current version.

**Response:**
```json
{
  "application": "springboot-starter-template",
  "version": "1.0.0"
}
```

## 📖 API Documentation

Interactive API documentation is available at:

```
http://localhost:8080/swagger-ui.html
```

## 🏗️ Project Structure

```
src/
├── main/java/com/pallavi/springboot_starter_template/
│   ├── SpringbootStarterTemplateApplication.java    # Main application class
│   ├── controller/
│   │   ├── HealthController.java                    # Health check endpoints
│   │   └── VersionController.java                   # Version/metadata endpoints
│   ├── service/
│   │   └── VersionService.java                      # Business logic for version
│   └── exception/
│       └── GlobalExceptionHandler.java              # Centralized exception handling
└── test/java/com/pallavi/springboot_starter_template/
    ├── HealthControllerTest.java                    # Health endpoint tests
    ├── VersionControllerTest.java                   # Version endpoint tests
    └── exception/
        └── GlobalExceptionHandlerTest.java          # Exception handler tests
```

## 🧪 Testing

### Run All Tests

```bash
mvn test
```

### Run Specific Test Class

```bash
mvn -Dtest=HealthControllerTest test
mvn -Dtest=GlobalExceptionHandlerTest test
```

### Run with Coverage

```bash
mvn clean test
```

## 🔧 Configuration

### Application Properties

Create or modify `src/main/resources/application.properties`:

```properties
spring.application.name=springboot-starter-template
server.port=8080
server.servlet.context-path=/
```

## 🐳 Docker Support

A `Dockerfile` is included for containerization:

```bash
docker build -t springboot-starter-template .
docker run -p 8080:8080 springboot-starter-template
```

## 📦 Build & Package

### Create JAR

```bash
mvn clean package
```

The packaged JAR will be available at `target/springboot-starter-template-0.0.1-SNAPSHOT.jar`

### Run Packaged JAR

```bash
java -jar target/springboot-starter-template-0.0.1-SNAPSHOT.jar
```

## 🎯 Key Components

### GlobalExceptionHandler

Centralized exception handling that catches all exceptions thrown by controllers and returns a consistent error response with HTTP 500 status and error message.

```java
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String,String>> handleException(Exception e) {
        return ResponseEntity.internalServerError()
            .body(Map.of("Error Message:", e.getMessage()));
    }
}
```

### VersionService

Provides application version information. Can be extended to read version from `pom.xml` or environment variables.

```java
@Service
public class VersionService {
    public String getVersion() {
        return "1.0.0";
    }
}
```

## 🤝 Contributing

1. Create a feature branch (`git checkout -b feature/amazing-feature`)
2. Commit changes (`git commit -m 'Add amazing feature'`)
3. Push to branch (`git push origin feature/amazing-feature`)
4. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see LICENSE file for details.

## 👤 Author

Pallavi Nemade - [GitHub](https://github.com/pallavinemade)

## 📞 Support

For issues, questions, or suggestions, please open an [issue](https://github.com/pallavinemade/springboot-starter-template/issues).

## 🔜 Future Enhancements

- Database integration (JPA/Hibernate)
- Authentication & Authorization (Spring Security)
- Logging configuration (SLF4J/Logback)
- Caching support (Spring Cache)
- Message queue integration (RabbitMQ/Kafka)
- Actuator endpoints for monitoring
- Custom error codes and detailed error responses
- Request/Response logging interceptor
