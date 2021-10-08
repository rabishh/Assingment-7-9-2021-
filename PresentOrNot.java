package Assingment;

public class PresentOrNot {
	public static void main(String args[]) {
		int a[]= {2,3,5,6,8};
		int n=8;
		int flag=0;
		int i;
		for(i=0;i<a.length;i++) {
			if(a[i]==n) {
					System.out.println("the number is present at index:=>"+i);
					break;
			}
		}
		
	}

}
