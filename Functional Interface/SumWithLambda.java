/* Sum of two numbers with Lambda expression */
package FunctionalInterface;

interface interfacesuma{
	public void add(int a, int b);
}
public class SumWithLambda {
	public static void main(String[] args) {
		interfacesuma i=(a,b)->System.out.println("Sum: "+(a+b));
		i.add(10, 20);
	}

}
