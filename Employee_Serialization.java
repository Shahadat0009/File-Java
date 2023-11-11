
package employee;

import java.io.*;
public class Employee_Serialization{
    public static void main(String[] args) {
        
        Employee employee1 = new Employee("Shahadat", 2122431);
        Employee employee2 = new Employee("Arif", 2122432);
        Employee employee3 = new Employee("Anik", 2122332);
        
         try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees.txt"))) {
            outputStream.writeObject(employee1);
            outputStream.writeObject(employee2);
            outputStream.writeObject(employee3);
            System.out.println("Employee objects written to file successfully.");
            
        } 
         
         catch (IOException e) {
            System.out.println("Error writing objects to file: " + e.getMessage());
        }
        
   }
}
