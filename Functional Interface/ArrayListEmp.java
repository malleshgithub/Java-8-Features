/*Print employee object using toString() method*/
package FunctionalInterface;

import java.util.ArrayList;

class Employee{
	String name;
	int eno;
	Employee(String name, int eno){
		this.name=name;
		this.eno=eno;
	}
	public String toString() {
		return eno+":"+name;
	}
}
public class ArrayListEmp {

	public static void main(String[] args) {
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee("Raju", 1736453));
		l.add(new Employee("Mohan", 57687364));
		l.add(new Employee("Gopal", 78495867));
		l.add(new Employee("Suresh", 5873645));
		l.add(new Employee("Vinay", 5637465));
		System.out.println(l);
	}
}
