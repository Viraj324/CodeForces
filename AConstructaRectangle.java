A. Construct a Rectangle
time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
There are three sticks with integer lengths l1,l2
 and l3
.

You are asked to break exactly one of them into two pieces in such a way that:

both pieces have positive (strictly greater than 0
) integer length;
the total length of the pieces is equal to the original length of the stick;
it's possible to construct a rectangle from the resulting four sticks such that each stick is used as exactly one of its sides.
A square is also considered a rectangle.

Determine if it's possible to do that.

Input
The first line contains a single integer t
 (1≤t≤104
) — the number of testcases.

The only line of each testcase contains three integers l1,l2,l3
 (1≤li≤108
) — the lengths of the sticks.

Output
For each testcase, print "YES" if it's possible to break one of the sticks into two pieces with positive integer length in such a way that it's possible to construct a rectangle from the resulting four sticks. Otherwise, print "NO".

You may print every letter in any case you want (so, for example, the strings yEs, yes, Yes and YES are all recognized as a positive answer).

Example
inputCopy
4
6 1 5
2 5 2
2 4 2
5 5 4
outputCopy
YES
NO
YES
YES
Note
In the first testcase, the first stick can be broken into parts of length 1
 and 5
. We can construct a rectangle with opposite sides of length 1
 and 5
.

In the second testcase, breaking the stick of length 2
 can only result in sticks of lengths 1,1,2,5
, which can't be made into a rectangle. Breaking the stick of length 5
 can produce results 2,3
 or 1,4
 but neither of them can't be put into a rectangle.

In the third testcase, the second stick can be broken into parts of length 2
 and 2
. The resulting rectangle has opposite sides 2
 and 2
 (which is a square).

In the fourth testcase, the third stick can be broken into parts of length 2
 and 2
. The resulting rectangle has opposite sides 2
 and 5
.
==================================================================================================
import java.util.*;

public class AConstructaRectangle {

    public static boolean check(int arr[]){
        int prev = arr[0];
        int current;
        boolean ans = false;
        for(int i =1;i<arr.length;i++){
            current = arr[i];
            if(current == prev){
                ans = true;
                return ans;
            }
            else{
                prev = current;
            }
        }
        return ans;
    }
     public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int t = sc.nextInt();
        for(int x = 0;x<t;x++){
            int arr[] = new int[3];
            for(int i =0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if(arr[0]+arr[1] == arr[2]){
              System.out.println("YES");  
            }
            else if((arr[1] == arr[0])&&(arr[2]%2==0)){
                System.out.println("YES");
            }
            else if((arr[2] == arr[1])&&(arr[0]%2==0)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
     }
}
