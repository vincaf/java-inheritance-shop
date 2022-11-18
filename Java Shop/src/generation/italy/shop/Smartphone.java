package generation.italy.shop;

public class Smartphone extends Prodotto{
	private int imeiCode;
	private int memoryStorage;
	
	Smartphone(int code, String name, String brand, double price, int iva, int imeiCode, int memoryStorage){
		super(code, name, brand, price, iva);
		this.imeiCode = imeiCode;
		this.memoryStorage = memoryStorage;
	}

	public int getImeiCode() {
		return imeiCode;
	}

	public void setImeiCode(int imeiCode) {
		this.imeiCode = imeiCode;
	}

	public int getMemoryStorage() {
		return memoryStorage;
	}

	public void setMemoryStorage(int memoryStorage) {
		this.memoryStorage = memoryStorage;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "\nIMEI code: " + getImeiCode()
				+ "\nMemory storage: " + getMemoryStorage() + "gb";
	}
}
