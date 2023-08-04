A. Helpful Maths
time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
Xenia the beginner mathematician is a third year student at elementary school. She is now learning the addition operation.

The teacher has written down the sum of multiple numbers. Pupils should calculate the sum. To make the calculation easier, the sum only contains numbers 1, 2 and 3. Still, that isn't enough for Xenia. She is only beginning to count, so she can calculate a sum only if the summands follow in non-decreasing order. For example, she can't calculate sum 1+3+2+1 but she can calculate sums 1+1+2 and 3+3.

You've got the sum that was written on the board. Rearrange the summans and print the sum in such a way that Xenia can calculate the sum.

Input
The first line contains a non-empty string s — the sum Xenia needs to count. String s contains no spaces. It only contains digits and characters "+". Besides, string s is a correct sum of numbers 1, 2 and 3. String s is at most 100 characters long.

Output
Print the new sum that Xenia can count.

Examples
inputCopy
3+2+1
outputCopy
1+2+3
inputCopy
1+1+3+1+3
outputCopy
1+1+1+3+3
inputCopy
2
outputCopy
2
----------------------------------------------------------------------------------------------------
import java.util.*;
public class HelpfulMaths {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        str = sc.next();
        int temp[] = new int[(str.length()/2)+1];
        int j = 0;
        for(int i =0;i<str.length();i = i+2){
            temp[j] = Character.getNumericValue(str.charAt(i));
            j++;
        }
        Arrays.sort(temp);
        Collections.reverse(Arrays.asList(temp));
        // String ans;
        // sb.append(temp[0]);
        // ans = sb.toString();
        // for(int i = 1;i<=j;i++){
        //     if(i == j-1){
        //         sb.append(temp[i]);
        //         ans = sb.toString();
        //         break;
        //     }
        //     else{
        //         sb.append('+');
        //         ans = sb.toString();
        //         sb.append(temp[i]);
        //         ans = sb.toString();
        //         break;
        //     }
        // }
        // System.out.println(ans);
        System.out.print(temp[0]);
        for(int i = 1;i<j;i++){
            System.out.print("+"+temp[i]);
        }
    }
}
