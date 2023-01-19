package group;

import student.Student;

import java.util.Arrays;

public class Group {
    private Student [] students;
    private String profession;
    private int date;

    public Group() {
    }

    public Group(Student[] students, String profession, int date) {
        this.students = students;
        this.profession = profession;
        this.date = date;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "\nGroup{" +
                "\nstudents=" + Arrays.toString(students) +
                ",\nprofession='" + profession + '\'' +
                ",\ndate=" + date +
                '}';
    }
}
