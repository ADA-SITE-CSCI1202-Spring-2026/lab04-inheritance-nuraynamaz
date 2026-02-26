public class Student extends Person{
    private int StudentID;

    public Student()
    {
        super();
    }
    public Student(String firstName, String lastName, String gender, int studentID) {
        super(firstName, lastName, gender);
        this.StudentID = studentID;
    }
    public int getStudentID() {
        return StudentID;
    }
    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    @Override
    public String toString() {
        return super.toString() + "studentID=" + getStudentID();
    }

    public boolean equals(Student s)
    {
        return super.equals(s) && this.StudentID == s.getStudentID();
    }

}
