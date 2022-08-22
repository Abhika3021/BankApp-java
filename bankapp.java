package bankapp;
import java.util.Scanner;
public class bankapp {

	public static void main(String[] args) {
	account obj=new account("Rohit",5000);
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("-----------------");
		System.out.println("1:Show balance");
		System.out.println("2:Deposit money");
		System.out.println("3:Withdraw money");
		System.out.println("4:Withdraw Sufficient money");
		System.out.println("5:quit");
		System.out.println("-----------------");
		System.out.print("Enter your choice:");
		int ch=sc.nextInt();
		if(ch==1)//code to show balance
		{
			obj.showBalance();
		}
		else if(ch==2) {
			System.out.print("Enter the amount:");
			int amount=sc.nextInt();
			obj.depositMoney(amount);
			
		}
		else if(ch==3) {
			System.out.println("Enter the amount");
			int amount=sc.nextInt();
			obj.withDrawMoney(amount);
		}
		else if(ch==4) {
			System.out.println("Enter the amount");
			int amount=sc.nextInt();
			obj.withDrawMoney1(amount);
		}
		else if(ch==5){
			System.out.println("Thanks for visiting the app");
			break;
		}
		else {
			System.out.println("Invalid choice Please enter correct choice");
			
		}
	}

	}
}
