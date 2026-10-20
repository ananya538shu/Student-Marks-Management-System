
import java.util.Scanner;

public class StudentMarksManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get student details
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();

        // Get marks for three subjects
        System.out.print("Enter marks for Java: ");
        int javaMarks = sc.nextInt();

        System.out.print("Enter marks for Maths: ");
        int mathsMarks = sc.nextInt();

        System.out.print("Enter marks for English: ");
        int englishMarks = sc.nextInt();

        System.out.print("Enter marks for Hindi: ");
        int hindiMarks = sc.nextInt();

        System.out.print("Enter marks for Python: ");
        int pythonMarks = sc.nextInt();

        System.out.print("Enter marks for Software Engineering: ");
        int softwareEngineeringMarks = sc.nextInt();

        // Calculate total and percentage
        int total = javaMarks + mathsMarks + englishMarks + hindiMarks + pythonMarks + softwareEngineeringMarks;
        double percentage = total / 6.0;

        // Display student report
        System.out.println("\n===== STUDENT REPORT =====");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Java Marks: " + javaMarks);
        System.out.println("Maths Marks: " + mathsMarks);
        System.out.println("English Marks: " + englishMarks);
        System.out.println("Hindi Marks: " + hindiMarks);
        System.out.println("Python Marks: " + pythonMarks);
        System.out.println("Software Engineering Marks: " + softwareEngineeringMarks);
        System.out.println("Total Marks: " + total + " / 600");
        System.out.printf("Percentage: %.2f%%\n", percentage);

        // Determine grade
        if (javaMarks < 0 || javaMarks > 100 ||
            mathsMarks < 0 || mathsMarks > 100 ||
            englishMarks < 0 || englishMarks > 100) {

            System.out.println("Invalid marks! Enter marks between 0 and 100.");

        } else if (javaMarks < 35 ||
                   mathsMarks < 35 ||
                   englishMarks < 35) {

            System.out.println("Result: FAIL");

        } else if (percentage >= 90) {
            System.out.println("Grade: A+");
            System.out.println("Result: PASS");

        } else if (percentage >= 75) {
            System.out.println("Grade: A");
            System.out.println("Result: PASS");

        } else if (percentage >= 60) {
            System.out.println("Grade: B");
            System.out.println("Result: PASS");

        } else if (percentage >= 35) {
            System.out.println("Grade: C");
            System.out.println("Result: PASS");
        }

        sc.close();
    }
}
