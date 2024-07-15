import java.util.Scanner;

public class even {
    public static void main(String[] args){
        int ecount = 0;
        int ocount = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <10;i++){
            System.out.print("Enter Number :");
            if(scanner.nextInt() % 2 == 0){
                ecount++;
            }
            else{
                ocount++;
            }
        }
        System.out.println("Even Count is ="+ ecount );
        System.out.println("Odd Count is ="+ ocount);
    }
}
