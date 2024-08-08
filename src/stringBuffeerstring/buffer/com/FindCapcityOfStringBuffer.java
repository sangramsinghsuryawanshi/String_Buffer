package stringBuffeerstring.buffer.com;

public class FindCapcityOfStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.capacity());
		StringBuffer sb1 = new StringBuffer();
		
		System.out.println(sb1.capacity());
		StringBuffer sb2 = new StringBuffer("java");
		sb2.ensureCapacity(17);
		System.out.println(sb2.capacity());
	}

}
