package Core;


public class BankAccount {
	int accountNum;
	double balance;

	public BankAccount(int accountNum_) {
		accountNum = accountNum_;

	}

	public void deposite(double amountToDeposite) {
		balance = balance + amountToDeposite;

	}

	public void withdraw(double amountToWithdraw) throws YouHaveNoMoneyException {
		if (amountToWithdraw <= balance) {
			balance -= amountToWithdraw;
		} else {
			double extra = amountToWithdraw - balance;
			throw new YouHaveNoMoneyException(extra);
		}
	}
}
