package ui;

import model.Student;
import model.StudentType;
import service.StudentService;
import java.util.Scanner;

public class StudentUI {


//Attributes

    private StudentService studentService;
    private Scanner scanner;

//Constructor

    public StudentUI(StudentService studentService, Scanner scanner) {
        this.studentService = studentService;
        this.scanner = new Scanner(System.in);
    }


//Methods

    public void start(){
        int option = 0;

        while(option!=5){
            showMenu();
            option = Integer.parseInt(scanner.nextLine());

            switch (option){
                case 1 -> addStudent();
                case 2 -> addGrade();
                case 3 -> listStudent();
                case 4 -> removeStudent();
                case 5 -> System.out.println("See you next time!");
                default -> System.out.println("Invalid option!.");

            }
        }
    }
        private void showMenu() {
            System.out.println("\n=== Grade Manager ===");
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade");
            System.out.println("3. List Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Quit");
            System.out.print("Choose Option: ");
    }


    private void addStudent() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Course: ");
        String course = scanner.nextLine();
        System.out.println("1. Regular Student.");
        System.out.println("2. Erasmus Student.");
        int studentType = Integer.parseInt(scanner.nextLine());
        switch (studentType){
            case 1 -> {
                studentService.addStudent(name, course, StudentType.REGULAR);
                System.out.println("Student Added!");
            }
            case 2 -> {
                studentService.addStudent(name, course, StudentType.ERASMUS);
                System.out.println("Student Added!");
            }
            default -> System.out.println("Invalid option!.");

        }

    }

    private void addGrade() {
        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Grade: ");
        double grade = Double.parseDouble(scanner.nextLine());
        studentService.addGrade(id,grade);
        System.out.println("Grade Added!");
    }

    private void listStudent() {
        for (Student student : studentService.getStudents()){
            System.out.println(student.toString());
        }
    }



    private void removeStudent() {
        System.out.print("Id: ");
        int id = Integer.parseInt(scanner.nextLine());
        studentService.removeStudent(id);
        System.out.println("Student Removed!");
    }

}
