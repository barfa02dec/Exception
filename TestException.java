package practice.exception;

import java.util.Scanner;

@SuppressWarnings("finally")
public class TestException {
	
	public static int m1() {
		try {
			System.out.println("In try");
			return 10;
		}finally {
			System.out.println("In finally");
		}
		//return 20; (CE:// cause no catch block if no exception in try return execute by try if exception occurs in try ,finally execute and program terminate abnormally)
		//System.out.println("Leads compiler error cause of unreachable code");
	}
	
	


	public static int m2() {
		try {
			System.out.println(1/0);
			return 10;
		}catch(ArithmeticException ae) {
			return 20;
		}finally {
			return 30;
		}
		
		
/*		try {
			System.out.println(1/0);
		}catch(NullPointerException npe) {
		
		}finally {
			System.out.println("In finally");
		}
		return 30;
*/
	}	
		
	
	
	public static void m3() {
		try {
			System.out.println(1/0);
		}catch(NullPointerException e) {
			
		}finally {
			return ;
		}
	}
	
	
	public static int m4() {
		try {
			System.out.println("In try");
			return 10;
		}catch(ArithmeticException ae) {
			System.out.println("In catch");
			return 40;
		}finally {
			if(true) {//generate error method must return value
				return 20;
			}
		}
		//System.out.println("after try finally");//CE
	}
	
	
	public static int m5() {
		int i = 5;
		while(i==5) {
			try {
				System.out.println("In try");
				return 10;
			}finally {
				continue;
			}
		}
		return 22;
	}

	
	public static int m6() {
		
		int i = 0;
		while(++i<=5) {
			System.out.println(i);
			try {
				System.out.println(i);
				return 10;
			}finally {
				System.out.println("In finally");
				break;
			}
		}
		System.out.println("After loop");
		return 20;

	}
	
	public static int m7() {
	
		int i = 0;
		while(++i<=5) {
			System.out.println(i);
			try {
				System.out.println(i);
				return 10;
			}finally {
				System.out.println("In finally");
				continue;
			}
		}
		System.out.println("After loop");
		return 20;
	}
	
	public static int m8() {
		
			int i = 0;
			while(++i<=5) {
				System.out.println(i);
				try {
					System.out.println(i);
					System.out.println(1/0);
					return 10;
				}finally {
					System.out.println("In finally");
					break;
				}
			}
			System.out.println("After loop");
			return 20;
	}
	
	
	
	
	public static int m9() {
		try {
			System.out.println("In outer try");
			try {
				System.out.println("Inner try");
			}catch (NullPointerException npe) {
				System.out.println("Inner catch");
			}finally {
				System.out.println("Inner finally");
				return 10;
			}
		}catch(NullPointerException npe) {
			System.out.println("In outer catch");
		}finally {
			System.out.println("In outer finally");
			return 20;
		}
		
	}
	
	
	public static int m10() {
		try{
			System.out.println("Outer try");
			try {
				System.out.println("In inner try");
				System.out.println(10/0);
			}catch(NullPointerException npe) {
				System.out.println("In inner catch");
			}finally {
				System.out.println("In inner finally");
				return 20;
			}
		}catch(NullPointerException npe) {
			System.out.println("In outer catch");
		}finally {
			System.out.println("In outer finally");
		}
		System.out.println("After all try/catch/finally");
		return 10;
	}
	
	public static int m11() {
		try {
			System.out.println("In outer try");
			try {
				System.out.println("In inner try");
				System.out.println(1/0);
			}catch(NullPointerException npe) {
				System.out.println("In inner catch");
			}finally {
				System.out.println("In inner finally");
				return 20;
			}
			//System.out.println("After inner try/catch/finally");
		}catch(ArithmeticException ae){
			System.out.println("In outer catch");
		}finally {
			System.out.println("In outer finally");
		}
		System.out.println("After outer try/catch/finally");
		return 30;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try {
			int a = 10;
			int b = 0;
			System.out.println(a/b);
			try {
				int c = 10;
				int d = 0;
				System.out.println("Inner");
			}catch (ArithmeticException e) {
				System.out.println("Inner catch");
			}
		}catch (ArithmeticException e) {
			System.out.println("Outer catch");
		}

		
		try {
			int a = 10;
			int b = 0;
			try {
				int c = 10;
				int d = 0;
				System.out.println(c/d);
			}catch (ArithmeticException e) {
				System.out.println("Inner catch");
			}
		}catch (ArithmeticException e) {
			System.out.println("Outer catch");
		}

		try {
			int a = 10;
			int b = 0;
			try {
				int c = 10;
				int d = 0;
				System.out.println(c/d);
			}catch (NumberFormatException e) {
				System.out.println("Inner catch");
			}
		}catch (ArithmeticException e) {
			System.out.println("Outer catch");
		}

		
		try {
			int a = 10;
			int b = 0;
			try {
				int c = 10;
				int d = 0;
				System.out.println(c/d);
			}catch (NumberFormatException e) {
				System.out.println("Inner catch");
			}
		}catch (NumberFormatException e) {
			System.out.println("Outer catch");
		}
		
		try {
			int a = 10;
			int b = 0;
			try {
				int c = 10;
				int d = 0;
				System.out.println(c/d);
			}catch (ArithmeticException e) {
				System.out.println("Inner catch");
				System.out.println(a/b);
				System.out.println("Inner catch");
			}
		}catch (ArithmeticException e) {
			System.out.println("Outer catch");
		}

		
		try {
			System.out.println("Outer try");
			int a = 10;
			int b = 0;
			try {
				System.out.println("Inner try");				
				int c = 10;
				int d = 0;
				System.out.println(c/d);
			}catch (ArithmeticException e) {
				System.out.println("Inner catch");
				System.out.println(a/b);
				System.out.println("Inner catch");
			}
			System.out.println("Outer catch");
		}catch (NumberFormatException e) {
			System.out.println("Outer catch");
		}

		int x;
		while(true) {
			try {
				String s = sc.next();
				x = Integer.parseInt(s);
				break;
			}catch(NumberFormatException nfe) {
				System.out.println("Invalid x value");
			}
		}
		
		while(true) {
			try {
				String s = sc.next();
				int y = Integer.parseInt(s);
				try {
					System.out.println(x/y);
				}catch(ArithmeticException ae) {
					System.out.println("Divide by zero");
					continue;
				}
				break;
			}catch(NumberFormatException e) {
				System.out.println("Invalid y value");
			}
		}

		

 		try {
			int a = 10;
			int b = 0;
			System.out.println(a/b);
			try {
				int c = 10;
				int d = 0;
				System.out.println(c/d);
			}catch (NumberFormatException nfe) {
				
			}
		}catch (NumberFormatException e) {
			System.out.println("Outer catch");
		}finally {
			System.out.println("Execute every time even through  exception is occurs or not and catched or not");
		}	

		try {
			System.out.println("In try");
		}catch (Exception e) {
			System.out.println("In catch");
		}finally {
			System.out.println("In finally");
		}
		System.out.println("End");

		
		for(int i=0;i<10;i++) {
			System.out.print(i);
			try {
				System.out.print("   In try");
				if(i==5) {
					break;
				}
			}finally {
				System.out.print("In finally");
			}
			System.out.println("After finally");
		}
		System.out.println("After loop");

		
		for(int i=0;i<10;i++) {
			System.out.print(i);
			try {
				System.out.print("   In try");
				if(i==5) {
					continue;
				}
			}finally {
				System.out.print("In finally");
			}
			System.out.println("After finally");
		}
		System.out.println("After loop");

	


 		try {
			System.out.println("In try");
			//return ;
		}finally {
			System.out.println("In finally");
		}

		
		try {
			System.out.println("In try");
			System.exit(0);
		}finally {
			System.out.println("In finally");
		}
		System.out.println("After finally");

		
		

		for(int i = 0; i <= 10; i++) {
			System.out.print(i+"      ");
			try {
				System.out.print("In try      ");
				if(i==5) {
					//break;
					//continue;
					return ;
				}
			}finally {
				System.out.print("In finally       ");
			}
			System.out.println("After try/finally");
		}
		System.out.println("After loop");
		
		
	
		try {
			System.out.println("In try");
			System.out.println(1/0);
		}catch(NullPointerException npe) {
			System.out.println("In catch");
		}finally {
			System.out.println("In finally");
			int arr[] = new int[-2];//replace try Exception by finally exception
			sc.close();
		}
		
		
		
		
		System.out.println(m1());
		System.out.println(m2());
		m3();
		System.out.println(m5());
		System.out.println(m6());
		System.out.println(m7());
		System.out.println(m8());
		System.out.println(m9());
		System.out.println(m10());
		System.out.println(m11());
	}
	
	
	
}
