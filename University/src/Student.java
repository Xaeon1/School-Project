import java.util.Scanner;

public class Student extends Person {
    private String facNumber;
    private String dateOfSignUp;
    private int yearInUniversity;
    private String speciality;

    public Student(String name, String egn, int yearOfBirth, String phoneNumber, String email, String facNumber, String dateOfSignUp, int yearInUniversity, String speciality) {
        super(name, egn, yearOfBirth, phoneNumber, email);
        this.facNumber = facNumber;
        this.dateOfSignUp = dateOfSignUp;
        this.yearInUniversity = yearInUniversity;
        this.speciality = speciality;
    }

    public String getFacNumber() {
        return facNumber;
    }

    public void setFacNumber(String facNumber) {
        this.facNumber = facNumber;
    }

    public String getDateOfSignUp() {
        return dateOfSignUp;
    }

    public void setDateOfSignUp(String dateOfSignUp) {
        this.dateOfSignUp = dateOfSignUp;
    }

    public int getYearInUniversity() {
        return yearInUniversity;
    }

    public void setYearInUniversity(int yearInUniversity) {
        this.yearInUniversity = yearInUniversity;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public static Student inputStudent(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter student's info...");
        System.out.println("Name: ");
        String name = scan.nextLine();
        System.out.println("EGN: ");
        String egn = scan.nextLine();
        System.out.println("Year of birth: ");
        int yearOfBirth = scan.nextInt();
        System.out.println("Phone number: ");
        String phoneNumber = scan.nextLine();
        System.out.println("Email: ");
        String email = scan.nextLine();
        System.out.println("Faculty Number: ");
        String facNumber = scan.nextLine();
        System.out.println("Date of Sign Up:");
        String dateOfSignUp = scan.nextLine();
        System.out.println("Year in university: ");
        int yearInUniversity = scan.nextInt();
        System.out.println("Speciality: ");
        String speciality = scan.next();

        return new Student(name,egn,yearOfBirth,phoneNumber,email,facNumber,dateOfSignUp,yearInUniversity,speciality);
    }
}
