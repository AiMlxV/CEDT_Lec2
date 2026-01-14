package Student;

public class MySchool2
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.setName("Toe");
        System.out.println(s1.toString());

        Student s2 = new CEDTStudent();
        s2.setName("Toe2");
        System.out.println(s2.toString());

        CEDTStudent s3 = (CEDTStudent)s2;
        s3.setInternCompany("SayHi");
        System.out.println(s3.toString());

//        CEDTStudent s4 = (CEDTStudent)s1;
//        s4.setInternCompany("SayHi");
//        System.out.println(s4.toString());
    }
}
