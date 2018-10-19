package Core;

public class Main {

	public static void main(String[] args) {
		
		BankAccount mAccount= new BankAccount(0000000);
		mAccount.deposite(500);
		
		try {
			mAccount.withdraw(600);
		} catch (YouHaveNoMoneyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			e.getExtra();
//			System.out.println(e.getExtra()+ " no money");
		}
		/*
		Buy mBuy=new Buy(500);
		CashPayment mCashPayment =new CashPayment(70);
		Check mCheck= new Check(150, 2018, 02, 00000);
		CreditCard mCreditCard= new CreditCard(100, 2018, 03, 00000000);
		Check mCheck2= new Check(50, 2018, 02, 001111);
		CashPayment mCashPayment2 =new CashPayment(130);
		
		mBuy.pay(mCashPayment);
		mBuy.pay(mCheck);
		mBuy.pay(mCreditCard);
		mBuy.pay(mCheck2);
		mBuy.pay(mCashPayment2);*/
		
		//mBuy.showReport();
	}
	

}
