package ver3remake;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonList {

    public static ArrayList<Person> personlist = new ArrayList<Person>();

    public PersonList() {
    }

    public static ArrayList<Person> getPersonlist() {
        return personlist;
    }

    public static void setPersonlist(ArrayList<Person> personlist) {
        PersonList.personlist = personlist;
    }

    public void addStudent() {
        Student student = new Student();
        student.addPerson();
        personlist.add(student);
    }

    public void addTeacher() {
        Teacher teacher = new Teacher();
        teacher.addPerson();
        personlist.add(teacher);
    }

    public void updatePerson(String id) {
        for (Person person : personlist) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (id.equals(student.getId())) {
                    student.updatePerson(id);

                }
            } else if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (id.equals(teacher.getId())) {
                    teacher.updatePerson(id);

                }
            } else {
                System.out.println("Not found !");
            }
        }
    }

    public void deletePersonById(String id) {
        Iterator<Person> iter = personlist.iterator();
        while (iter.hasNext()) {
            Person p = iter.next();
            if (id.equals(p.getId())) {
                iter.remove();
            }
        }
    }

    public void displayEveryone() {
        for (Person person : personlist) {
            person.displayInfo();
        }
    }

    public Student findTopStudent() {
        Student topstudent = (Student) personlist.get(0);
        for (Person person : personlist) {
            if (person instanceof Student) {
                Student student = (Student) person;

                if (student.getGpa() > topstudent.getGpa()) {
                    topstudent = student;
                }
            }
        }

        for (Person person : personlist) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.getGpa() == topstudent.getGpa()) {
                    student.displayInfo();
                }
            }
        }

        return topstudent;
    }

    public Teacher findTeacherByDepartment(String department) {
        Iterator<Person> iter = personlist.iterator();
        while (iter.hasNext()) {
            Teacher teacher = (Teacher) iter.next();
            if (department.equals(teacher.getDepartment())) {
                teacher.displayInfo();
            }
            return teacher;
        }
        return null;

    }

    public Person findPersonById(String id) {
        Iterator<Person> iter = personlist.iterator();
        while (iter.hasNext()) {

            Person p = iter.next();
            if (id.equals(p.getId())) {
                p.displayInfo();
            }
            return p;
        }
        return null;

    }
}
