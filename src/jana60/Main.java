package jana60;

public class Main {

	public static void main(String[] args) {

		Smartphone prodotto1 = new Smartphone(104, "Galaxy7 ", "Samsung ", 299.99, 128);
		Tv prodotto2 = new Tv(108, " Led ", " LG ", 399.99, 32, false);
		Cuffie prodotto3 = new Cuffie(155, " Gold ", " Sony ", 99.99, " Bianche ", true);
		System.out.println(prodotto1.toString());
		System.out.println(prodotto2.toString());
		System.out.println(prodotto3.toString());

	}

}
