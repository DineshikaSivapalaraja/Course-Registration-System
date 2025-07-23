# Course Registration System

## Overview
The Course Registration System is a full-stack web application that allows students to view available courses, register for courses, and view enrolled students. It is designed to demonstrate a simple, real-world application using a Spring Boot backend and a static HTML/JavaScript frontend.

## Purpose
The purpose of this application is to provide a platform for students to:
- Browse available courses
- Register for a course by providing their name and email
- View the list of students enrolled in each course

Administrators or instructors can also use the system to manage course offerings and track enrollments.

## Technologies Used

### Backend
- **Java 21**
- **Spring Boot 3** (Spring Web, Spring Data JPA)
- **MySQL** (as the database)
- **Lombok** (for reducing boilerplate code)
- **Maven** (for build and dependency management)

### Frontend
- **HTML5**
- **CSS3**
- **JavaScript (ES6)**

## Features

### Backend (Spring Boot)
- RESTful API endpoints for:
  - Listing available courses (`/courses`)
  - Registering a student for a course (`/courses/register`)
  - Listing enrolled students (`/courses/enrolled`)
- Uses Spring Data JPA for ORM and database access
- MySQL database integration
- CORS enabled for frontend communication

### Frontend
- Simple, user-friendly HTML pages:
  - **index.html**: Main navigation page
  - **register.html**: Course registration form
  - **availCourses.html**: Displays available courses (fetched from backend)
  - **enrolled.html**: Displays enrolled students (fetched from backend)
- JavaScript fetch API for dynamic data loading
- Responsive and clean UI with CSS

## Techniques
- RESTful API design
- MVC pattern (Spring Boot)
- Entity-Relationship mapping with JPA
- Asynchronous data fetching with JavaScript
- Separation of concerns between backend and frontend

## Getting Started

### Prerequisites
- Java 21+
- Maven
- MySQL Server

### Backend Setup
1. Clone the repository.
2. Configure your MySQL database and update the credentials in `CourseRegistrationBackend/src/main/resources/application.properties`.
3. Navigate to the backend folder:
   ```sh
   cd CourseRegistrationBackend
   ```
4. Build and run the Spring Boot application:
   ```sh
   mvnw spring-boot:run
   ```

### Frontend Setup
1. Open the `CourseRegistrationFrontend` folder.
2. Open `index.html` in your browser (you may use a local server or open directly).

### Usage
- Register for a course via the registration form.
- View available courses and enrolled students from the navigation page.



