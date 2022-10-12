package exceptionProject;

import java.util.Scanner;

public class LoginTest extends Exception{

	public static void main(String[] args) {
		String id;
		int password;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id 입력 : ");
		id = sc.next();
		System.out.print("password 입력 : ");
		password = sc.nextInt();
		
		if(!id.equals("tis")) { //문자열(String) 비교 시  equals() //==, != 주소값 
            //예외처리
			try {
		throw new LoginIdException("아이디가 불일치 합니다");
			}catch(LoginIdException e) {
				System.out.println(e.getMessage());
			}
		}
	
		if(password != 1234) {
			//예외처리
			try {
				throw new LoginPwException("비밀번호가 불일치 합니다");
					}catch(LoginPwException e) {
					 System.out.println(e.getMessage()); // *.getMessage() 
					}
     	}
		
		if(id.equals("tis") && password == 1234) {
			System.out.println("로그인 성공");
		}
	}
 
}
