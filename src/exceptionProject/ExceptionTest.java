package exceptionProject;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����ó�� : �ڵ�󿡼� �����ڰ� ������ �� �������� �ذ��ϱ����� ���
		
//		try { 
//	         ���๮��; // ���ܸ� �߻���ų�� �ִ� ����
//		}catch(����Ÿ��) {
//			����ó�� ����
//		}
//            for(int i=0;i < 100; i++) {
//            	try {
//            	int r = (int)(Math.random() * 10); // 0 ~ 9
//            	System.out.println(r);
//            	int result = 10 / r; // ������ 0���� ������ ����. ���ܹ߻�
//            	}catch(ArithmeticException e) {
//            		System.out.println("0���� ����� ���ܸ� ������ ó���߽��ϴ�.");
//            	}
            
//           int[] arr = new int[5];
//         try { 
//            int r = (int)(Math.random() * 10); // 0 ~ 9
//         	System.out.println(r);
//         	int result = 10 / r; // ������ 0���� ������ ����. ���ܹ߻�
//           arr[5] = 10;
//         
//	}catch(ArithmeticException e) { //Exception �� ����ص��� ���� ������ ���ܹ�
//		System.out.println("index number ����");
//	}catch(ArrayIndexOutOfBoundsException e) { //Exception �� ����ص��� ���� ������ ���ܹ�
//		System.out.println("index number ����");
//	}catch(Exception e) { //Exception �� ����ص��� ���� ������ ���ܹ�
//		System.out.println("index number ����");
//	}finally {// ���ܹ߻� ������ ������� �����ϴ� ����
//		System.out.println("���ܹ߻� ������ ������� ����");
//	}
//         arr[3] = 10;
//         System.out.println(arr[3]);
//		try {
//			throw new Exception("���Ƿ� ���ܹ߻�"); // throw�� �� �ڿ� exception ������ ������ ����.
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace(); //���ܹ߻� ����� ȣ�⽺��(Call stack)�� �ִ� �޼ҵ��� ������ ���ܰ���� ȭ�鿡 �����. / ���ܻ�Ȳ�� �м��ϴ� �뵵�� ���(�����ڿ��� ������� �� �� �ִ� ��Ʈ�� ����)
//			
//		}
		add();
		
		//catch�� Ÿ��
		//throw���� ��������
		//throws���� ���� ����
		
		try {
			sub();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	} // main() end
	
      static void add() {
    	  try {
    	  throw new Exception("add() ���ܹ߻�");
    	  }catch(Exception e ) {
    		  e.printStackTrace();
    	  }
      }   //add() end �ڵ尡 ����� �� ���� �� �ڿ� ǥ�ø� �� ������ ����!
      
	  static void sub() throws ArithmeticException{ // ���ܼ����ϱ� : �޼��� ����ο� thorws
		  
		  throw new ArithmeticException("sub() ���ܹ߻�");
		           
	  }
}






