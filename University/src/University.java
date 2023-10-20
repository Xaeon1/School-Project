import java.util.*;

public class University {
    Scanner scan = new Scanner(System.in);
    private String address;
    private int numberOfGroups;
    private ArrayList<Group> groups;
    private ArrayList<Teacher> teachers;

    public University(String address, int numberOfGroups, ArrayList<Group> groups, ArrayList<Teacher> teachers) {
        this.address = address;
        this.numberOfGroups = numberOfGroups;
        this.groups = groups;
        this.teachers = teachers;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(int numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void manageTeachers(ArrayList<Teacher> teachers){
        while(true) {
            try {
                System.out.println("Enter command to proceed...");
                System.out.println("Options: add, del, print, exit");
                String cmd = scan.nextLine();
                switch (cmd) {
                    case "add":
                        teachers.add(Teacher.inputTeacher());
                        break;
                    case "del":
                        System.out.println("Search EGN to delete...");
                        String searchEGN = scan.nextLine();
                        teachers.removeIf(th -> th.getEgn().equals(searchEGN));
                        break;
                    case "print":
                        for (Teacher t : teachers) {
                            System.out.println("Teacher name: " + t.getName() + "| EGN: " + t.getEgn());
                        }
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

    public void manageGroups(ArrayList<Group> groups, ArrayList<Student> students){
        while (true){
        try {
            System.out.println("Enter command to proceed...");
            System.out.println("Options: add, del, print, students, exit");
            String cmd = scan.nextLine();
            switch (cmd) {
                case "add":
                    groups.add(Group.createNewGroup());
                    break;
                case "del":
                    System.out.println("Search group name to delete...");
                    String searchName = scan.nextLine();
                    groups.removeIf(g -> g.getGroupName().equals(searchName));
                    break;
                case "print":
                    for (Group g : groups) {
                        System.out.println("Group name: " + g.getGroupName() + " | Speciality: " + g.getGroupSpeciality());
                    }
                    break;
                case "students":
                    System.out.println("Search for group name...");
                    String grName = scan.nextLine();
                    for (Group grp : groups) {
                        if (grp.getGroupName().equals(grName)) {
                            grp.manageStudents();
                            String st = students.toString();
                            System.out.println(st);
                        }
                    }
                    break;
                case "exit":
                    System.exit(0);
                }
                throw new MyException("Please enter a command correctly...");
            }catch (MyException e){
                System.out.println(e);
            }
        }
    }
}
