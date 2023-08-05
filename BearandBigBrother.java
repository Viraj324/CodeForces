A. Bear and Big Brother
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
Bear Limak wants to become the largest of bears, or at least to become larger than his brother Bob.

Right now, Limak and Bob weigh a and b respectively. It's guaranteed that Limak's weight is smaller than or equal to his brother's weight.

Limak eats a lot and his weight is tripled after every year, while Bob's weight is doubled after every year.

After how many full years will Limak become strictly larger (strictly heavier) than Bob?

Input
The only line of the input contains two integers a and b (1 ≤ a ≤ b ≤ 10) — the weight of Limak and the weight of Bob respectively.

Output
Print one integer, denoting the integer number of years after which Limak will become strictly larger than Bob.
------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class BearandBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        while (a <= b) { // Use a <= b instead of a < b
            a = a * 3;
            b = b * 2;
            count++;
        }
        System.out.println(count);
    }
}
