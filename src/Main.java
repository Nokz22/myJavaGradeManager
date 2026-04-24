import model.Student;
import service.StudentService;
import ui.StudentUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        StudentUI studentUI = new StudentUI(studentService, new Scanner(System.in));
        studentUI.start();


    }
}