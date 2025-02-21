public class Swaptwonumbers{
	public static void main(String args[]){
		int a=5;
		int b=2;
		System.out.println("before swapping of two numbers:"+a);
		System.out.println("before swapping of two numbers:"+b);

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("after swapping of two numbers:"+a);
		System.out.println("after swapping of two numbers:"+b);

	}
}
