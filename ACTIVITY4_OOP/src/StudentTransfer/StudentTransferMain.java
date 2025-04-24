/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentTransfer;

/**
 *
 * @author Malilong
 */
public class StudentTransferMain {
  

    public static void main(String[] args) {
        Classroom classA = new Classroom("Class A");
        Classroom classB = new Classroom("Class B");

        Student student1 = new Student("jums", 112);
        Student student2 = new Student("rose", 302);
        Student student3 = new Student("mal", 123);

        classA.addStudent(student1);
        classA.addStudent(student2);
        classA.addStudent(student3);

        System.out.println("\nBefore Transfer:");
        classA.displayStudents();
        classB.displayStudents();

        classA.transferStudent(student2, classB);

        System.out.println("\nAfter Transfer:");
        classA.displayStudents();
        classB.displayStudents();
    }
}

