public class Main {
    public static void main(String[] args) {

        Student studentUser = new Student(1, "<studentName>", "<studentSurname>", "studentEmail@domain.com", "studentPassword", "00000000");
        Instructor instructorUser = new Instructor(1, "<instructorName>", "<instructorSurname>", "instructorEmail@domain.com", "instructorPassword", "11111111");


        StudentManager studentManager = new StudentManager();
        studentManager.add(studentUser);

        System.out.println();
        System.out.println();

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructorUser);

        System.out.println();


        UserManager userManager = new UserManager();


        userManager.add(studentUser);
        System.out.println();

        userManager.add(instructorUser);


    }
}