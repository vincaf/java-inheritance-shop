package generation.italy.shop;

public class Headphones extends Prodotto {
	
	private String color;
	private boolean wireless;
	
	Headphones(int code, String name, String brand, double price, int iva, String color, boolean wireless){
		super(code, name, brand, price, iva);
		this.color = color;
		this.wireless = wireless;
	}
	
	
}
