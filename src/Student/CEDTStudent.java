package Student;

import java.util.Arrays;

public class CEDTStudent extends Student
{
    String fridayActivities;
    protected String internCompany;

    public String getInternCompany() {
        return internCompany;
    }

    public void setInternCompany(String internCompany) {
        this.internCompany = internCompany;
    }

    @Override
    public String toString() {
        return "CEDTStudent{" +
                "internCompany='" + internCompany + '\'' +
                ", name='" + name + '\'' +
                ", test=" + Arrays.toString(test) +
                ", courseGrade='" + courseGrade + '\'' +
                '}';
    }
}
