package prim;
import java.util.Scanner;

public class nosatudprima{
	public static void main (String[]args){
	Scanner i = new Scanner (System.in);
	System.out.print("Inputkan bilangan: ");
	int x = i.nextInt();

	if (x<=1){
		System.out.println(x+" bukan bilangan prima.");
	}
	else if (x==2 || x==3 || x==5 || x==7){
		System.out.println(x+" adalah bilangan prima.");
	}
	else if (x%2==0 || x%3==0 || x%5==0 || x%7==0){
		System.out.println(x+" bukan bilangan prima.");
	}
	else{
		System.out.println(x+" adalah bilangan prima.");
	}
}
}