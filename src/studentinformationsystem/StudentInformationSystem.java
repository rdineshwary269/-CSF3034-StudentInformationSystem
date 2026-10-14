/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author RDINESHWARY
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String studentName = "Dineshwary Rajah";
        String studentId = "S88125";

        // Store two marks using variables (each out of 50)
        int mark1 = 42;
        int mark2 = 38;

        // Calculate the total mark (out of 100)
        int total = mark1 + mark2;

        // Display student information
        System.out.println("===== STUDENT INFORMATION SYSTEM =====");
        System.out.println("Student Name : " + studentName);
        System.out.println("Student ID   : " + studentId);
        System.out.println("--------------------------------------");
        System.out.println("Mark 1       : " + mark1);
        System.out.println("Mark 2       : " + mark2);

        // Display the total
        System.out.println("Total Mark   : " + total + " / 100");

        // Display a message based on the total
        String message;
        if (total >= 80) {
            message = "Excellent";
        } else if (total >= 50) {
            message = "Good";
        } else {
            message = "Needs Improvement";
        }

        System.out.println("Result       : " + message);
        System.out.println("======================================");
    }
    
}
