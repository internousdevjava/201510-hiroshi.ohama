import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class KisoKadai2 {
public static void main(String args[]) throws IOException {
	int answer =  (int) (Math.random() * 100) + 1;
	int a=0;

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.println("数当てゲーム");
    System.out.println("１～１００の数字を入力してください");
   while(a!=answer){
    try{
        String str = br.readLine();
        a= Integer.parseInt(str);
        if(a>answer){
        	System.out.println("もっと下だよ");
        }else if(a<answer){
        	System.out.println("もっと上だよ");     
        }else if(a==answer){
        	System.out.println("正解だよ");
        }
    }
    catch(NumberFormatException e){
    	System.err.println("エラー　数字を入力してね");
    }
   }
     }     
}