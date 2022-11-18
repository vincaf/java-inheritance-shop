package generation.italy.shop;

public class Main {

	public static void main(String[] args) {
		
		Prodotto pr1 = new Prodotto(002, "Computer", "Acer", 12, 10);
		System.out.println(pr1);
		
		System.out.println("\n----------\n");
		
		Smartphone smrt1 = new Smartphone(343, "Android Galaxy 78", "Samsium", 380, 20, 333, 128);
		System.out.println(smrt1);
	}

}
