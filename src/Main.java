public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public int[] countBits(int n) {
        int bits[] = new int[n+1];
        int bits_per_digit = 0;

        for (int i=0;i<=n;i++){
            int j = i;
            while (j != 0){
                int d = j % 2;
                bits_per_digit += d;
                j = j / 2;
            }
            bits[i] = bits_per_digit;
            bits_per_digit = 0;
        }

        return bits;
    }
}