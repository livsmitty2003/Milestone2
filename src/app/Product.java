package app;

/* 
 * The Product class is a superclass that creates a generic product. It's constructor creates a product with an ID, 
 * name, description, price, quantity. A lineSeparator is created for formatting purposes. The toString() method
 * allows for the display of product details; the reduceQuantity() method reduces a products quantity when a purchase
 * is made; the increaseQuantity() method increases a products quantity when an item is returned.
 */
public class Product {
	
	//Declare Variables
	public int id;
	public String name;
	public String description;
	public double price;
	public int quantity;
	String lineSeparator = System.lineSeparator();

	//Construct a product
	public Product(int id, String name, String description, double price, int quantity) 
	{
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Allows an object's details to be printed to screen
	@Override
	public String toString() 
	{
		String listItem = "ID: " + this.id + lineSeparator + "Name: " + this.name + lineSeparator + "Description: " + this.description + lineSeparator + "Price: " + this.price + lineSeparator + "Quantity: " + this.quantity + lineSeparator;
		return listItem; 
	}
	
	//Reduces quantity of an item, after purchase
	public void reduceQuantity() {
		this.quantity = this.quantity - 1;
	}
	
	//Increases quantity of an item, after return
	public void increaseQuantity()
	{
		this.quantity = this.quantity + 1;
		System.out.println("The  " + this.name + " has been returned."); 
	}
	
	
}
	

