package Assignment3;

import java.util.TreeSet;

public class Q3 {
    public static void main(String[] args) {
        TreeSet<Employee> treeSet = new TreeSet<Employee>();
        Employee emp1 = new Employee("aalu", 22, 40000,"CSE");
        Employee emp2 = new Employee("bjay", 25, 80000,"ECE");
        Employee emp3 = new Employee("carol", 30, 150000,"MECH");
        Employee emp4 = new Employee("dohn", 40, 50000,"ESE");
        Employee emp5 = new Employee("eema", 33, 90000,"IT");
        Employee emp6 = new Employee("feha", 25, 160000,"MBA");
        Employee emp7 = new Employee("gavid", 32, 20000,"AI");
        Employee emp8 = new Employee("hiro", 33, 30000,"CIVIL");
        Employee emp9 = new Employee("iana", 29, 170000,"AUTO");
        Employee emp10 = new Employee("jeter", 35, 50000,"MB");
        treeSet.add(emp1);
        treeSet.add(emp2);
        treeSet.add(emp3);
        treeSet.add(emp4);
        treeSet.add(emp5);
        treeSet.add(emp6);
        treeSet.add(emp7);
        treeSet.add(emp8);
        treeSet.add(emp9);
        treeSet.add(emp10);
        System.out.println("treeSet : " + treeSet + "\n");
        for( Employee employee : treeSet )
        {
            System.out.println("Employee Name : "+employee.getName());
            System.out.println("Employee Age : "+employee.getAge());
            System.out.println("Employee Salary :"+ employee.getSalary());
            System.out.println("Employee Dept :"+ employee.getDept());
            System.out.println("--------------------------------------------");
        }
    }
}
