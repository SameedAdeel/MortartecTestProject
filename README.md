# Demo — Spring Boot Info API

A simple Spring Boot (Gradle) application exposing a GET and POST endpoint for
`Info` records .

## Tech Stack
- Java 21
- Spring Boot 4.1.1 (Spring Web)
- Gradle

## Project Structure
```
MortartecTestProject/
├── build.gradle
├── settings.gradle
└── src/main/
    ├── java/com/example/MortartecProject/
    │   ├── MortartecProject.java
    │   ├── model/Info.java
    │   └── controller/InfoController.java
    └── resources/
        └── application.properties
```

## Data Model — `Info`
| Field         | Type       | Notes                                  |
|---------------|------------|-----------------------------------------|
| `infoId`      | Integer    | Server-generated, unique per record     |
| `name`        | String     |                                          |
| `dateOfBirth` | LocalDate  |         |
| `email`       | String     |                                          |
| `phoneNumber` | String     |                                          |
| `experience`  | Double     | Years of experience                     |

`infoId` is assigned by the server on POST — clients should not send it.

## Endpoints

### `GET /api/info`
Returns all stored `Info` records as a JSON array.

**Response:** `200 OK`
```json
[
  {
    "infoId": 1,
    "name": "Sameed",
    "dateOfBirth": "1996-06-15",
    "email": "sameed@example.com",
    "phoneNumber": "1234567890",
    "experience": 3.5
  }
]
```

### `POST /api/info`
Creates a new `Info` record and stores it in memory.

**Request body:**
```json
{
  "name": "Ali Ahmed",
  "dateOfBirth": "1995-06-15",
  "email": "ali@example.com",
  "phoneNumber": "1234567890",
  "experience": 3.5
}
```

**Response:** `200 OK` — returns the created record, including the server-assigned `infoId`.
