import java.util.Scanner;

class StudentGradeCalculator {

    private final Scanner scanner;

    public StudentGradeCalculator() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.print("Enter the number of subjects: ");
        int subjectCount = getValidInt();

        int[] marks = new int[subjectCount];

        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = getValidMarks();
        }

        int total = calculateTotal(marks);
        double average = calculateAverage(total, subjectCount);
        char grade = calculateGrade(average);

        displayResults(total, average, grade);
    }

    private int getValidInt() {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private int getValidMarks() {
        int mark;
        while (true) {
            mark = getValidInt();
            if (mark >= 0 && mark <= 100) {
                return mark;
            }
            System.out.print("Marks should be between 0 and 100. Try again: ");
        }
    }

    private int calculateTotal(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    private double calculateAverage(int total, int subjectCount) {
        return (double) total / subjectCount;
    }

    private char calculateGrade(double average) {
        if (average >= 90) return 'A';
        else if (average >= 75) return 'B';
        else if (average >= 60) return 'C';
        else if (average >= 40) return 'D';
        else return 'F';
    }

    private void displayResults(int total, double average, char grade) {
        System.out.println("\n===== Results =====");
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        StudentGradeCalculator calculator = new StudentGradeCalculator();
        calculator.start();
    }
}
