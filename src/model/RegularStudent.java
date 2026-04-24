package model;

import java.util.ArrayList;
import java.util.List;

public class RegularStudent extends Student {

//Attributes


    private List<Double> grade = new ArrayList<>();


//Constructors


    public RegularStudent(String name, int id, String course) {
        super(name, id, course);
    }


//Methods

    @Override
    public double calculateGrade() {

        double sum = 0;

        if (grade.isEmpty()) {
            return 0.0;
        }

        for (Double g : grade) {
            sum += g;


        }

        return sum / grade.size();

    }


    public void addGrade(double newGrade){

        grade.add(newGrade);

    }


//Getters


    public List<Double> getGradeList() { return grade; }



}

