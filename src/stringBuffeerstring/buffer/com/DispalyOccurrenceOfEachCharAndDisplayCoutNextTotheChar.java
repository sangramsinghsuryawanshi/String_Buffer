/*\
 * 3. Write a Java program that accepts a string as input and counts the number of 
 * occurrences of each character using the StringBuffer class. The output should 
 * display each character along with its count
 */

package stringBuffeerstring.buffer.com;

import java.util.Scanner;

public class DispalyOccurrenceOfEachCharAndDisplayCoutNextTotheChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string 1 : ");
		String s=sc.nextLine();
		StringBuffer str= new StringBuffer();
		char ch[]=s.toCharArray();
		char st='\0';
		for(int i=0;i<ch.length;i++) {
			int cnt=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					cnt++;
					ch[j]='\0';
					
				}
			}
			if(ch[i]!='\0') {
				str.append(ch[i]);
				str.append(cnt);
			}
		}
		System.out.println(str+" ");
	}

}
