import java.util.Scanner; 

public class StudentGradeCalculator {

   
    public static int getTotalMarks(int[] marks, Scanner scanner) {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            int mark = scanner.nextInt();

            while (mark < 0 || mark > 100) {
                System.out.print("Invalid input! Enter marks between 0 and 100: ");
                mark = scanner.nextInt();
            }

            marks[i] = mark;
            total += mark;
        }
        return total;
    }

    
    public static String calculateGrade(double average) {
        if (average >= 90) return "A+";
        else if (average >= 80) return "A";
        else if (average >= 70) return "B";
        else if (average >= 60) return "C";
        else if (average >= 50) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];

        int totalMarks = getTotalMarks(marks, scanner);
        double average = (double) totalMarks / numSubjects;
        String grade = calculateGrade(average);

        // Output
        System.out.println("\n ----- Result -----");
        System.out.println("Total Marks: " + totalMarks + "/" + (numSubjects * 100));
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
