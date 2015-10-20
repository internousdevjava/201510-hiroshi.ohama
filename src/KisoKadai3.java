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
		//InputStreamReaderを使ってごっそり情報を取ってくる。
		BufferedReader br = new BufferedReader(isr);
		//BufferedReaderを使ってもう少し情報を絞る。
		String str="";//情報を記録・保管するための場所を作る。
		String a="";
		int b=0;
		try {
			System.out.println("フォルダの場所を入力してください");
			System.out.println("入力例　c:\\users\\internous\\abc");
			a = br.readLine();//String a という場所に書かれたものを読み込んでください。
		}catch (IOException ex) {
			//tryのときはcatchでエラーのときの処理を作らないといけない。
			ex.printStackTrace();
		}
		
		
		File f = new File(a);//ファイルがあるか調べる。
		File d = new File(f.getParent()); //ディレクトリがあるか調べる。

		if(d.mkdirs()){
			System.out.println("フォルダがないため新規作成しました");
		} else {
			System.out.println("フォルダが見つかりました");	
		}

		if(f.exists()){ 
			System.out.println("中のファイルを開きました"); 		
		}else{ 
			try{ 
				f.createNewFile(); //ファイルを作るための関数
				System.out.println("新しくファイルを作成します"); 
			}catch(Exception e){ 
				System.out.println("Error"); 
				} 
		}
		
		while(b!=4){
			try{
				System.out.println("１なら追記、２なら上書き、３なら読み込み、４なら終了");
				String h = br.readLine();// ｈを読み込みたいけど、stringは読み込めないからからint型にしてる。
				b = Integer.parseInt(h);
			}catch(Exception e){
				
			}
			
			if(b==1){
				
				
				
				try{
					FileWriter fw = new FileWriter(f,true);
					str = br.readLine();//strの中に記録されている情報を読み込んでください。
					fw.write(str+"\r\n");//文字を入力できるようにした。
					fw.close();//ファイルを保存して終了
				}catch(Exception e){
					
				}
				
				System.out.println("出力が完了しました");
			}else if(b==2){try{
				FileWriter fw = new FileWriter(f,false);
				str = br.readLine();
				fw.write(str+"\r\n");
				fw.close();
			  }catch(Exception e){
				}
			System.out.println("出力が完了しました");	
			}else if(b==3){	
				try{
		            FileReader p = new FileReader(a);//読み込むためにFileReaderというものを使わないといけないらしい。
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