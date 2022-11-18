package generation.italy.shop;

public class Television extends Prodotto{
	private int sizeInches;
	private boolean smart;
	
	Television(int code, String name, String brand, double price, int iva, int sizeInches, boolean smart){
		super(code, name, brand, price, iva);
		this.sizeInches = sizeInches;
		this.smart = smart;
	}
}
