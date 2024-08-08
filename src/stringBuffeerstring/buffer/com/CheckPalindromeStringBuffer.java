package stringBuffeerstring.buffer.com;

import java.util.Scanner;

public class CheckPalindromeStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		StringBuffer s= new StringBuffer(sc.next());
		StringBuffer sb = s;
		sb.reverse();
		if(sb.equals(sb)) {
			System.out.println("both are equal (using equals method)");
		}else {
			System.out.println("both are not equal (using equals method)");
		}
		if(sb.compareTo(s)==0) {
			System.out.println("Given String is palindrome");
		}else {
			System.out.println("Given strin is not palindrome");
		}
		
		System.out.println("Enter string: ");
		StringBuffer s1= new StringBuffer(sc.next());
		String str=s1.toString();
		
		System.out.println("Enter string: ");
		String str1=sc.next();
		for(int i=str.length()-1;i>=0;i--) {
			if(str.equals(str1)) {
				System.out.println("It is palindrome(StringBuffert TOString Conversion)");
				break;
			}else {
				System.out.println("It is not palindrome(StringBuffert TOString Conversion)");
			}
		}
	}

}
