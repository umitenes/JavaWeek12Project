package constractors;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.name="Tarik";
        Employee employee2=new Employee("Umit",12,150000);
        Employee employee3=new Employee("Hasan",14,150000);

        ArrayList<Employee> list =new ArrayList<>();
        list.add(new Employee());
        list.add(employee1);
        list.addAll(Arrays.asList(employee2,employee3));
        System.out.println(list);


    }


}
