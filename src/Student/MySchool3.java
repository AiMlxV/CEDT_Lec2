package Student;

import java.util.ArrayList;

public class MySchool3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student());
        students.get(0).setName("Toe");

        students.add(new CEDTStudent());
        students.get(1).setName("James");

        students.add(new UndergraduateStudent(""));
        students.get(2).setName("John");

        for (Student s : students) {
            System.out.println(s.toString());
        }

        hello(new Student("Lisa"));
        hello(new CEDTStudent());
        hello(new UndergraduateStudent("pRAYUTH"));
    }

    public static void hello(Student s) {
        if (s instanceof UndergraduateStudent) {
            System.out.println("CEDT Love ProgMeth");
        }
        System.out.println(s);
    }

}
