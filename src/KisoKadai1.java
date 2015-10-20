import java.io.BufferedReader;
import java.io.InputStreamReader;
public class KisoKadai1 {

	public static void main(String args[]) {
		System.out.println("•S•S‚Ì•\");
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
		
		int x;
		System.out.print("x”Žš‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢: ");
        try{
                String buf = br.readLine();
                x = Integer.parseInt(buf);
        }catch(Exception e){
                x = 0;
        }
        
        int y;
		System.out.print("y”Žš‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢: ");
        try{
                String buf = br.readLine();
                y = Integer.parseInt(buf);
        }catch(Exception e){
                y = 0;
        }
        
		
        for (int i = y; i >= 1; i--) {
			for (int j = 1; j <= x; j++) {
        
				if (j * i <= 9) {
					System.out.print("    ");
				} else if (j * i <= 99) {
					System.out.print("   ");
				} else if (j * i <= 999) {
					System.out.print("  ");
				} else if (j * i <= 999) {
					System.out.print(" ");
				} else if (j * i <= 9999) {
					System.out.print(" ");

				}
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}
}
