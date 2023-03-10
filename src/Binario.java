import java.util.*;
public class Binario {
	public static void main(String[]args) {
		int n=12;
		int r=0;
		Stack<Integer>Pila = new Stack <Integer>();
		while(n> 0 ) {
			r= n%2;
			Pila.push(r);
			n=n/2;
			
		}
		
		while(Pila.isEmpty()== false) {
			System.out.print(Pila.pop());
		}
		

}

}