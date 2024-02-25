/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentsgradecalculator;

/**
 *
 * @author Saumya Jha
 */
import javax.swing.JOptionPane;

public class StudentsGradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String studentName = JOptionPane.showInputDialog("Enter student's name:");

        // Prompt the user to enter three grades
        String grade1Input = JOptionPane.showInputDialog("Enter grade 1:");
        String grade2Input = JOptionPane.showInputDialog("Enter grade 2:");
        String grade3Input = JOptionPane.showInputDialog("Enter grade 3:");

        // Convert input strings to double values
        double grade1 = Double.parseDouble(grade1Input);
        double grade2 = Double.parseDouble(grade2Input);
        double grade3 = Double.parseDouble(grade3Input);

        // Calculate average grade
        double average = (grade1 + grade2 + grade3) / 3;

        // Display the result
        JOptionPane.showMessageDialog(null, "Average grade for " + studentName + " is: " + average);
        
    }
    
}
