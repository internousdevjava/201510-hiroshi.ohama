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
			System.out.println("フォルダの場所を入力してください");
			System.out.println("入力例　c:\\users\\internous\\abc");
          a = br.readLine();
			   // Fileオブジェクトを生成する
				File f = new File("a");
				
				
				if(f.mkdirs()){
					System.out.println("フォルダがないため新規作成しました。");
				} else {
					System.out.println("フォルダが見つかりました。");
					}
			
				
					 	
					 		
				// 出力先を作成する
				FileWriter fw = new FileWriter("C:\\Users\\internous\\abc\\test2.txt",true);
				try{
				 str = br.readLine();
				}catch(Exception e){}
				System.out.print("文字を入力してください。最後にｘｙｚと入力すると終了します。");
				
				while(!(str=="xyz")){
				fw.write(str+"\r\n");
				}
			
				fw.close();

				// 終了メッセージを画面に出力する
				System.out.println("出力が完了しました。");
			
		} catch (IOException ex) {
			// 例外時処理
			ex.printStackTrace();
		}
		/*try {
			System.out.println("終了しますか");
			System.out.println("はいの場合は１、いいえの場合は２を入力してください。");
			String buf = br.readLine();
            b = Integer.parseInt(buf);
			
				if(b==1){
					System.out.println("終了しました。");
				} else {
					System.out.println("継続します。文字を入力してください。");	
				}	
				
				FileWriter fw = new FileWriter("C:\\Users\\internous\\abc\\test.txt",true);
				try{
				 str = br.readLine();
				}catch(Exception e){}
				
				fw.write(str+"\r\n");
				
				fw.close();	
				// 終了メッセージを画面に出力する
				System.out.println("出力が完了しました。");
				
		}catch(Exception e){
            b = 0;
    }		*/
	}
}