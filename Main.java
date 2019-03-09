
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Universitaet uni = new Universitaet();

    uni.add_student("Betul", 1);
    uni.add_student("Farzan", 2);
    
    System.out.println("Welche Operation moechten Sie durchfuehren?");

    Integer operation = 0;

    while (operation != 6) {

      System.out.println("1- add student");
      System.out.println("2- list students");
      System.out.println("3- Search student");
      System.out.println("4- edit student");
      System.out.println("5- delete student");
      System.out.println("6- exit");

      Scanner r = new Scanner(System.in);
      operation = r.nextInt();
      switch (operation) {

      case 1:
        System.out.println("Write the student's name then ID number");
        Scanner l = new Scanner(System.in);
        String student_name = l.nextLine();
        l = new Scanner(System.in);
        int matrikelsnummer = l.nextInt();
        uni.add_student(student_name, matrikelsnummer);

        break;

      case 2:
        uni.get_students();
        break;
      case 3:
        System.out.println("Find Student");
        l = new Scanner(System.in);
        String student_search = l.nextLine();
        uni.search_student_name(student_search.toLowerCase());

        break;
      case 4:
        System.out.println("Enter student name to edit");
        l = new Scanner(System.in);
        String old_name = l.nextLine();
        System.out.println("Enter the new name");
        l = new Scanner(System.in);
        String new_name = l.nextLine();
        uni.edit_student(old_name, new_name);

        break;

      case 5:
        System.out.println("Enter the student name to remove");
        l = new Scanner(System.in);
        String remove_student_name = l.nextLine();
        uni.remove_student(remove_student_name);
      }

    }


  }
}
