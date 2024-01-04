import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Teacher Anna = new Teacher(1, "Anna", 4700);
        Teacher Michael = new Teacher(2, "Michael", 6300);
        Teacher Olivia = new Teacher(3, "Olivia", 5600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Anna);
        teacherList.add(Michael);
        teacherList.add(Olivia);

        Student Joanna = new Student(1, "Joanna", 42);
        Student Julia = new Student(2, "Julia", 76);
        Student Robert = new Student(3, "Robert", 58);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Joanna);
        studentList.add(Julia);
        studentList.add(Robert);

        School abc = new School(teacherList, studentList);

        Joanna.payFees(60000);
        Robert.payFees(50000);
        Julia.payFees(30000);

        Teacher Ava = new Teacher(5, "Ava", 8300);
        abc.addTeacher(Ava);

        System.out.println("school has earned: " + abc.getTotalMoneyEarned());

        System.out.println(" --------- School's Pay Salary ------");

        Anna.receiveSalary(Anna.getSalary());
        System.out.println(
                "School has spent for salary to " + Anna.getName() + " and now has: " + abc.getTotalMoneyEarned());

        Michael.receiveSalary(Michael.getSalary());
        System.out.println(
                "School has spent for salary to " + Michael.getName() + " and now has: " + abc.getTotalMoneyEarned());

        Ava.receiveSalary(Ava.getSalary());
        System.out.println(
                "School has spent for salary to " + Ava.getName() + " and now has: " + abc.getTotalMoneyEarned());

        System.out.println(Joanna);
        System.out.println(Julia);
        System.out.println(Robert);

    }
}