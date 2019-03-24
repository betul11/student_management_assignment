import java.util.*;

public class Universitaet {

    private  String name;
    private Vector<Student> students = new Vector<Student>(500);

    public Universitaet(String n){
        name = n;
    }

    static void UniversitaetName() {
        
        System.out.println("I just got executed!");
    }

    public void add_student(String m, int i) {

        Student new_student = new Student(m, i);

        if (students.contains(new_student) == false) {
            students.add(new_student);
        }else{
            System.out.println("***** STUDENT ALREADY EXISTS");
        }


    }

    public void get_students() {

        int length = students.size();

        for (int i = 0; i < length; i++) {
            if (students.get(i) != null) {
                students.get(i).get_student();
            }
        }
    }

    public void search_student_name(String s) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) != null) {
                int n = students.get(i).get_name().toLowerCase().indexOf(s);
                if (n != -1) {
                    students.get(i).get_student();
                }
            }
        }
    }

    private Integer find_student_by_name(String s) {
        for (Integer i = 0; i < students.size(); i++) {
            System.out.println(i);
            if (students.get(i) != null) {
                int n = students.get(i).get_name().toLowerCase().indexOf(s);
                if (n != -1) {
                    students.get(i).get_student();
                    return i;
                }
            }
        }
        return -1;
    }

    public void edit_student(String _old, String _new) {

        int idx = find_student_by_name(_old);

        if (idx != -1) {
            students.get(idx).set_name(_new);
        } else {
            System.out.println("Student not found.");
        }
    }


    public void remove_student(String n) {
        int idx = find_student_by_name(n);
        students.remove(idx);
    }

}