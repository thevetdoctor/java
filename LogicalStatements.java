import java.time.LocalDate;
// import java.util.Scanner;
// import java.util.Arrays;

public class LogicalStatements {
    public static void main(String[] args) {
        int temperature = 33;
        if (temperature > 32)
            System.out.println("It's a hot day");
        else if (temperature > 20)
            System.out.println("It's a cool day");
        else
            System.out.println("It's so cold today");

        int income = 500_000;
        boolean hasHighIncome = (income > 400_000);
        System.out.println(hasHighIncome);

        int incomeLevel = 500_000;
        String flightStatus = (incomeLevel > 400_000) ? "First" : "Economy";
        System.out.println(flightStatus + "Class");

        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You are an admin");
                break;
            case "moderator":
                System.out.println("You are a moderator");
                break;
            default:
                System.out.println("You are a guest");
        }
        int grade = 3;
        switch (grade) {
            case 1:
                System.out.println("You are an admin");
                break;
            case 2:
                System.out.println("You are a moderator");
                break;
            default:
                System.out.println("You are a guest");
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Hello World");
        }

        // Scanner scanner = new Scanner(System.in);
        // String input = "";
        // while (!input.equals("exit")) {
        // System.out.print("Input: ");
        // input = scanner.nextLine().toLowerCase();
        // if (input.equals("pass"))
        // continue;
        // if (input.equals("exit"))
        // break;
        // }
        // scanner.close();

        String[] fruits = { "Mango", "Lemon", "Orange", "Guava" };
        for (String fruit : fruits) {
            if (fruit.startsWith("O")) {
                break;
            }
            if (fruit.equals("Lemon")) {
                break;
            }
            System.out.println(fruit);
        }

        // Arrays.stream(fruits).forEach(System.out::println);

        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());

        Person oba = new Person("obafemi");
        Person demi = oba;

        System.out.println("oba:- " + oba.name + ", demi: " + demi.name);
        // System.out.println("Changing 'oba.name' to 'samuel' also changes demi.name to
        // 'samuel'");
        // oba.name = "samuel";
        // System.out.println("oba:- " + oba.name + ", demi: " + demi.name);
        // System.out.println("Changing 'demi.name' to 'folajimi' also changes oba.name
        // to 'folajimi'");
        // demi.name = "folajimi";
        // System.out.println("oba:- " + oba.name + ", demi: " + demi.name);

        int i = 4;
        do {
            System.out.println(i);
            i++;
        } while (i < 3);
        // {
        // System.out.println(i);
        // i++;
        // };

    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}
