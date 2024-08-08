/*
 * 2. Write a Java program that accepts two strings as input and finds the longest common subsequence using the StringBuffer class. The longest common subsequence is the longest sequence of characters that appears in the same order in both strings. For example, if the input 
 * strings are "ABCDGH" and "AEDFHR", the output should be "ADH".
 */

package stringBuffeerstring.buffer.com;

import java.util.Scanner;

public class FindSameCharInBothStingInStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string 1 : ");
		StringBuffer str= new StringBuffer(sc.nextLine());
		System.out.println("Enter given string 2 : ");
		StringBuffer str1= new StringBuffer(sc.nextLine());
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str1.length();j++) {
				if(str.charAt(i)==str1.charAt(j)) {
					sb.append(str.charAt(i));
					break;
				}
			}
		}
		System.out.println(sb);
	}

}
