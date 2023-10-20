import java.util.Scanner;

public class Teacher extends Person {
    private String subject;
    private double salary;
    private int yearsOfExperience;

    public Teacher(String name, String egn, int yearOfBirth, String phoneNumber, String email, String subject, double salary, int yearsOfExperience) {
        super(name, egn, yearOfBirth, phoneNumber, email);
        this.subject = subject;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public static Teacher inputTeacher(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter teacher info...");
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
        System.out.println("Subject: ");
        String subject = scan.nextLine();
        System.out.println("Salary: ");
        double salary = scan.nextDouble();
        System.out.println("Years of experience: ");
        int yearsOfExperience = scan.nextInt();
        return new Teacher(name,egn,yearOfBirth,phoneNumber,email,subject,salary,yearsOfExperience);
    }
}
