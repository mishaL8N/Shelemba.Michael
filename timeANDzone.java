

import java.util.Scanner;

public class timeANDzone {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.print("enter your time: ");
        String timezone = in.nextLine();
        System.out.print("enter looking time zone: ");

        int zone = in.nextInt();
        int time = Integer.parseInt(timezone.substring(0,2));

        time += zone;
            if (time > 24)
                time %= 24;
            if (time < 0)
                time *= -1;

            System.out.println("time in looking time zone - "+time+timezone.substring(2));
    }
}