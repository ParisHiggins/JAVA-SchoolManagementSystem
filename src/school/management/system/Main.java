package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher Lizzy = new Teacher(1, "Lizzy", 200);
        Teacher Melissa = new Teacher(2, "Melissa", 700);
        Teacher Sean = new Teacher(3, "Sean", 500);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Lizzy);
        teacherList.add(Melissa);
        teacherList.add(Sean);

        Student Paris = new Student(1, "Paris", 12);
        Student Shannon = new Student(2, "Shannon", 12);
        Student Tayah = new Student(3, "Tayah", 6);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Paris);
        studentList.add(Shannon);
        studentList.add(Tayah);

        School abc = new School(teacherList, studentList);


        Paris.payFees(1000);
        Shannon.payFees(1000);
        System.out.println("Paris has £" + Paris.getRemainingFees() + " left to pay!");
        System.out.println("abc has earned £" + abc.getTotalMoneyEarned());
        System.out.println("----------");
        System.out.println("----- Making ABC PAY SALARY -----");
        Lizzy.receiveSalary(Lizzy.getSalary());
        System.out.println("ABC has paid " +Lizzy.getName() + " an amount of: £" + Lizzy.getSalary() + " and now has £" + abc.getTotalMoneyEarned());
        Melissa.receiveSalary(Melissa.getSalary());
        System.out.println("----------");
        System.out.println("ABC has paid " +Melissa.getName() + " an amount of: £" + Melissa.getSalary() + " and now has £" + abc.getTotalMoneyEarned());

        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");

        System.out.println(Paris);
        System.out.println(Lizzy);

    }
}
/**
 * create GUI
 * **/