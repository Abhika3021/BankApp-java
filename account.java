package bankapp;

public class account {
	private String name;
	 private int total_amount;
	 
	 public account(String name,int total_amount){
		 this.name=name;
		 this.total_amount=total_amount;
		 
	 }
	 public void showBalance(){
		 System.out.println("+--------------------------------------------------------------------+");
		 System.out.println("Dear" +name+" ,your balance is:"+total_amount);
		 System.out.println("+-----------------------------------------------------------+");
	 }
	 public void depositMoney(int amount) {
		 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 System.out.println("Dear"+name+",amount"+amount+"credited to your account");
		 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 total_amount+=amount;
	 }
	 public void withDrawMoney(int amount) {
		 if(amount>total_amount) {
			 
		 
		 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 System.out.println("sorry"+name+"you don't have sufficient balance");
		 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 return;
		 }
		 total_amount-=amount;
		 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 System.out.println("dear"+name+",amount "+amount+"debited from your account");
		 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 
		 
	 }
	 public void withDrawMoney1(int amount) {
		 if(amount+2000>total_amount) {
			 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			 System.out.println("dear"+name+"amount"+amount+"you don't have insufficient balance");
			 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			 return;
		 }
		 total_amount-=amount;
		 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 System.out.println("dear"+name+"amount"+amount+"debited from your account");
		 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	 }
}
