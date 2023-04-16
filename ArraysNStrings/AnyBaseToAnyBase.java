import java.util.*;

public class AnyBaseToAnyBase {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int base1 = scn.nextInt();
        int base2 = scn.nextInt();
        int ans = getBaseToDecimal(num, base1);
        int res = getDecimalToBase(ans, base2);
        System.out.println(res);
    }

    public static int getBaseToDecimal(int n, int b){
        int ans = 0, power = 1;
        while(n > 0){
            int r = n%10;
            ans = ans + (r*power);
            power = power*b;
            n = n/10;
        }
        return ans;
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