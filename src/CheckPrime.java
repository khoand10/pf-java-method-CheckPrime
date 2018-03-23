import java.util.Scanner;

public class CheckPrime {
    public static boolean checkPrime(int number){
        boolean kq=false;
        if(number < 2){
            return false;
        }else{
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) kq = false;
                else kq = true;
            }
            if (kq) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        if(checkPrime(number)) System.out.println("Yes");
        else System.out.println("NO");
    }
}
