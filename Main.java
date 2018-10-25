package Core;

import java.sql.*;

public class Main {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
			// here mydb is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from productstbl");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + 
			rs.getString(2) );
			String sql = "ALTER TABLE customers ADD age int(11);";
			stmt.executeUpdate(sql);
			
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		/*
		 * BankAccount mAccount= new BankAccount(0000000); mAccount.deposite(500);
		 * 
		 * try { mAccount.withdraw(600); } catch (YouHaveNoMoneyException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); // e.getExtra(); //
		 * System.out.println(e.getExtra()+ " no money"); }
		 */
		/*
		 * Buy mBuy=new Buy(500); CashPayment mCashPayment =new CashPayment(70); Check
		 * mCheck= new Check(150, 2018, 02, 00000); CreditCard mCreditCard= new
		 * CreditCard(100, 2018, 03, 00000000); Check mCheck2= new Check(50, 2018, 02,
		 * 001111); CashPayment mCashPayment2 =new CashPayment(130);
		 * 
		 * mBuy.pay(mCashPayment); mBuy.pay(mCheck); mBuy.pay(mCreditCard);
		 * mBuy.pay(mCheck2); mBuy.pay(mCashPayment2);
		 */

		// mBuy.showReport();
	}

}
