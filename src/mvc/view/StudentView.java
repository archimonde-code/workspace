package mvc.view;

public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo, int studentAge, String studentAddress) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
        System.out.println("Age: " + studentAge);
        System.out.println("Address: " + studentAddress);
    }
}
