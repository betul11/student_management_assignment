import java.util.*;
public class Student {

    private int id;

    private String name;
    private String surname;
    
    private Date date_of_birth;
    private Date registration_date;
    
    private short GPA;
    private String address;
    private String phoneNumber;
    private String email;


    String[] courses = new String[100];

    private Integer course_counter = 0;

    public Student(String n, Integer i, String sn) {
        name = n;
        id = i;
        surname = sn;
    }

    public Student(String n, Integer i) {
        surname = n;
        id = i;
    }

    public Student(Integer i) {
        id = i;
    }

    public void set_course(String course_name) {

        // int length = courses.length;
        courses[course_counter] = course_name;
        course_counter = course_counter + 1;
    }

    public void get_courses() {
        int length = courses.length;
        System.out.println(String.format("Courses for %s", name));
        for (int i = 0; i < length; i++) {
            if (courses[i] != null) {
                String course = String.format("Course #: %d, Course Name: %s", i + 1, courses[i], name);
                System.out.println(course);
            }
        }
    }

    public void get_student() {
        String message = String.format("Student surname: %s, Student id: %d ", surname, id);
        System.out.println(message);

    }

    public String get_name(){
        return surname;
    }

    public void set_name(String n) {
        surname = n;
    }

    public void set_id(Integer i) {
        id = i;
    }

    public boolean equals(Object o) {
        Student s = (Student) o;

        if( this.id == s.id ){
            return true;
        }
        
        return false;

    }

    public String toString(){

        return String.format("%d, %s", this.id, this.surname.toUpperCase());

    }
}