public class Shoppingcart{
	public static void main(String args[]){

		int amt=60;
		if(amt>100){
			System.out.println("bill of shopping cart"+(amt-(amt*10)/100));
		}

		else 
			System.out.println("your bill remains same:"+amt);

	}
}