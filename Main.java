import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int myAge = 25;
        int anotherAge = ++myAge;
        int newAge = myAge++;
        int[] arr = { 2, 4, 6 };
        int[][] anotherArr = {{ 2, 4, 6 }, {}};
        int[][] secondArr = new int[3][4];
        String str = "34";
        String msg = "Welcome to Java";
        int integerDivision = 45 / 7;
        int integerModulus = 45 % 7;
        double math = (double)(Math.random() * 100);
        int math1 = (int)(math);
        double math2 = (double) (Math.random() * 100);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        String currencyResult = currency.format(123456745.7865);
        String percentResult = percent.format(0.7865);
        String percentString1 = NumberFormat.getPercentInstance().format(0.854);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        try {
            System.out.print("Name: ");
            String name = scanner1.nextLine();
            System.out.println("You name is " + name);
            System.out.print("Age: ");
            String age = scanner2.nextLine();
            System.out.println("You are " + age + " years old");
        }
        finally {
            if(scanner1!=null)
                scanner1.close();
            if(scanner2!=null)
                scanner2.close();
        }
        
        System.out.println("Hello world" + " => " + math + " " + math1 + " " + math2);
        System.out.println(msg + " " + myAge + " " + currencyResult + " " + percentResult + " " + percentString1);
        System.out.println(integerDivision);
        System.out.println(integerModulus);
        System.out.println(str + 3);
        System.out.println(Integer.parseInt(str) + 3);
        System.out.println(myAge + " " + anotherAge + " " + newAge);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(anotherArr));
        System.out.println(Arrays.deepToString(secondArr));
    }
}