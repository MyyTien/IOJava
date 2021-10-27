package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao ten cua ban");
		String line = sc.nextLine();
		System.out.println(line);
		
		System.out.println("nhap vao mot so nguyen");
		int i = sc.nextInt();		 
		System.out.println(i);
		
		long l = sc.nextLong();
		System.out.println(l);
		
		float f = sc.nextFloat();
		System.out.println(f);
		
		double d = sc.nextDouble();
		System.out.println(d);


	}
}
