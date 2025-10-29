package studentmanager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Πόσους μαθητές θέλεις να καταχωρήσεις; ");
        int n = sc.nextInt();
        sc.nextLine(); // καθαρισμός \n

        // Εισαγωγή μαθητών
        for (int i = 1; i <= n; i++) {
            System.out.print("Δώσε το όνομα του " + i + "ου μαθητή: ");
            String name = sc.nextLine();
            System.out.print("Δώσε τον βαθμό του " + i + "ου μαθητή: ");
            double grade = sc.nextDouble();
            sc.nextLine(); // καθαρισμός \n

            studentsList.add(new Student(name, grade));
        }

        sc.close();

        // Εκτύπωση λίστας μαθητών
        System.out.println("\n--- Λίστα Μαθητών ---");
        for (Student s : studentsList) {
            System.out.println(s.getName() + ": " + s.getGrade());
        }

        // Υπολογισμός μέσου όρου
        double avg = Student.calculateAverage(studentsList);
        System.out.println("Μέσος όρος βαθμών: " + avg);

        // Εύρεση καλύτερου μαθητή
        Student best = Student.findBestStudent(studentsList);
        System.out.println("Καλύτερος μαθητής: " + best.getName() + " με βαθμό " + best.getGrade());
    }
}
