package ver3remake;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        PersonList personlist = new PersonList();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println(
                    "1. Add new student\n"
                    + "2. Add new teacher\n"
                    + "3. Update person by id\n"
                    + "4. Delete person by id\n"
                    + "5. Display all students and teachers\n"
                    + "6. Find the student with the highest GPA\n"
                    + "7. Find teachers by department");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    personlist.addStudent();
                    break;
                case 2:
                    personlist.addTeacher();
                    break;
                case 3:
                    System.out.println("Enter ID: ");
                    String id = sc.nextLine();
                    personlist.updatePerson(id);
                    break;
                case 4:
                    System.out.print("Enter id: ");
                    id = sc.nextLine();
                    personlist.deletePersonById(id);
                    break;
                case 5:
                    personlist.displayEveryone();
                    break;
                case 6:
                    personlist.findTopStudent();
                    break;
                case 7:
                    System.out.print("Enter apartment: ");
                    String apartment = sc.nextLine();
                    personlist.findTeacherByDepartment(apartment);
                    break;
                default:
                    System.out.println("Wrong");
                    break;
            }
        } while (choice != 8);
    }
}
