package exceptionProject;

public class StringTest {

	public static void main(String[] args) {
//		String str1 = "abc";
//		String str2 = "def";
//		
//		str1 = str1 + str2;
//		
//		System.out.println(str1.hashCode()); // �ؽ��ڵ� = �����ڵ�
//		System.out.println(str2.hashCode());
//		
//		
//		String str3 = new String("abc"); //String�� �̷��� ���� ������� ����
//		String str4 = new String("abc");
//		
//		System.out.println(str3.hashCode());
//		System.out.println(str4.hashCode());
		String fileName = "Hello.java";
		
//		char c = fileName.charAt(0); //
//		System.out.println(c);
//		
//		for(int i=0;i<fileName.length();i++) {
//			System.out.println(fileName.charAt(i));
//		}
		String str = fileName.substring(0,5);
		System.out.println(str);
		String str2 = fileName.substring(6,10);
		System.out.println(str2);
		String str3 = fileName.substring(3);
		System.out.println(str3);
	}

}
