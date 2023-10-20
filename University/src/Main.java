import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Group> groups = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        University uni = new University("Seoul",3,groups,teachers);

        try {
            System.out.println("Select action...");
            System.out.println("Options: teachers, groups, exit");
            String action = scan.next();
            switch (action) {
                case "teachers":
                    uni.manageTeachers(teachers);
                    break;

                case "groups":
                    uni.manageGroups(groups, students);
                    break;

                case "exit":
                    System.exit(0);
            }
            throw new MyException("Please enter a command correctly...");
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}

