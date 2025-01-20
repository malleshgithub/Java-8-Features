/*functional interface by Lambda Expression*/
package FunctionalInterface;

interface interfac{
	public void m1();
}
public class InterfaceImplementationByFI {
	public static void main(String[] args) {
		interfac i=()->System.out.println("Implementation by Lambda Expression");
		i.m1();
	}
}
