package Student;

public class MySchool {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Toe");
        System.out.println(s1.getName());

        CEDTStudent s2 = new CEDTStudent();
        s2.setName("Toe2");
        s2.setInternCompany("Meta");
        System.out.println(s2.toString());
    }
}
