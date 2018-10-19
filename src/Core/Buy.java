package Core;
import java.util.ArrayList;


public class Buy {
ArrayList<Payment> arrPayments ;
int totalCost;

public Buy (int totalCost) {
	
	this.totalCost=totalCost;
	//arrPayments = new ArrayList<Payment>();
	
}

public int pay (Payment payment)  {
	
	totalCost -= payment.amountToPay;
	arrPayments.add(payment);
	return totalCost; 
}

public void showReport () {
	for(int i=0;i<this.arrPayments.size();i++) {
		this.arrPayments.get(i).showReport();
		
	}
}


}
