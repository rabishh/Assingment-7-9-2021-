package Assingment;
import java.util.*;
public class Lcm {
public static void main(String args[]) {
	int Lcm;
	int h=0;
	Scanner sc=new Scanner(System.in) ;
		System.out.println("ENTER YOUR FIRST NUMBER :");
		int a=sc.nextInt();
		System.out.println("ENTER YOUR SECOND NUMBER :");
		int b=sc.nextInt();
		for(int i=1;i<=a||i<=b;i++) {
			if(a%i==0 && b%i==0) {
				h=i;
			}
		}
		Lcm=(a*b)/h;
		System.out.println("THE LCM OF TWO NUMBER IS :"+Lcm);
		
}
}
