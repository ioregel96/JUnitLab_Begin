package csc131.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class GiftCardTest {

	@Test
	public void GetIssuingStore() 
	{
		 double balance;
		 GiftCard card;
		 int issuingStore;

		 issuingStore = 1337;
		 balance = 100.00;
		 card = new GiftCard(issuingStore, balance);
		 assertEquals("getIssuingStore()", issuingStore, card.getIssuingStore()); 
		 

	}
	
	@Test
	public void deduct_RemainingBalance() {
		double balance;
		GiftCard card;
		int issuingStore;
		String s;
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);

		s = "Remaining Balance: " + String.format("%6.2f", 90.00);
		assertEquals("deduct(10.00)", s, card.deduct(10.0));
	}


}
