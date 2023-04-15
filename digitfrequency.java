import java.util.*;

public class digitfrequency {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int d = scn.nextInt();
        int ans = getDigitFrequency(num, d);
        System.out.println(ans);
    }

    public static int getDigitFrequency(int num, int d){
        int count = 0;
        while(num > 0){
            int r = num%10;
            if(r == d){
                count++;
            }
            num = num/10;
        }
        return count;
    }
}


