package Core;

public class CreditCard extends Payment {

	int year;
	int month;
	int cardNum;

	public CreditCard(int amountToPay_ , int year_, int month_ , int cardNum_) {
		super(amountToPay_);
		year = year_;
		month = month_;
		cardNum = cardNum_;
	}
	public void showReport () {
		System.out.println("card "+cardNum+ " "+month+" "+ year+ " "+amountToPay);
}
}