/* Without functional interface by Interface reference*/
package FunctionalInterface;

interface interfa{
	public void m1();
}
class Demo1 implements interfa{
	public void m1() {
		System.out.println("Implementation by normal interface by Interface reference");
	}
}
public class InterfaceImplementationBy {
	public static void main(String[] args) {
		interfa i=new Demo1();
		i.m1();
	}
}
