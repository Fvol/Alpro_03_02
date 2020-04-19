package ssa1;
import java.util.Scanner;

public class soalsatuainputan{
	public static void main (String [] args){
	Scanner i = new Scanner (System.in);
	System.out.print("Input bilangan pertama: ");
	int x = i.nextInt();
	int max=x;
	for(int z=2;z<=2;z++){
		System.out.print("Input bilangan kedua: ");
		int y = i.nextInt();
			if(y>max){
				max=y;
			}

	}
	System.out.println("Angka maksimum kedua buah value dari variable di atas adalah "+max);
	}
}