import java.util.HashMap;
import java.util.Map;
// A class to represent a Student with student ID and name
class Student {
    int studentId;
    String studentName;
}
// Main class containing the program logic
public class StudentHashMapRetreveValue {
    public static void main(String[] args) {
        // Create a HashMap to store student IDs and names
        Map<Integer, Student> studentMap = new HashMap<>();

        // Add 5 student entries to the HashMap
        Student student1 = new Student();
        student1.studentId = 1110;
        student1.studentName = "Shaimaa";
        studentMap.put(1110, student1);

        Student student2 = new Student();
        student2.studentId = 1111;
        student2.studentName = "Balqees";
        studentMap.put(1111, student2);

        Student student3 = new Student();
        student3.studentId = 1112;
        student3.studentName = "Noura";
        studentMap.put(1112, student3);

        Student student4 = new Student();
        student4.studentId = 1113;
        student4.studentName = "Tyba";
        studentMap.put(1113, student4);

        Student student5 = new Student();
        student5.studentId = 1114;
        student5.studentName = "Afnan";
        studentMap.put(1114, student5);

        // Print the entire HashMap
        System.out.println("Student HashMap:");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            Student student = entry.getValue();
            System.out.println("Student ID: " + student.studentId + ", Name: " + student.studentName);
        }
        // Student ID to retrieve
        int studentIdToRetrieve = 1111;

        // Retrieve the student's name using the specified student ID
        Student retrievedStudent = studentMap.get(studentIdToRetrieve);

        // Check if the student ID exists in the HashMap
        if (retrievedStudent != null) {
            // Print the retrieved student's name
            System.out.println("Student Name for ID " + studentIdToRetrieve + ": " + retrievedStudent.studentName);
        } else {
            // Handle the case when the student ID does not exist
            System.out.println("Student with ID " + studentIdToRetrieve + " not found in the HashMap.");
        }


    }
}