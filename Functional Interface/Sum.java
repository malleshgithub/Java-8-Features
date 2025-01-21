/* Sum of two numbers without Lambda expression */
package FunctionalInterface;

interface interfacesum{
	public void add(int a, int b);
}
class Demo3 implements interfacesum{
	public void add(int a, int b) {
	System.out.println("Sum: "+(a+b));	
	}
}
public class Sum {
	public static void main(String[] args) {
		interfacesum i=new Demo3();
		i.add(10, 20);
	}
}
