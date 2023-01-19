import cours.Cours;
import group.Group;
import student.Student;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(1993,"Gulnur"," Bakirova"," bakirova9309@gmail.com");
        Student student2 = new Student(1998,"Albina"," Toktonalieva"," balbina98@gmail.com");
        Student student3 = new Student(2000,"Nurisa"," Japarova"," nurisa20@gmail.com");
        Student student4 = new Student(1997,"Asan"," Tairov"," asan0997@gmail.com");
        Student student5 = new Student(2006,"Bayel"," Zakirov"," zakirov06@gmail.com");
        Student student6 = new Student(1987,"Nargiza"," Galova"," galova87@gmail.com");
        Student student7 = new Student(1995,"Jazira"," jyrgalova"," jyrgalova95@gmail.com");
        Student student8 = new Student(2003,"Malika"," Moloshova"," moloshova003@gmail.com");


        Student [] students ={student,student2,student3,student4};
        Group gr = new Group(students,"It developer",2022);

        Student [] students1 ={student5,student6,student7,student8};
        Group group = new Group(students1,"Pharmacevt",2011);

        Group [] groups = {gr,group};
        Cours cours = new Cours("Java ",5,"Timurlan Kasymbekov",groups);
        System.out.println(cours);
    }
}