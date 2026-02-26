public class Person {
    private String firstName;
    private String lastName;
    private String gender;

    public Person()
    {
    }
    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name is " + firstName + ", Last name is " + lastName + ", and gender is  " + gender;
    }

    public boolean equals(Person p)
    {

        return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName)&&this.gender.equals(p.gender);
    }

}
