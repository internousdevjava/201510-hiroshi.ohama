import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class KisoKadai2 {
public static void main(String args[]) throws IOException {
	int answer =  (int) (Math.random() * 100) + 1;
	int a=0;

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.println("�����ăQ�[��");
    System.out.println("�P�`�P�O�O�̐�������͂��Ă�������");
   while(a!=answer){
    try{
        String str = br.readLine();
        a= Integer.parseInt(str);
        if(a>answer){
        	System.out.println("�����Ɖ�����");
        }else if(a<answer){
        	System.out.println("�����Əゾ��");     
        }else if(a==answer){
        	System.out.println("��������");
        }
    }
    catch(NumberFormatException e){
    	System.err.println("�G���[ ��������͂��Ă�");
    }
   }
     }     
}