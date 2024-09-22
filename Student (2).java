package ver3remake;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person implements IPerson {

    public static Scanner sc = new Scanner(System.in);
    private float gpa;
    private String major;

    public Student(float gpa, String major, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public Student(float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
    }

    public Student() {
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
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
        return "Student{" + "id=" + this.id + ", fullName=" + this.fullName + ", dateOfBirth=" + this.dateOfBirth + "gpa=" + this.gpa + ", major=" + this.major + '}';
    }

//////////////////////////////////////////////////////////////////////////////
    @Override
    public void displayInfo() {
        System.out.println(toString());
    }

    @Override
    public void updatePerson(String id) {
        if (id.equals(getId())) {
            System.out.println("Enter name: ");

            fullName = sc.nextLine();
            setFullName(fullName);
            System.out.println("Enter ID: ");
            id = sc.nextLine();
            setId(id);

            System.out.println("Enter Date of birth: ");
            String date1 = sc.nextLine();
            SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy");
            try {
                dateOfBirth = date2.parse(date1);
                setDateOfBirth(dateOfBirth);
            } catch (Exception e) {
                System.out.println("Wrong format");
            }
            System.out.println("Enter GPA: ");
            gpa = sc.nextFloat();
            setGpa(gpa);
            sc.nextLine();
            System.out.println("Enter major: ");
            major = sc.nextLine();
            setMajor(major);
        }
    }

    @Override
    public void addPerson() {
        System.out.println("Enter name: ");
        fullName = sc.nextLine();
        setFullName(fullName);
        System.out.println("Enter ID: ");
        id = sc.nextLine();
        setId(id);
        System.out.println("Enter Date of birth: ");
        String date1 = sc.nextLine();
        SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dateOfBirth = date2.parse(date1);
            setDateOfBirth(dateOfBirth);
        } catch (Exception e) {
            System.out.println("Wrong format");
        }
        System.out.println("Enter GPA: ");
        gpa = sc.nextFloat();
        setGpa(gpa);
        sc.nextLine();
        System.out.println("Enter major: ");
        major = sc.nextLine();
        setMajor(major);
    }

}
