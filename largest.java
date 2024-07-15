import java.util.Scanner;

public class largest {
    public static void main(String[] args){
        int [] numbers;
        numbers = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <3;i++){
            System.out.print("Enter Number :");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Max is :"+max(numbers));
        System.out.println("Min is :"+min(numbers));
    }

    public static int max(int[] numbers){
        int max = numbers[0],min = numbers[0];
        for (int i = 0; i <3;i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        return max;
    }


    public static int min(int[] numbers){
        int max = numbers[0],min = numbers[0];
        for (int i = 0; i <3;i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        return min;
    }
}
