package data;

@FunctionalInterface
interface Mysam{
	void show();
	String toString();
}

 class A extends Object implements Mysam{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to All !");
	}
	 
 }
public class Pattern  {
	public static void main(String[] args) {
		A a=new A();
		a.show();
		Mysam m=() -> System.out.println("*********By Diwakar:)");
		m.show();
		//a.show();
		
	}
}
