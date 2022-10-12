package exceptionProject;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//예외처리 : 코드상에서 개발자가 인지할 시 문제점을 해결하기위해 사용
		
//		try { 
//	         실행문장; // 예외를 발생시킬수 있는 구문
//		}catch(예외타입) {
//			예외처리 구문
//		}
//            for(int i=0;i < 100; i++) {
//            	try {
//            	int r = (int)(Math.random() * 10); // 0 ~ 9
//            	System.out.println(r);
//            	int result = 10 / r; // 정수를 0으로 나눌수 없다. 예외발생
//            	}catch(ArithmeticException e) {
//            		System.out.println("0으로 나누어서 예외를 강제로 처리했습니다.");
//            	}
            
//           int[] arr = new int[5];
//         try { 
//            int r = (int)(Math.random() * 10); // 0 ~ 9
//         	System.out.println(r);
//         	int result = 10 / r; // 정수를 0으로 나눌수 없다. 예외발생
//           arr[5] = 10;
//         
//	}catch(ArithmeticException e) { //Exception 만 사용해도됨 제일 상위의 예외문
//		System.out.println("index number 오류");
//	}catch(ArrayIndexOutOfBoundsException e) { //Exception 만 사용해도됨 제일 상위의 예외문
//		System.out.println("index number 오류");
//	}catch(Exception e) { //Exception 만 사용해도됨 제일 상위의 예외문
//		System.out.println("index number 오류");
//	}finally {// 예외발생 유무와 상관없이 실행하는 구문
//		System.out.println("예외발생 유무와 상관없이 실행");
//	}
//         arr[3] = 10;
//         System.out.println(arr[3]);
//		try {
//			throw new Exception("고의로 예외발생"); // throw는 그 뒤에 exception 문구를 가져다 쓴다.
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace(); //예외발생 당시의 호출스택(Call stack)에 있던 메소드의 정보와 예외결과를 화면에 출력함. / 예외상황을 분석하는 용도로 사용(개발자에게 디버깅을 할 수 있는 힌트를 제공)
//			
//		}
		add();
		
		//catch문 타입
		//throw에서 강제예외
		//throws에서 예외 선언
		
		try {
			sub();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	} // main() end
	
      static void add() {
    	  try {
    	  throw new Exception("add() 예외발생");
    	  }catch(Exception e ) {
    		  e.printStackTrace();
    	  }
      }   //add() end 코드가 길어질 것 같을 시 뒤에 표시를 해 놓으면 좋다!
      
	  static void sub() throws ArithmeticException{ // 예외선언하기 : 메세지 선언부에 thorws
		  
		  throw new ArithmeticException("sub() 예외발생");
		           
	  }
}






