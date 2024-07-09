public class Instructor extends User{
    private String instructorNumber;

    Instructor(){}

    public Instructor(int id, String name, String surname, String email, String password, String instructorNumber) {
        super(id, name, surname, email, password);
        this.instructorNumber = instructorNumber;
    }

    public String getInstructorNumber() {
        return instructorNumber;
    }

    public void setInstructorNumber(String instructorNumber) {
        this.instructorNumber = instructorNumber;
    }
}
