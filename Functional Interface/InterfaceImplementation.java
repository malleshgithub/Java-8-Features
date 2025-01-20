/* Without functional interface */
package FunctionalInterface;

interface interf{
	public void m1();
}
class Demo implements interf{
	public void m1() {
		System.out.println("Implementation by normal interface");
	}
}
public class InterfaceImplementation {
	public static void main(String[] args) {
		interf i=new Demo();
		i.m1();
	}
}
