package School.management.system;

import java.util.ArrayList;
import java.util.List;

public class mains {
    public static void main(String[] args) {
        Teacher rosy = new Teacher(id:1,name:"rosy",salary: 500)\
        Teacher laxman = new Teacher(id:2, name:"laxman", salary: 700 )
        Teacher pinki = new Teacher(id:3, name:"pinki", salary: 600 )

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(rosy);
        teacherList.add(laxman);
        teacherList.add(pinki);

        Student dhondi = new Student(id:1, name:"dhondi",grade:4)
        Student latika = new Student(id:2, name:"latika",grade:6)
        Student kriti = new Student(id:3, name:"kriti",grade:8)

        List<Student> studentList = new ArrayList<>();
        studentList.add(dhondi);
        studentList.add(latika);
        studentList.add(kriti);

        School ghs = new School(teacherList,studentList);
        System.out.println(ghs.getTotalMoneyEarned());

    }
}

