package exceptionProject;

import java.util.Scanner;

public class LoginTest extends Exception{

	public static void main(String[] args) {
		String id;
		int password;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id �Է� : ");
		id = sc.next();
		System.out.print("password �Է� : ");
		password = sc.nextInt();
		
		if(!id.equals("tis")) { //���ڿ�(String) �� ��  equals() //==, != �ּҰ� 
            //����ó��
			try {
		throw new LoginIdException("���̵� ����ġ �մϴ�");
			}catch(LoginIdException e) {
				System.out.println(e.getMessage());
			}
		}
	
		if(password != 1234) {
			//����ó��
			try {
				throw new LoginPwException("��й�ȣ�� ����ġ �մϴ�");
					}catch(LoginPwException e) {
					 System.out.println(e.getMessage()); // *.getMessage() 
					}
     	}
		
		if(id.equals("tis") && password == 1234) {
			System.out.println("�α��� ����");
		}
	}
 
}
