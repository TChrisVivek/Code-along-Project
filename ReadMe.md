# Student and Course Management System

A simple Java project to demonstrate basic Object-Oriented Programming (OOP) principles.

## Project Structure

## How to Compile and Run

Navigate to the project's root directory (`/src`) in your terminal and follow these steps.

1.  **Compile all Java files:**
    ```bash
    javac *.java
    ```

2.  **Run the main application:**
    ```bash
    java Main
    ```

## Development Parts

### Part 1: Basic Class and Object Creation
-   Created `Student` and `Course` classes with basic fields and methods.
-   Instantiated objects in `Main.java` and called their methods.

### Part 2: Encapsulation
-   Made class fields `private`.
-   Added `public` getters and setters to access and modify the fields, ensuring controlled access.

### Part 3: Constructors and Auto-ID Generation
-   Implemented **constructors** in `Student` and `Course` to ensure objects are initialized properly upon creation.
-   Used `private static` variables to create **automatic, unique ID counters**. This simplifies object creation and guarantees that each new student and course has a unique ID without manual input.