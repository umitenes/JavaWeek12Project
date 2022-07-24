package constractors;

public class Employee {
    public String name;
    public int ID;
    public double salary;

    public Employee(){
        salary=10000;
    }

    public Employee(String name, int ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", salary= $" + salary +
                '}';
    }
}
