import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> grades = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            int grade = sc.nextInt();
            grades.add(grade);
        }

        double average = calculateAverage(grades);
        int highest = calculateHighest(grades);
        int lowest = calculateLowest(grades);

        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        sc.close();
    }

    private static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    private static int calculateHighest(ArrayList<Integer> grades) {
        return Collections.max(grades);
    }

    private static int calculateLowest(ArrayList<Integer> grades) {
        return Collections.min(grades);
    }
}