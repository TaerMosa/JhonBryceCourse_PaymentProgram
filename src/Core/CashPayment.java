package Core;


public class CashPayment extends Payment {

	public CashPayment(int amountToPay_)  {
		
		super(amountToPay_);
		
		// TODO Auto-generated constructor stub
	}
public void showReport () {
	System.out.println("cash"+this.amountToPay);
}
}
