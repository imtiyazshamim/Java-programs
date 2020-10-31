import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
        boolean isOnRepeat=true;
        while(isOnRepeat){
            System.out.println("Playing Current Song");
            System.out.println("Will you like this song to be taken from Repeat? If So, answer Confirm");
            String userInput=input.next();
            if(userInput.equals("Confirm")){
                isOnRepeat=false;
            }
        }
        System.out.println("Playing Next Song");
    }
	}

