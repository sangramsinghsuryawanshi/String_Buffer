/*
 * char ch = 'X';		  
append(ch):

int i = 3;
charAt(i):

indexOf("Java"): Returns the index within this string of the first occurrence of thespecified substring  
lastindexOf("Java"):Returns the index within this string of the last occurrence of thespecified substring.
insert():
delete():
deleteCharAt():
reverse():
length():
setCharAt():
substring():
replace():
isEmpty():

equals():

compareTo():
 */

package stringBuffeerstring.buffer.com;

import java.util.Scanner;

public class ObjectCreationOfStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch='j';
		StringBuffer sbw1 = new StringBuffer("python");
		sbw1.setCharAt(1, ch);
		String str="java";
		StringBuffer sb = new StringBuffer(str);
		System.out.println("String literal call by StringBuffer: "+sb);
		
		System.out.println("Enter input for StringBuffer Object: ");
		StringBuffer sb1= new StringBuffer(sc.next());
		System.out.println("Calling input form StringBuffer Object: "+sb1);
		
		StringBuffer sb2= new StringBuffer("html");
		System.out.println("Calling sb2 StringBuffer Object: "+sb2);
		
//		sb.reverse();yhy7h
		System.out.println("Reversing the string literal from stringBuffer: "+sb);
		
//		System.out.println("Apeend the sb1 StringBuffreObject input: "+sb1.append("simple"));
//		System.out.println("indexOf the sb1 StringBuffreObject input: "+sb1.indexOf("s"));
//		System.out.println("Capcity of current the StringBuffreObject: "+sb1.capacity());
//		System.out.println("CharAt sb1 StringBuffreObject: "+sb1.charAt(0));
//		System.out.println("compare to sb1 StringBuffreObject input to sb2 StringBuffer object: "+sb1.compareTo(sb2));
		System.out.println(sb);
		System.out.println("lastIndexOf String literal from calling sb StringBuffreObject literl of string: "+sb.toString().lastIndexOf(str));
//		System.out.println("delete the sb1 StringBuffreObject input index: "+sb1.delete(1, 2));
//		System.out.println("insert the sb1 StringBuffreObject input index: "+sb1.insert(1, 's'));
//		System.out.println("isEmpty the sb1 StringBuffreObject input index: "+sb1.isEmpty());
//		System.out.println("replace  String literal from calling sb StringBuffreObject literl of string: "+sb1.replace(1, 2, str));
//		System.out.println("insert the sb1 StringBuffreObject input index: "+sb.replace(1, 2, str));
//		System.out.println("setCharAt: "+sbw1);
}

}
