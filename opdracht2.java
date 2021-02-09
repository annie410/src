import java.util.Scanner;

class opdracht2 {
	public static void main(String args[]) { 
	Scanner sc = new Scanner (System.in);
	System.out.println("Kies een woord");
	String text = sc.nextLine();
	int numberE = 0;
	for (int position = 0; position < text.length(); position++){
        if (text.charAt(position) == 'e'){
            numberE = numberE + 1;
        }
    }
	System.out.println(numberE);
	
	}

}
