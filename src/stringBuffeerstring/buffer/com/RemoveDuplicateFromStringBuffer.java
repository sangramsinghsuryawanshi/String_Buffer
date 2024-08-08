
/*\
 * 1.Write a Java program that accepts a string as input and removes all duplicate characters using the StringBuffer class. For example, if the input string is "aabbccdd", the output should be "abcd".

 */
package stringBuffeerstring.buffer.com;

import java.util.Scanner;

public class RemoveDuplicateFromStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str=sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		for(int i=0;i<sb.length();i++) {
			for(int j=i+1;j<sb.length();j++) {
				if(sb.charAt(i)==sb.charAt(j)){
					System.out.println(sb.charAt(i));
				}
			}
		}
	}

}
