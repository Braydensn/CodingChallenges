import java.util.InputMismatchException;
import java.util.Scanner;

public class MinuteConversion {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean shouldContinue = true;
        while(shouldContinue){
            System.out.print("Enter how many minutes to convert: ");
            try {
                int minutes = scan.nextInt();
                int seconds = minutesToSeconds(minutes);
                System.out.println("Seconds: " + seconds);
            }catch(InputMismatchException ex){
                System.out.println("Not a whole number, please try again");
                continue;
            }

            scan.nextLine();

            System.out.print("Convert another number? (Y/N): ");
            String response = scan.nextLine();
            if(response.toLowerCase().equals("n")){
                shouldContinue = false;
            }
        }

        scan.close();
    }

    public static int minutesToSeconds(int minutes){
        return minutes*60;
    }
}
