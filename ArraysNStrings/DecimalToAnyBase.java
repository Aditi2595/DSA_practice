import java.util.*;

public class DecimalToAnyBase {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int base = scn.nextInt();
        int ans = getDecimalToBase(num, base);
        System.out.println(ans);
    }

    public static int getDecimalToBase(int num, int b){
        int ans = 0, power = 1;
        while(num > 0){
            int r = num % b;
            ans = ans + r*power;
            power *= 10;
            num = num / b;
        }
        return ans;
    }
}