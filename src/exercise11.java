import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        double amount_from=0;
	    System.out.println("How many euros are you exchanging?");
        amount_from= kb.nextDouble();
        double rate_from=0;
        System.out.println("What is the exchange rate?");
        rate_from= kb.nextDouble();
        int rate_to= 100;
        double amount_to= (amount_from * rate_from) / rate_to;
        System.out.println(amount_from+" euros at an exchange rate of "+rate_from+" is"+"\n"+amount_to+" U.S. dollars.");

    }
}
