package day2;

public class Product {
		    String productName;
		    double price;
		    double gst;
		    double discount;
		    int quantity;
		    public static void main(String[] args) {
		    	Product p1=new Product();
		     p1.productName="oil";
		     p1.price=101;
		     p1.gst=7.5;
		     p1.discount=89.9;
		     p1.quantity=20;
		     System.out.println("Product Name :"+p1.productName);
		    System.out.println("price :"+p1.price);
		    System.out.println("GST percentage :"+p1.gst);
		    System.out.println("Discount :"+p1.discount);
		    System.out.println("Quantity :"+p1.quantity);
		    System.out.println("----------------------------");
}
}	   
		       



