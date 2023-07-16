public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public int[] countBits(int n) {
        int bits[] = new int[n+1]; // array of length n+1 to include 0
        int bits_per_digit = 0; // bit counter

        for (int i=0;i<=n;i++){ // loops through numbers 0-n-1
            int j = i;// temp variable for i
            while (j != 0){  // this is where bits are counted. suppose j = 5
                int d = j % 2;  // 5 % 2 = 1
                bits_per_digit += d; // bpd = 1
                j = j / 2; // 5/2 = 2 --> loop: 2%2 = 0, nothing added, 2/2 = 1. final loop, 1%2 = 1, bpd = 2, 1/2 = 0
            }
            // criteria met to exit while loop
            bits[i] = bits_per_digit; // bits[5] == 2. binary for 5 = 101, so 2 1's is accurate
            bits_per_digit = 0; // reassign value back to zero
            // supposing n = 5, we have now done this for i = 0-5
        }

        return bits; // return the array
    }
}


// 1,2,4,8,16
// adding binaries just used base 2 concept with % and /

// looking at squence where 4 = 100, 5 = 101 to look for pattern with placee
// values of being 0 then 1, etc. but too complicated to then also have to know  how many binary places are needed...

// could do for loop of '2' multiplier where if n == 0, return 0, if n == 1, returrrn [0,1], else while multiplirr < n,
// multiplieer *=2. then say if n-multiplierr >= 0, n/2, stringbuilder append 1, if no, then n/2 and append 0. but gotta
// go through string buildr and look for ons and update the array. this is crazy comoplicatd. not the solution

// dont need string builder, just need to count the 1,s.
// don't try to find the max  fator of 2 right at the begging, increment this too.

// for twoFactor = 2, n = 2 while n != 0, temp = twoFactor, n-twofactor, twofactor /2, oneCOunt++... bettr but still crazy hard.



class Solution { //pattern based approach
    public int[] countBits(int n) {
        int[] bits = new int [n+1];
        for(int i= 0; i<=n ; i++){
            if(i%2==0){
                bits[i]= bits[i/2];
            }
            else{
                bits[i] = bits[i-1]+1;}
        }
        return bits;
    }
}

// 0,0
// 1,1
// 2,1
// 3,2
// 4,1
// 5,2
// 6,2
// 7, 3
// 8, 1
// 9, 2

