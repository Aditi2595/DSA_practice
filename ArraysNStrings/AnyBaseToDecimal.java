import java.util.*;

public class AnyBaseToDecimal {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int base = scn.nextInt();
        int ans = getBaseToDecimal(num, base);
        System.out.println(ans);
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
}