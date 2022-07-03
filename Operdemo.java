interface oper{
	public static void display() {
		System.out.println("display");
	}
}
public class Operdemo {

	
	public void display() {
		System.out.println("display6767");
	}
	
	public static void main(String[] args) {
		Operdemo operdemo=new Operdemo();
		oper.display();	
		operdemo.display();
	}
}
