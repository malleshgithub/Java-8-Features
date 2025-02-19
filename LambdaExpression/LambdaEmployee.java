/*Ascending order by employee name*/
package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;

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
public class LambdaEmployee {

	public static void main(String[] args) {
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee("Gopal", 847563));
		l.add(new Employee("Suresh", 583736));
		l.add(new Employee("Niraj", 985764));
		System.out.println(l);
		//Collections.sort(l, (e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		//Ascending order by employee name
		Collections.sort(l, (e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(l);
	}

}
