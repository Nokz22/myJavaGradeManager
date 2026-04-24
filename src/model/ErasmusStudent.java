package model;

public class ErasmusStudent extends Student {


//Attributes


    private double grade;



//Constructors
    public ErasmusStudent(String name, int id, String course){
        super(name, id, course);
    }



//Methods

    @Override
    public double calculateGrade() {
       return grade;
    }


//Getters


    public double getGrade(){
        return grade;
    }

}
