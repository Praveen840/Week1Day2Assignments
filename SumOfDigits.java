package week1.day2;

public class SumOfDigits {
    public static void main(String[] args) {
        int input = 123;
        //add 1+2+3=6 thats the program
       int sum = 0; //initialize the sum with 0

        while (input > 0 ){
           int rem = input % 10;

           sum = sum + rem ;
           input = input/10;

        }
        System.out.println(sum);

    }
}
