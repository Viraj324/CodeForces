A. Square String?
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
A string is called square if it is some string written twice in a row. For example, the strings "aa", "abcabc", "abab" and "baabaa" are square. But the strings "aaa", "abaaab" and "abcdabc" are not square.

For a given string s
 determine if it is square.

Input
The first line of input data contains an integer t
 (1≤t≤100
) —the number of test cases.

This is followed by t
 lines, each containing a description of one test case. The given strings consist only of lowercase Latin letters and have lengths between 1
 and 100
 inclusive.

Output
For each test case, output on a separate line:

YES if the string in the corresponding test case is square,
NO otherwise.
You can output YES and NO in any case (for example, strings yEs, yes, Yes and YES will be recognized as a positive response).

Example
inputCopy
10
a
aa
aaa
aaaa
abab
abcabc
abacaba
xxyy
xyyx
xyxy
outputCopy
NO
YES
NO
YES
YES
YES
NO
NO
NO
YES
------------------------------------------------------------------------------------------------------



import java.util.Scanner;

public class ASquareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            String s = sc.next();
            int n = s.length();
            if (n % 2 == 1) {
                System.out.println("NO");
                continue;  // Use "continue" instead of "break"
            }
            int i = 0;
            int j = n / 2;  // Use "n / 2" instead of "s.length() / 2"
            boolean flag = true;
            while (i < n / 2) {
                if (s.charAt(i) != s.charAt(j)) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
                i++;
                j++;
            }
            if (flag == true) {
                System.out.println("YES");
            }
        }
    }
}
