import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KisoKadai3 {

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
		}catch (IOException ex) {
			// ��O������
			ex.printStackTrace();
		}
		
		// File�I�u�W�F�N�g�𐶐�����
		File f = new File(a);
		File d = new File(f.getParent()); 

		if(d.mkdirs()){
			System.out.println("�t�H���_���Ȃ����ߐV�K�쐬���܂����B");
		} else {
			System.out.println("�t�H���_��������܂����B");	
		}

		if(f.exists()){ //�t�@�C�������݂��Ă��邩�`�F�b�N 
			System.out.println("���̃t�@�C�����J���܂�"); 		
		}else{ 
			try{ 
				f.createNewFile(); 
				System.out.println("�V�����t�@�C�����쐬���܂�"); 
			}catch(Exception e){ 
				System.out.println("Error"); 
				} 
		}
		
		while(b!=4){
			try{
				System.out.println("1�Ȃ�ǋL�������݁A2�Ȃ�㏑���������݁A3�Ȃ�ǂݍ��݁A4�Ȃ�I��");
				String h = br.readLine();
				b = Integer.parseInt(h);
			}catch(Exception e){
				
			}
			
			if(b==1){
				
				
				// �o�͐���쐬����
				try{
					FileWriter fw = new FileWriter(f,true);
					str = br.readLine();
					fw.write(str+"\r\n");
					fw.close();
				}catch(Exception e){
					
				}
				// �I�����b�Z�[�W����ʂɏo�͂���
				System.out.println("�o�͂��������܂����B");
			}else if(b==2){try{
				FileWriter fw = new FileWriter(f,false);
				str = br.readLine();
				fw.write(str+"\r\n");
				fw.close();
			  }catch(Exception e){
				}
			System.out.println("�o�͂��������܂����B");	
			}else if(b==3){	
				try{
		            FileReader p = new FileReader(a);
		            BufferedReader q = new BufferedReader(p);
		            String s;
		            while((s = q.readLine())!=null){
		                System.out.println(s);
		            }
		        }catch(Exception e){
		            System.out.println("�t�@�C���ǂݍ��ݎ��s");
		        }

				
			       }
			   else if(b==4){
			 System.out.println("�I�����܂�");
				break;
			}else{
				
			}
		}
	}
}