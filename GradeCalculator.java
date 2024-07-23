import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSubjects = 5;
        double[] scores = new double[numberOfSubjects];
        double total = 0.0;
        System.out.println("Enter the scores for " + numberOfSubjects + " subjects:");
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Score for subject " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
            total += scores[i];
        }
        double average = total / numberOfSubjects;
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Total score: " + total);
        System.out.println("Average score: " + average);
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}

