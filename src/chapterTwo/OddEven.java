package chapterTwo;

public class OddEven {


    public static void main(String[]args){

        int num = 0;

        System.out.println("Even numbers between 1 to 100: ");
        while(num <100){
            num = num + 2;
            System.out.print(num+" ");
        }
        System.out.println(" ");
        System.out.println("Odd numbers between 1 and 100: ");

        int num2 = 1;
        while(num2 <=100){
            System.out.print(num2+" ");
            num2 = num2 + 2;
        }

    }
}
