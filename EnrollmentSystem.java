class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    String studentID;
    String course;
    int units;
    final int feePerUnit = 1000;

    Student(String name, int age, String studentID, String course, int units) {
        super(name, age);
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    double calculateFees() {
        return units * feePerUnit;
    }

    void displayInfo() {
        System.out.println("Student Name: " + name + ", Age: " + age + 
                           ", Student ID: " + studentID + ", Course: " + course + 
                           ", Units: " + units + ", Total Fee: " + calculateFees());
    }
}

class Instructor extends Person {
    String employeeID;
    String department;
    double salary;

    Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Instructor Name: " + name + ", Age: " + age + 
                           ", Employee ID: " + employeeID + ", Department: " + department + 
                           ", Salary: " + salary);
    }
}

public class EnrollmentSystem {
    static void printDetails(Person p) {
        p.displayInfo();
    }

    public static void main(String[] args) {
        Student student1 = new Student("Xyja", 18, "231004771", "Computer Engineering", 5);
        Student student2 = new Student("Gigi", 19, "231000392", "Nurisng", 4);
        Instructor instructor1 = new Instructor("Engr. Jovillano", 22, "12345", "CEA", 100000);
        Instructor instructor2 = new Instructor("Engr. Caning", 26, "12345", "CEA", 100000);

        printDetails(student1);
        printDetails(student2);
        printDetails(instructor1);
        printDetails(instructor2);
    }
}