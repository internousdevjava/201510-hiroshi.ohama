import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

	public static void main(String args[]) {

		InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
		String str="";
		String a="";
		int b=0;
		try {
			System.out.println("�t�H���_�̏ꏊ����͂��Ă�������");
			System.out.println("���͗�@c:\\users\\internous\\abc");
          a = br.readLine();
			   // File�I�u�W�F�N�g�𐶐�����
				File f = new File("a");
				
				
				if(f.mkdirs()){
					System.out.println("�t�H���_���Ȃ����ߐV�K�쐬���܂����B");
				} else {
					System.out.println("�t�H���_��������܂����B");
					}
			
				
					 	
					 		
				// �o�͐���쐬����
				FileWriter fw = new FileWriter("C:\\Users\\internous\\abc\\test2.txt",true);
				try{
				 str = br.readLine();
				}catch(Exception e){}
				System.out.print("��������͂��Ă��������B�Ō�ɂ������Ɠ��͂���ƏI�����܂��B");
				
				while(!(str=="xyz")){
				fw.write(str+"\r\n");
				}
			
				fw.close();

				// �I�����b�Z�[�W����ʂɏo�͂���
				System.out.println("�o�͂��������܂����B");
			
		} catch (IOException ex) {
			// ��O������
			ex.printStackTrace();
		}
		/*try {
			System.out.println("�I�����܂���");
			System.out.println("�͂��̏ꍇ�͂P�A�������̏ꍇ�͂Q����͂��Ă��������B");
			String buf = br.readLine();
            b = Integer.parseInt(buf);
			
				if(b==1){
					System.out.println("�I�����܂����B");
				} else {
					System.out.println("�p�����܂��B��������͂��Ă��������B");	
				}	
				
				FileWriter fw = new FileWriter("C:\\Users\\internous\\abc\\test.txt",true);
				try{
				 str = br.readLine();
				}catch(Exception e){}
				
				fw.write(str+"\r\n");
				
				fw.close();	
				// �I�����b�Z�[�W����ʂɏo�͂���
				System.out.println("�o�͂��������܂����B");
				
		}catch(Exception e){
            b = 0;
    }		*/
	}
}