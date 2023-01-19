package student;

public class Student {
    private String name;
    private String lastName;
    private int birthday;
    private String email;

    public Student() {
    }
    public Student(int birthday, String name, String lastName, String email) {
        if (birthday<2023){
            this.birthday = birthday;
        }else{
            System.out.println("Minus san!");
        }
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public int getBirthday() {
        return birthday;
    }
    public void setBirthday(int birthday) {

        if (birthday<2023){
            this.birthday = birthday;
        }else{
            System.out.println("Minus san!");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "\nname='" + name + '\'' +
                ", \nlastName='" + lastName + '\'' +
                ", \nbirthday=" + birthday +
                ", \nemail='" + email + '\'' +
                '}';
    }
}
