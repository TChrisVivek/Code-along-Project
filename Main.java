// src/Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Student and Course Management System ---");

        // Create student objects using the new constructor
        Student student1 = new Student("Alice Wonderland");
        Student student2 = new Student("Bob Builder");
        Student student3 = new Student("Charlie Chaplin");

        // Create course objects using the new constructor
        Course course1 = new Course("Introduction to Java");
        Course course2 = new Course("Database Fundamentals");

        // Display details to verify auto-ID generation
        System.out.println("\nRegistered Students:");
        student1.displayDetails(); // Expected ID: 1
        student2.displayDetails(); // Expected ID: 2
        student3.displayDetails(); // Expected ID: 3

        System.out.println("\nAvailable Courses:");
        course1.displayDetails();  // Expected ID: C101
        course2.displayDetails();  // Expected ID: C102
    }
}