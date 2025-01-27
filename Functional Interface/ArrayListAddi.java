/*Ascending order using ArrayList with Ternary operator*/
package FunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyNewComparator implements Comparator<Integer>{
	public int compare(Integer I1, Integer I2) {
		return (I1<I2)?-1:(I1>I2)?1:0;
	}
}
public class ArrayListAddi {

	public static void main(String[] args) {
	ArrayList<Integer> l=new ArrayList<Integer>();
	l.add(20);
	l.add(10);
	l.add(25);
	l.add(30);
	l.add(0);
	l.add(15);
	System.out.println(l);
	Collections.sort(l, new MyNewComparator());
	System.out.println(l);
	}

}
