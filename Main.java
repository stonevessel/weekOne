import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String city = "Columbus";
        System.out.println(city);
        int zipCode = 43223;
        System.out.println(zipCode);
        double dailyHighs[] = {32, 25, 27, 40, 45};
        double x = 0;
        for (int i=0; i <= dailyHighs.length; i++){
            if (i < dailyHighs.length) {
                x = dailyHighs[i] + x;
            }
            else{
                x = x/dailyHighs.length;
                System.out.println("This weeks average temp is");
                System.out.println(x);
            }
        }














    }
}