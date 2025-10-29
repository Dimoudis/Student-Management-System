package studentmanager;

import java.util.ArrayList;

public class Student {
    private String name;
    private double grade;

    // Constructor
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    // Getters
    public String getName() {return name;}

    public double getGrade() {return grade;}

    // Μέθοδος για μέσο όρο
    public static double calculateAverage(ArrayList<Student> students) {
        double sum = 0;
        for (Student s : students) {
            sum += s.getGrade();
        }
        return (sum/students.size());
    }

    // Μέθοδος για καλύτερο μαθητή
    public static Student findBestStudent(ArrayList<Student> students) {
        if (students.isEmpty()) return null;

        Student best = students.get(0);
        for (Student s : students) {
            if (s.getGrade() > best.getGrade()) {
                best = s;
            }
        }
        return best;
    }
}
