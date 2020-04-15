import java.util.Scanner;

public class positivenegative {
    public static void main(String[] args){
        int x;
        System.out.println("enter any number:");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        if (x >= 0) {
            System.out.println(x +  " positive");
        }else {
            System.out.println(x +  " negative");
        }
    }
}
