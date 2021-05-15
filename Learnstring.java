package week1.day2;

public class Learnstring {
    public static void main(String[] args) {
        //declare using string literal;it is case sensitive

        String str1 = "welcome";
        String str2 = "welcome";


        //declare using a new keyword
        String str3 = new String ("welcome");

        //to compare the memory address
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);

    }
}
