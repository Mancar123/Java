public class ProductDetails{
	public static void main (String args[]){
		System.out.println("product details are");
		String pname="Laptop";
		int price=52000;
		int discount=66;
		String brandname="lenovo";
		int gst=564;
		int donation=500;
		int deliveryfee=99;
		int platformfee=10;
		int t_pa=price+donation+discount+gst+deliveryfee+platformfee;
		int tpg_amount=t_pa+(t_pa*10)/100;
		int actualamount=price-discount;

		System.out.println("Total payable amount is:"+ t_pa);
		System.out.println("total amount with gst:"+tpg_amount);
		System.out.println("pname:"+pname);
		System.out.println("actualpayableamount:"+(price-discount));
		System.out.println("withoutgst:"+(price+deliveryfee+platformfee+donation));
		


	}
}