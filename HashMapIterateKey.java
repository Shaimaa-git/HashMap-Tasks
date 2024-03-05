import java.util.HashMap;
import java.util.Map;
// A class to represent a Student with student ID and name
class Student {
    int studentId;
    String studentName;
}
// Main class containing the program logic
public class StudentHashMapIterateKey {
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

        // Print all key-value pairs of the HashMap using keySet()
        System.out.println("All key-value pairs in the HashMap using keySet():");
        for (Integer studentId : studentMap.keySet()) {
            Student student = studentMap.get(studentId);
            System.out.println("Student ID: " + studentId + ", Name: " + student.studentName);
        }
    }
}