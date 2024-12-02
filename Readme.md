# Pagination in Spring Boot

Simple Todo app with support for pagination by using Spring Boot , Spring Data JPA and MySQL

## Get started

### Install dependencies

Run `./mvnw clean install`

### Run the application

Run the application using `./mvnw spring-boot:run`

## Endpoints

### GET /todo?page={page}&size={size}

Returns a page of todos.

```bash
GET http://localhost:8080/todo?page=0&size=5
```

Output:

```json
[
  {
    "id": 1,
    "title": "Buy groceries",
    "completed": false
  },
  {
    "id": 2,
    "title": "Pay bills",
    "completed": false
  },
  {
    "id": 3,
    "title": "Walk the dog",
    "completed": false
  },
  {
    "id": 4,
    "title": "Clean the house",
    "completed": false
  },
  {
    "id": 5,
    "title": "Cook dinner",
    "completed": false
  }
]
```

### GET /todo/{id}

Returns a todo by id.

```bash
GET http://localhost:8080/todo/1
```

Output:

```json
{
  "id": 1,
  "title": "Buy groceries",
  "completed": false
}
```

### POST /todo

Creates a new todo.

```bash
POST http://localhost:8080/todo
Content-Type: application/json

{
  "title": "Buy groceries",
  "completed": false
}
```

Output:

```json
{
  "id": 6,
  "title": "Buy groceries",
  "completed": false
}
```

### PUT /todo/{id}

Updates a todo by id.

```bash
PUT http://localhost:8080/todo/1
Content-Type: application/json

{
  "title": "Buy groceries",
  "completed": true
}
```

Output:

```json
{
  "id": 1,
  "title": "Buy groceries",
  "completed": true
}
```

### DELETE /todo/{id}

Deletes a todo by id.

```bash
DELETE http://localhost:8080/todo/1
```

Output:

```text
Deleted todo with id 1
```


Thank you for reading this document. If you have any questions or suggestions, please let me know.