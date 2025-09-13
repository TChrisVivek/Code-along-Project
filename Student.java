// src/Student.java
public class Student {
    // Fields
    private int studentId;
    private String name;

    // Static counter for unique IDs
    private static int nextStudentIdCounter = 1;

    // Constructor
    public Student(String name) {
        this.studentId = nextStudentIdCounter++; // Assign unique ID and then increment
        this.name = name;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Student Name: " + this.name);
        System.out.println("--------------------");
    }
}