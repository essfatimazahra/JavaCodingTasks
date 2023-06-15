package week01;

public class Test1 {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(OddOrEven(num));
    }

    public static String OddOrEven (int num){
        if(num %2 ==0){
            System.out.println(num + " is an even number ");
            return "Even";
        }else{
            System.out.println(num + " is an odd number");

        }
        return "Odd";
    }
}
