import java.util.Arrays;

public class Teacher extends Person{

    private String department;
    private String course[];

    public Teacher()
    {
        super();
    }

    public Teacher(String firstName, String lastName, String gender, String department, String[] course)
    {
        super(firstName, lastName, gender);
        this.department=department;
        this.course=course;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = new String[]{course};
    }

    @Override
    public String toString() {
        return super.toString() + "Department: " + getDepartment() + ", Course: " + getCourse();
    }

    public boolean equals(Teacher t) {
        return super.equals(t) &&
                this.department.equals(t.department) &&
                this.course.equals(t.course);
}


