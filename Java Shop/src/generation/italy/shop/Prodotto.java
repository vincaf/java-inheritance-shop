package generation.italy.shop;

public class Prodotto {
	
	private int code;
	private String name;
	private String brand;
	private double price;
	private int iva = 22;
	
	public Prodotto(int code, String name, String brand, double price) {
		this.code = code;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
}
