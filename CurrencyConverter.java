import java.util.*;
import java.util.Scanner;
import java.text.DecimalFormat;




        public class CurrencyConverter {
    public static void main(String[] args) {
        double inr, usd, pound, euro, yen, bit;
        DecimalFormat df = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
       
        System.out.println("1 : Rupees");
        System.out.println("2 : Dollar");
        System.out.println("3 : Pound");
        System.out.println("4 : Euro");
        System.out.println("5 : Yen");
        System.out.println("6 : Bitcoin");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Enter amount in INDIAN RUPEES:");
            inr = sc.nextDouble();
            usd = inr / 82;
            System.out.println("USD: " + df.format(usd));
            euro = inr / 92;
            System.out.println("EURO: " + df.format(euro));
            pound = inr / 107.45;
            System.out.println("POUND: " + df.format(pound));
            yen = inr / 1.69;
            System.out.println("YEN: " + df.format(yen));
            bit = inr*0.000000401;
            System.out.println("BIT COIN: " + df.format(bit));
        }
        else if(choice == 2){
            System.out.println("Enter amount in US DOLLAR:");
            usd = sc.nextDouble();
            inr = usd * 82;
            System.out.println("INR: " + df.format(inr));
            euro = usd * 1.12;
            System.out.println("EURO: " + df.format(euro));
            pound = usd * 1.31;
            System.out.println("POUND: " + df.format(pound));
            yen = usd * 0.0072;
            System.out.println("YEN: " + df.format(yen));
            bit = usd*0.000033;
            System.out.println("BIT COIN: " + df.format(bit));
        }
        else if(choice == 3){
            System.out.println("Enter amount in EURO:");
            euro = sc.nextDouble();
            inr = euro * 0.011;
            System.out.println("INR: " + df.format(inr));
            usd = euro * 0.83;
            System.out.println("USD: " + df.format(usd));
            pound = euro * 1.16;
            System.out.println("POUND: " + df.format(pound));
            yen = euro * 0.0064;
            System.out.println("YEN: " + df.format(yen));
            bit = euro*0.0000630;
            System.out.println("BIT COIN: " + df.format(bit));
        }
        else if(choice == 4){
            System.out.println("Enter amount in POUND:");
            pound = sc.nextDouble();
            inr = pound * 0.0093;
            System.out.println("INR: " + df.format(inr));
            euro = pound * 0.86;
            System.out.println("EURO: " + df.format(euro));
            usd = pound * 0.76;
            System.out.println("USD: " + df.format(usd));
            yen = pound * 0.0055;
            System.out.println("YEN: " + df.format(yen));
            bit = pound *0.000043;
            System.out.println("BIT COIN: " + df.format(bit));
        }
        else if(choice == 5){
            System.out.println("Enter amount in YEN:");
            yen = sc.nextDouble();
            inr = yen * 1.69;
            System.out.println("INR: " + df.format(inr));
            euro = yen * 156.01;
            System.out.println("EURO: " + df.format(euro));
            pound = yen * 181.58;
            System.out.println("POUND: " + df.format(pound));
            usd = yen * 138.70;
            System.out.println("USD: " + df.format(usd));
            bit = yen*0.0000000453;
            System.out.println("BIT COIN: " + df.format(bit));
        }
        else if(choice ==6){
            System.out.println("Enter Amount in BITCOIN");
            bit = sc.nextDouble();
            inr = bit*2555870.494073;
            System.out.println("INR: " + df.format(inr));
            euro = bit*26966.94;
            System.out.println("EURO: " + df.format(euro));
            pound = bit*23167.75;
            System.out.println("POUND: " + df.format(pound));
            usd =bit*30328.90;
            System.out.println("USD: " + df.format(usd));
            yen = bit*4206770.07;
            System.out.println("YEN: " + df.format(yen));
           

        }
        else{
            System.out.println("INVALID REQUEST");
        }

    }}
