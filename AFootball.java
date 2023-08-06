A. Football
time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
Petya loves football very much. One day, as he was watching a football match, he was writing the players' current positions on a piece of paper. To simplify the situation he depicted it as a string consisting of zeroes and ones. A zero corresponds to players of one team; a one corresponds to players of another team. If there are at least 7 players of some team standing one after another, then the situation is considered dangerous. For example, the situation 00100110111111101 is dangerous and 11110111011101 is not. You are given the current situation. Determine whether it is dangerous or not.

Input
The first input line contains a non-empty string consisting of characters "0" and "1", which represents players. The length of the string does not exceed 100 characters. There's at least one player from each team present on the field.

Output
Print "YES" if the situation is dangerous. Otherwise, print "NO".

Examples
inputCopy
001001
outputCopy
NO
inputCopy
1000000001
outputCopy
YES
----------------------------------------------------------------------------------------
import java.util.Scanner;

import java.util.Scanner;

public class AFootball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.next();
        int count1 = 0;
        int count0 = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '1') {
                count1++;
                count0 = 0; // Reset the count of consecutive zeroes
            } else {
                count0++;
                count1 = 0; // Reset the count of consecutive ones
            }
            if (count1 >= 7 || count0 >= 7) {
                System.out.println("YES");
                return; // Exit the program if the situation is dangerous
            }
        }

        System.out.println("NO");
    }
}
