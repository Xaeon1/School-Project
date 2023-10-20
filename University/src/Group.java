import java.util.ArrayList;
import java.util.Scanner;

public class Group {
    Scanner scan = new Scanner(System.in);
    private String groupName;
    private String groupSpeciality;
    private ArrayList<Student> students;

    public Group(String groupName, String groupSpeciality, ArrayList<Student> students) {
        this.groupName = groupName;
        this.groupSpeciality = groupSpeciality;
        this.students = students;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupSpeciality() {
        return groupSpeciality;
    }

    public void setGroupSpeciality(String groupSpeciality) {
        this.groupSpeciality = groupSpeciality;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void manageStudents(){
        while(true) {
            try {
                System.out.println("Enter command to proceed...");
                System.out.println("Options: add, del, print, exit");
                String cmd = scan.nextLine();
                switch (cmd) {
                    case "add":
                        students.add(Student.inputStudent());
                        break;
                    case "del":
                        String searchFacultyNumber = scan.nextLine();
                        students.removeIf(s -> s.getFacNumber().equals(searchFacultyNumber));
                        break;
                    case "print":
                        for (Student s : students) {
                            System.out.println("Student name: " + s.getName() + " | EGN: " + s.getEgn() + " | Faculty number: " + s.getFacNumber());
                        }
                        break;
                    case "exit":
                        System.exit(0);
                }
                    throw new MyException("Please enter a command correctly...");
            }catch (MyException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static Group createNewGroup(){
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Enter group info...");
        System.out.println("Group name: ");
        String groupName = scan.nextLine();
        System.out.println("Group speciality: ");
        String groupSpeciality = scan.nextLine();

        return new Group(groupName,groupSpeciality,students);
    }
}
