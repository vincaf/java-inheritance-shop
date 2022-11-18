package generation.italy.shop;

public class Main {

	public static void main(String[] args) {
		
		Prodotto pr1 = new Prodotto(002, "Computer", "Acer", 12, 10);
		System.out.println(pr1);
		
		System.out.println("\n----------\n");
		
		Smartphone smrt1 = new Smartphone(343, "Android Galaxy 78", "Samsium", 380, 20, 333, 128);
		System.out.println(smrt1);
		
		System.out.println("\n----------\n");
		
		Television tv1 = new Television(564, "Super Tv Crystal UHD", "Sonyx", 245, 10, 50, true);
		System.out.println(tv1);
		
		System.out.println("\n----------\n");
		
		Headphones hdp1 = new Headphones(324, "JBN Tune 510", "JBN headphones", 30, 5, "Black", true);
		System.out.println(hdp1);
		
	}

}
