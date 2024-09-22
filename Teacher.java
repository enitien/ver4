package ver3remake;

import java.text.SimpleDateFormat;
import java.util.Date;
import static ver3remake.Student.sc;

public class Teacher extends Person implements IPerson {

    private String department;
    private String teachingSubject;

    public Teacher(String department, String teachingSubject, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public Teacher() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Teacher{" + "department=" + this.department + ", teachingSubject=" + this.teachingSubject + "id=" + this.id + ", fullName=" + this.fullName + ", dateOfBirth=" + this.dateOfBirth + '}';
    }

///////////////////////////////////////////////////////////////////////
    @Override
    public void displayInfo() {
        System.out.println(toString());
    }

    @Override
    public void updatePerson(String id) {
        if (id.equals(getId())) {

       
        System.out.println("Enter teacher: ");
        fullName = sc.nextLine();
        setFullName(fullName);
        System.out.println("Enter ID: ");
        id = sc.nextLine();
        setId(id);
        System.out.println("Enter Date: ");
        String date1 = sc.nextLine();
        SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dateOfBirth = date2.parse(date1);
            setDateOfBirth(dateOfBirth);
        } catch (Exception e) {
            System.out.println("Wrong format !");
        }
        System.out.println("Enter department: ");
        department = sc.nextLine();
        setDepartment(department);
        System.out.println("Enter teachingSubject: ");
        teachingSubject = sc.nextLine();
        setTeachingSubject(teachingSubject);
         }
    }

    @Override
    public void addPerson() {
        System.out.println("Enter teacher: ");
        fullName = sc.nextLine();
        setFullName(fullName);
        System.out.println("Enter ID: ");
        id = sc.nextLine();
        setId(id);
        System.out.println("Enter Date: ");
        String date1 = sc.nextLine();
        SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dateOfBirth = date2.parse(date1);
            setDateOfBirth(dateOfBirth);
        } catch (Exception e) {
            System.out.println("Wrong format !");
        }
        System.out.println("Enter department: ");
        department = sc.nextLine();
        setDepartment(department);
        System.out.println("Enter teachingSubject: ");
        teachingSubject = sc.nextLine();
        setTeachingSubject(teachingSubject);
    }

}
