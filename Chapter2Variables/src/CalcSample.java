import java.util.Scanner;

public class CalcSample {
    static Scanner myScanner;                   //input device

    public static void main(String[]args)
    {
        /*
        prompt the user for their name, hours worked, rate of pay
        calc net pay
        display
         */
        String iStName;                         //employee name
        Integer iIntHrs;                        //hours worked
        Double iDbRate;                         //pay rate
        Double cDbNetPay;                       //calculated pay
        String oStHours, oStRate, oStNetPay;    //output variables

        myScanner = new Scanner(System.in);

        //prompt for iStName
        System.out.println("Enter name: ");
        iStName = myScanner.nextLine();
        //prompt for iIntHrs
        System.out.println("Enter hours: ");
        iIntHrs = myScanner.nextInt();
        //prompt for iDbRate
        System.out.println("Enter rate: ");
        iDbRate = myScanner.nextDouble();
        //calculate cDbNetPay (iIntHrs*iDbRate)
        cDbNetPay = iIntHrs*iDbRate;
        //format hours, rate and net pay

        //display name, hours, rate, net pay
        System.out.println("Wage information for " + iStName + ":");
        System.out.println("Hours: " + iIntHrs);
        System.out.println("Rate: " + iIntHrs);
        System.out.println("Net pay: " + cDbNetPay);
    }
}
