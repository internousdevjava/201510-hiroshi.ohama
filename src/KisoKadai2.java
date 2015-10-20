import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class KisoKadai2 {
public static void main(String args[]) throws IOException {
	int answer =  (int) (Math.random() * 100) + 1;
	int a=0;

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.println("”“–‚ÄƒQ[ƒ€");
    System.out.println("‚P`‚P‚O‚O‚Ì”Žš‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
   while(a!=answer){
    try{
        String str = br.readLine();
        a= Integer.parseInt(str);
        if(a>answer){
        	System.out.println("‚à‚Á‚Æ‰º‚¾‚æ");
        }else if(a<answer){
        	System.out.println("‚à‚Á‚Æã‚¾‚æ");     
        }else if(a==answer){
        	System.out.println("³‰ð‚¾‚æ");
        }
    }
    catch(NumberFormatException e){
    	System.err.println("ƒGƒ‰[ ”Žš‚ð“ü—Í‚µ‚Ä‚Ë");
    }
   }
     }     
}