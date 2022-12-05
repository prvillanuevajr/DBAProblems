import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of newly hired males: ");
        int newlyHiredMales = scanner.nextInt();
        System.out.print("Enter the number of newly hired females: ");
        int newlyHiredFemales = scanner.nextInt();
        System.out.print("Enter the number of permanent position males: ");
        int permanentMales = scanner.nextInt();
        System.out.print("Enter the number of permanent position females: ");
        int permanentFemales = scanner.nextInt();
        System.out.print("Enter the number of resigned males: ");
        int resignedMales = scanner.nextInt();
        System.out.print("Enter the number of resigned females: ");
        int resignedFemales = scanner.nextInt();

        int hired = newlyHiredMales + newlyHiredFemales;
        int permanent = permanentMales + permanentFemales;
        int resigned = resignedMales + resignedFemales;

        System.out.println("\nThank you for your information");
        System.out.println("Here is the Summary !!! \n");

        System.out.printf("Number of hired employee = %d \n", hired);
        System.out.printf("Male: %.2f \n", (newlyHiredMales * 100.0f) / hired);
        System.out.printf("Female: %.2f \n\n", (newlyHiredFemales * 100.0f) / hired);

        System.out.printf("Number of Permanent employee = %d \n", permanent);
        System.out.printf("Male: %.2f \n", (permanentMales * 100.0f) / permanent);
        System.out.printf("Female: %.2f \n\n", (permanentFemales * 100.0f) / permanent);

        System.out.printf("Number of Resigned employee = %d \n", resigned);
        System.out.printf("Male: %.2f \n", (resignedMales * 100.0f) / resigned);
        System.out.printf("Female: %.2f", (resignedFemales * 100.0f) / resigned);
    }
}
