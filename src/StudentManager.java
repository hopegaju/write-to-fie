
import java.util.*;
public class StudentManager {
    public static void addStudent(Map<Integer, String> students, int studentId, String name){
        try {
            if ( studentId <= 0) {
                throw new IllegalArgumentException("Student ID must be greater than 0!");
            }
            if (name == null || name.trim().isEmpty()) {
                throw new NullPointerException("Student name cannot be null or empty!");
            }
            students.put(studentId, name);
            System.out.println("Student added: ID = " + studentId + ", Name = " + name);
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Attempt to add student completed.\n");
        }
    }

    public static void sortStudents(Map<Integer, String> students){
        if (students == null) {
            throw new NullPointerException("Student map is null.");
        }

        Map<Integer, String> sorted = new TreeMap<>(students);
        for (Map.Entry<Integer, String> entry : sorted.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

    }
    public static void searchStudent(Map<Integer, String> students, int studentId){
//
        if (students.containsKey(studentId)) {
            System.out.println("Student found: ID = " + studentId + ", Name = " + students.get(studentId));
        } else {
            System.out.println("Student not found with ID: " + studentId);
        }
//
    }
    public static void removeStudent(Map<Integer, String> students, int studentId){
        if (students.containsKey(studentId)) {
            students.remove(studentId);
            System.out.println("Student with ID " + studentId + " removed.");
        } else {
            System.out.println("No student found with ID: " + studentId);
        }
    }
    public static void findStudentWithHighestId(Map<Integer, String> students){
        if (students == null || students.isEmpty()) {
            throw new NullPointerException("Student map is null or empty.");
        }
        int maxId = Collections.max(students.keySet());
        System.out.println("Highest ID student: ID = " + maxId + ", Name = " + students.get(maxId));

    }
    public static void findStudentWithLowestId(Map<Integer, String> students){
        if (students == null || students.isEmpty()) {
            throw new NullPointerException("Student map is null or empty.");
        }
        int minId = Collections.min(students.keySet());
        System.out.println("Lowest ID student: ID = " + minId + ", Name = " + students.get(minId));

    }
}


}
