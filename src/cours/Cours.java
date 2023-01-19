package cours;

import group.Group;

import java.util.Arrays;

public class Cours {
    private String nameCours;
    private int number;
    String nameTeacher;
    private Group [] groups;
    public Cours() {
    }

    public Cours(String nameCours, int number, String nameTeacher, Group [] groups) {
        this.nameCours = nameCours;
        this.number = number;
        this.nameTeacher = nameTeacher;
        this.groups = groups;
    }

    public String getNameCours() {
        return nameCours;
    }

    public void setNameCours(String nameCours) {
        this.nameCours = nameCours;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public Group [] getGroups() {
        return groups;
    }

    public void setGroups(Group [] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "\nCours{" +
                "\nnameCours='" + nameCours + '\'' +
                ",\nnumber=" + number +
                ",\nnameTeacher='" + nameTeacher + '\'' +
                ",\ngroups=" + Arrays.toString(groups) +
                '}';
    }
}
