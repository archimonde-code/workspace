package mvc;

import mvc.controller.StudentController;
import mvc.model.Student;
import mvc.view.StudentView;

public class MVCStudentDemo {

    public static void main(String[] args) {
        //从数据库获取学生记录
        Student model  = retrieveStudentFromDatabase();

        //创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //更新模型数据
        controller.setStudentName("Archer");

        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        student.setAge(22);
        student.setAddress("北京市");
        return student;
    }
}
