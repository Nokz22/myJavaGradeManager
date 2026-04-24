package service;

import model.ErasmusStudent;
import model.RegularStudent;
import model.Student;
import model.StudentType;

import java.util.ArrayList;
import java.util.List;

import static model.StudentType.ERASMUS;

public class StudentService {


//Attributes

    private List<Student> students = new ArrayList<>();
    private int nextId = 1;


//Constructors


//Methods


    //Getters
    public List<Student> getStudents() {
        return students;

    }

    public void addStudent(String name, String course, StudentType type) {
        Student student = null;
        switch (type) {
            case REGULAR -> student = new RegularStudent(name, nextId, course);
            case ERASMUS -> student = new ErasmusStudent(name, nextId, course);
        }
        students.add(student);
        nextId++;
    }

    public void removeStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                return;
            }
        }
    }

    public void listStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void addGrade(int id, double grade) {
        for (Student student : students) {
            if (student.getId() == id) {
                if (student instanceof RegularStudent r) {
                    r.addGrade(grade);
                }
                return;
            }
        }
    }
}
