public class AdditionOfPowerAndFactorial{
	public static void main(String args[]){
		long power,factorial;
		float sum=0;
		for(int n=1;n<=10;n++){
			power=1;
			for(int i=1;i<=n;i++){
				power*=n;
			}
				System.out.println("Power of  "+n+" to the power "+n+" is =  "+power);
			factorial=1;
			for(int j=1;j<=n;j++){
				factorial*=j;
			}
				System.out.println("Factorial of  "+n+" is = "+factorial);
		sum+=(power/factorial);
			System.out.println("sum is = "+sum);
		}
			System.out.println("sum is = "+sum);
	}
}