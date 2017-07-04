import java.util.Scanner;


public class hun55 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of elements:");
		int n=s.nextInt();
		System.out.print("The array elements:");
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println("Enter d:");
		int d=s.nextInt();
		for(int j=d;j<a.length;j++){
			System.out.println(a[j]);
		}
			for(int k=0;k<d;k++){
			System.out.println(a[k]);
		}
	}
	}

