import java.util.Scanner;
class Sum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int res=0;
		System.out.println("Enter the first number:");
		int n1=sc.nextInt();
		System.out.println("Enter the second number:");
		int n2=sc.nextInt();
		res=n1+n2;
		System.out.println("The sum of two numbers :"+res);
		return;
	}
}

