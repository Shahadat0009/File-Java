
package file_demo;


 import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class File_Demo {
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();

       
             try (PrintWriter writer = new PrintWriter("numbers.txt")) {
             Scanner scanner = new Scanner(System.in);
             System.out.println("Enter integers (negative number to stop):");

            int num;
            while ((num = scanner.nextInt()) >= 0) {
                numbers.add(num);
                writer.println(num);
             }
        } catch (FileNotFoundException e) {
            System.out.println("Error To create the file " + e.getMessage());
        }

        
        try (Scanner fileScanner = new Scanner(new File("numbers.txt"))) {
            int sum = 0;
            int count = 0;

            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                sum += num;
                count++;
            }

            double average = (count > 0) ? (double) sum / count : 0;

            System.out.println("Sum of the numbers: " + sum);
            System.out.println("Average of the numbers: " + average);
        } catch (FileNotFoundException e) {
            System.out.println("Error to read the file: " + e.getMessage());
        }
    }
}
