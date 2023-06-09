package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {

	public static void main(String[] args) {
		Cart cart1 = new Cart();
		
		DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		cart1.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		cart1.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		cart1.addDigitalVideoDisc(dvd3);
		
//		Test add
//		Array Parameter
		Cart cart2 = new Cart();
		DigitalVideoDisc dvdList[] = {dvd1,dvd2,dvd3};
		cart2.addDigitalVideoDisc(dvdList);
		
//		Arbitrary Parameter
		Cart cart3 = new Cart();
		cart3.addDigitalVideoDisc(dvd1,dvd2,dvd3);
		
		// Test for print 
		cart1.print();
		
		// Test for search
		cart1.search(3);
		cart1.search("The Lion King");
		cart1.search(10);
		cart1.search("Spider Man");
	}

}
