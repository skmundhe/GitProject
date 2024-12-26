package Constructor;

public class Cons2 {

	public Cons2() {
		System.out.println("print no argument cons1");
		
	}
	
	Cons2(String name, char C){
		System.out.println(name+" "+ C );
	}
	public static void main(String[] args) {
Cons2 C = new Cons2();

Cons2 C1 =new Cons2("Ashwin",'A');
Cons2 C2 =new Cons2("Santosh",'B');
	}


}
