package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 *ArrayList to implement teachers and students
 *
 *  List<Integer> numbers = new ArrayList<>();
 *  numbers.add(5); <-- adds 5 to array
 *  we can also do this with CLASSES... E.G. List<Teacher> teacher;
 *
 *  STATIC
 *  - with static we can access the method
 *  - CAN ACCESS METHOD FROM DIFFERENT CLASSES
 **/

public class School {

    private List<Teacher> teachers; // so we can have many teachers and students
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    // created as soon as a new school object is created and initialised all values
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    //setter
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    //setter
    public void addStudents(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    //setter
    public static void updateTotalMoneyEarned(int moneyEarned) {
       totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

}
