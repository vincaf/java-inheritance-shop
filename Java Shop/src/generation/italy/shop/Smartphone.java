package generation.italy.shop;

public class Smartphone extends Prodotto{
	private int imeiCode;
	private int memoryStorage;
	
	Smartphone(int code, String name, String brand, double price, int iva, int imeiCode, int memoryStorage){
		super(code, name, brand, price, iva);
		this.imeiCode = imeiCode;
		this.memoryStorage = memoryStorage;
	}
}
