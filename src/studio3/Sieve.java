package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		int N = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter prime number ceiling: ");
		N = scanner.nextInt();
		scanner.close();
		
		boolean[] isPrime = new boolean[N];
		isPrime[0] = false;
		for(int i = 1; i < N; i++) {
			isPrime[i]= true;
		}
		for(int j = 2; j< N; j++) {
			if( isPrime[j-1]) {
				System.out.print(j + ", ");
				for(int c = j*2;c<N; c+=j ) {
					isPrime[c-1]= false;
				}
			}
		}
		
		
		
		

	}

}
