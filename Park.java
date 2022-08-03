class Person {
    private String firstName;
    private String lastName;
    private String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.gender    = gender;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPersonInfo() {
        return "Person(" + this.firstName + ", " + this.lastName + ", " + this.gender + ")";
    }
}

class User extends Person {
    private String email;
    private String mobile;


    public User(
        String email, 
        String mobile,
        String fName,
        String lName,
        String gender
        ) {
        super(fName, lName, gender);
        System.out.println(super.getPersonInfo());
        this.email  = email;
        this.mobile = mobile;
    }

    public String getEmail() {
        return this.email;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getUserInfo() {
        return "User(" + this.email + ", " + this.mobile + ")";
    }
}

abstract class Employee extends User {
    protected String id;
    protected double salary;
    double payBonus;

    public Employee(
        String id, 
        double salary, 
        String email, 
        String mobile,
        String fName,
        String lName,
        String gender
        ) {
        super(email, mobile, fName, lName, gender);
        System.out.println(super.getUserInfo());
        this.id       = id;
        this.salary   = salary;
    }

    public String getId() {
        return this.id;
    }

    public double getSalary() {
        return this.salary;
    }

    public double calculatePayBonus() {
        payBonus = 0.1 * salary;
        return this.payBonus;
    }

    public String getEmployeeInfo() {
        return "Employee(" +  "id: " + this.id + ", salary: " + this.salary + ", payBonus: " + this.calculatePayBonus() + ")";
    }
}

class Ranger extends Employee{
    public Ranger
        (
        String id, 
        double salary, 
        String email, 
        String mobile,
        String fName,
        String lName,
        String gender
        ) {
        super(id, salary, email, mobile, fName, lName, gender);
        System.out.println(super.getEmployeeInfo());
    }
}

class Visitor {

}

class Main {
    public static void main(String[] args) {
        Ranger ranger = new Ranger(
            "1",
            10000.,
            "bahtibekanvarov@gmail.com", 
            "+998998552572",
            "Bahtibek",
            "Anvarov",
            "Male"
            );
    }
}