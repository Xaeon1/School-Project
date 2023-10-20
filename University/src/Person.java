public class Person {
    private String name;
    private String egn;
    private int yearOfBirth;
    private String phoneNumber;
    private String email;

    public Person(String name, String egn, int yearOfBirth, String phoneNumber, String email) {
        this.name = name;
        this.egn = egn;
        this.yearOfBirth = yearOfBirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public int getDateOfBirth() {
        return yearOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.yearOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
