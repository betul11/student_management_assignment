public class Student {

    private String name;
    private Integer id;

    String[] courses = new String[100];

    private Integer course_counter = 0;

    public Student(String n) {
        name = n;
    }

    public Student(String n, Integer i) {
        name = n;
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
        String message = String.format("Student name: %s, Student id: %d ", name, id);
        System.out.println(message);

    }

    public String get_name(){
        return name;
    }

    public void set_name(String n) {
        name = n;
    }

    public void set_id(Integer i) {
        id = i;
    }

}