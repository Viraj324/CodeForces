A. Ezzat and Two Subsequences
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
Ezzat has an array of n
 integers (maybe negative). He wants to split it into two non-empty subsequences a
 and b
, such that every element from the array belongs to exactly one subsequence, and the value of f(a)+f(b)
 is the maximum possible value, where f(x)
 is the average of the subsequence x
.

A sequence x
 is a subsequence of a sequence y
 if x
 can be obtained from y
 by deletion of several (possibly, zero or all) elements.

The average of a subsequence is the sum of the numbers of this subsequence divided by the size of the subsequence.

For example, the average of [1,5,6]
 is (1+5+6)/3=12/3=4
, so f([1,5,6])=4
.

Input
The first line contains a single integer t
 (1≤t≤103
)— the number of test cases. Each test case consists of two lines.

The first line contains a single integer n
 (2≤n≤105
).

The second line contains n
 integers a1,a2,…,an
 (−109≤ai≤109
).

It is guaranteed that the sum of n
 over all test cases does not exceed 3⋅105
.

Output
For each test case, print a single value — the maximum value that Ezzat can achieve.

Your answer is considered correct if its absolute or relative error does not exceed 10−6
.

Formally, let your answer be a
, and the jury's answer be b
. Your answer is accepted if and only if |a−b|max(1,|b|)≤10−6
.

Example
inputCopy
4
3
3 1 2
3
-7 -6 -6
3
2 2 2
4
17 3 5 -3
outputCopy
4.500000000
-12.500000000
4.000000000
18.666666667
Note
In the first test case, the array is [3,1,2]
. These are all the possible ways to split this array:

a=[3]
, b=[1,2]
, so the value of f(a)+f(b)=3+1.5=4.5
.
a=[3,1]
, b=[2]
, so the value of f(a)+f(b)=2+2=4
.
a=[3,2]
, b=[1]
, so the value of f(a)+f(b)=2.5+1=3.5
.
Therefore, the maximum possible value 4.5
.
In the second test case, the array is [−7,−6,−6]
. These are all the possible ways to split this array:

a=[−7]
, b=[−6,−6]
, so the value of f(a)+f(b)=(−7)+(−6)=−13
.
a=[−7,−6]
, b=[−6]
, so the value of f(a)+f(b)=(−6.5)+(−6)=−12.5
.
Therefore, the maximum possible value −12.5
.
---------------------------------------------------------------------------------------------------------
vimport java.text.DecimalFormat;
import java.util.*;

public class AEzzatandTwoSubsequences {
     public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int t = sc.nextInt();
        for(int x = 0;x<t;x++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i =0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            double ans = 0;
            for(int i = 0;i<arr.length-1;i++){
                 ans = ans + arr[i];
            }
            ans = ans/(arr.length-1);
            double result = arr[n-1]+ans;
            DecimalFormat decimalFormat = new DecimalFormat("0.000000000");

        // Format the value using the DecimalFormat
            String formattedValue = decimalFormat.format(result);

        // Display the formatted value
            System.out.println(formattedValue);


        }
     }
}
