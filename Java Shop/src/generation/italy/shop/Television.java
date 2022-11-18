package generation.italy.shop;

public class Television extends Prodotto{
	private int sizeInches;
	private boolean smart;
	
	Television(int code, String name, String brand, double price, int iva, int sizeInches, boolean smart){
		super(code, name, brand, price, iva);
		this.sizeInches = sizeInches;
		this.smart = smart;
	}

	public int getSizeInches() {
		return sizeInches;
	}

	public void setSizeInches(int sizeInches) {
		this.sizeInches = sizeInches;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "\nTelevision size: " + getSizeInches()
				+ "''\nSmart tv: " + isSmart();
	}
}
