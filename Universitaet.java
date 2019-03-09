public class Universitaet {

    private String name;
    private Student[] students = new Student[500];
    private Integer student_counter = 0;

    static void UniversitaetName() {
        System.out.println("I just got executed!");
    }

    public void add_student(String m, int i) {

        Student new_student = new Student(m, i);

        student_counter = student_counter + 1;
        students[student_counter] = new_student;

    }

    public void get_students() {

        int length = students.length;

        for (int i = 0; i < length; i++) {
            if (students[i] != null) {
                students[i].get_student();
            }
        }
    }

    public void search_student_name(String s) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                int n = students[i].name.toLowerCase().indexOf(s);
                if (n != -1) {
                    students[i].get_student();
                }
            }
        }
    }

    private int find_student_by_name(String s) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                int n = students[i].name.toLowerCase().indexOf(s);
                if (n != -1) {
                    students[i].get_student();
                    return i;
                }
            }
        }
        return -1;
    }

    public void edit_student(String _old, String _new) {

        int idx = find_student_by_name(_old);

        if (idx != -1) {
            students[idx].set_name(_new);
        } else {
            System.out.println("Student not found.");
        }
    }

    private void remove_from_students(Integer i) {
        int length = students.length;
        for (int idx = i; idx < length - 1; idx++) {
            students[idx] = students[idx + 1];
        }
    }

    public void remove_student(String n) {
        int idx = find_student_by_name(n);
        remove_from_students(idx);
    }

}