import java.util.Scanner;

public class ADislikeofThrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x = 0;x<t;x++){
            int k = sc.nextInt();
            for(int i=1;;i++){
                if(i%3==0 || i%10 == 3){
                    continue;
                }else{
                    --k;// 3 2 1 0
                    if(k==0){
                        System.out.println(i);
                        break;
                    }
                }
            }

    }
}
}
