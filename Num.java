import java.util.*;
class Num{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter number:");
		n=sc.nextInt();
		System.out.println("factors of "+n+" are: ");
		for(int i=1;i<=n;i++){
			if(n%i==0){
				System.out.println(i);
			}
		}
	}
}
