package Core;

public class Check extends Payment{

    int year;
    int month;
    int checkNum;
	
	public Check(int amountToPay_ , int year_, int month_ ,int  checkNum_) {
		super(amountToPay_);
		year = year_;
		month = month_;
		checkNum = checkNum_;
	}
	public void showReport () {
		System.out.println("check "+checkNum+ " "+month+" "+ year+ " "+amountToPay);
}
}