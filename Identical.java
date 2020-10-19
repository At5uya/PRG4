import java.util.Scanner;

public class Identical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if(s1.startsWith(s2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}