package model;

public abstract class Student {

//Attributes

    private String name;
    private int id;
    private String course;


//Constructors

    public Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }


//Abstract Methods

    public abstract double calculateGrade();


//Getters

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public double getGrade() {
        return calculateGrade();
    }

    @Override
    public String toString() {
        return "[" + getId() + "] " + getName() + " | " + getCourse() + " | " + getGrade();
    }

}
