package mvc.controller;

import mvc.model.Student;
import mvc.view.StudentView;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }

    public void setStudentAge(int age){
        model.setAge(age);
    }

    public int getStudentAge(){
        return model.getAge();
    }

    public String getStudentAddress(){
        return model.getAddress();
    }

    public void setStudentAddress(String address){
        model.setAddress(address);
    }

    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo(), model.getAge(), model.getAddress());
    }
}