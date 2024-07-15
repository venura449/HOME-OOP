import java.util.Scanner;
//

 class len{
    public static void main(String []args){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter Length :");
        Float length = sc1.nextFloat();
        System.out.print("Enter Width :");
        Float width = sc1.nextFloat();


        System.out.println("Permit is : "+2*( length + width ));
    }
}