# 🌟 Spring Boot CRUD API

A simple REST API built with Spring Boot that allows you to manage users. The API provides endpoints to create, read, update, and delete user information.

## ✨ Features

- 🧑‍💻 **Get All Users:** Retrieve a list of all users.
- 🔍 **Get User by ID:** Fetch details of a specific user by their ID.
- ➕ **Create a New User:** Add a new user to the database.
- ♻️ **Update an Existing User:** Modify details of an existing user.
- ❌ **Delete a User by ID:** Remove a user from the database.

## 🛠️ Technologies Used

- **Java**: Programming language.
- **Spring Boot**: Framework for building RESTful web services.
- **Maven**: Dependency management.

## 🚀 Getting Started

### Prerequisites

- Java 17 or later
- Maven 3.8.x or later

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/spring-boot-crud-api.git
   cd spring-boot-crud-api
   ```

2. **Build the project with Maven:**

   ```bash
   mvn clean install
   ```

3. **Run the application:**

   ```bash
   mvn spring-boot:run
   ```

   The application will start and run on `http://localhost:4000`.

## 📚 API Endpoints

### Get All Users

- **GET** `/user`

  Retrieves a list of all users.

#### Example Request

```bash
curl -X GET http://localhost:4000/user
```

### Get User by ID

- **GET** `/user/{id}`

  Fetches the details of a user by their ID.

#### Example Request

```bash
curl -X GET http://localhost:4000/user/1
```

### Create a New User

- **POST** `/user`

  Adds a new user to the database.

#### Example Request

```bash
curl -X POST http://localhost:4000/user -H "Content-Type: application/json" -d '{"firstName": "John", "lastName": "Doe", "email": "john.doe@email.com"}'
```

### Update an Existing User

- **PUT** `/user/{id}`

  Updates details of an existing user.

#### Example Request

```bash
curl -X PUT http://localhost:4000/user/1 -H "Content-Type: application/json" -d '{"firstName": "John", "lastName": "Doe", "email": "john.doe@email.com"}'
```

### Delete a User by ID

- **DELETE** `/user/{id}`

  Removes a user from the database by their ID.

#### Example Request

```bash
curl -X DELETE http://localhost:4000/user/1
```

## 🤝 Contributing

Contributions are welcome! Feel free to fork the repository and open a pull request.
