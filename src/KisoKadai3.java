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
			System.out.println("フォルダの場所を入力してください");
			System.out.println("入力例　c:\\users\\internous\\abc");
			a = br.readLine();
		}catch (IOException ex) {
			// 例外時処理
			ex.printStackTrace();
		}
		
		// Fileオブジェクトを生成する
		File f = new File(a);
		File d = new File(f.getParent()); 

		if(d.mkdirs()){
			System.out.println("フォルダがないため新規作成しました。");
		} else {
			System.out.println("フォルダが見つかりました。");	
		}

		if(f.exists()){ //ファイルが存在しているかチェック 
			System.out.println("中のファイルを開きます"); 		
		}else{ 
			try{ 
				f.createNewFile(); 
				System.out.println("新しくファイルを作成します"); 
			}catch(Exception e){ 
				System.out.println("Error"); 
				} 
		}
		
		while(b!=4){
			try{
				System.out.println("1なら追記書き込み、2なら上書き書き込み、3なら読み込み、4なら終了");
				String h = br.readLine();
				b = Integer.parseInt(h);
			}catch(Exception e){
				
			}
			
			if(b==1){
				
				
				// 出力先を作成する
				try{
					FileWriter fw = new FileWriter(f,true);
					str = br.readLine();
					fw.write(str+"\r\n");
					fw.close();
				}catch(Exception e){
					
				}
				// 終了メッセージを画面に出力する
				System.out.println("出力が完了しました。");
			}else if(b==2){try{
				FileWriter fw = new FileWriter(f,false);
				str = br.readLine();
				fw.write(str+"\r\n");
				fw.close();
			  }catch(Exception e){
				}
			System.out.println("出力が完了しました。");	
			}else if(b==3){	
				try{
		            FileReader p = new FileReader(a);
		            BufferedReader q = new BufferedReader(p);
		            String s;
		            while((s = q.readLine())!=null){
		                System.out.println(s);
		            }
		        }catch(Exception e){
		            System.out.println("ファイル読み込み失敗");
		        }

				
			       }
			   else if(b==4){
			 System.out.println("終了します");
				break;
			}else{
				
			}
		}
	}
}