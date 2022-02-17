import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        // Methods
        // char [] letters = { 'A', 'A', 'B', 'C', 'D', 'D', 'D' };
        // frequency(letters, 'D');

        new Cars("honda", "wine", false);
        new Cars("kia", "wine", false);

        // reverse(12345);
        // reverse(-12345);
        reverse(1534236469);
        reverseBits(0b11111111111111111111111111111101);
    }

    public static int frequency(char [] letterArray, char search) {
        int count = 0;
        for(char letter : letterArray) {
            if(letter == search) {
                count++;
            }
        }n(reversed1);
                System.out.println(
        System.out.println("Frequency method was invoked => " 
                            + search + " occurred " + count 
                            + " times in " + Arrays.toString(letterArray));
        return count;
    }

    static class Cars {
        String brand;
        String color;
        boolean isSuv;

        Cars(String brand, String color, boolean isSuv) {
            this.brand = brand;
            this.color = color;
            this.isSuv = isSuv;
    
            System.out.println(this.brand + " " + this.color + " " + this.isSuv);
        }

    }

    public static int reverse(int x) {

        // check if x is a positive or negative integer
        boolean isNegativeInteger = x < 0;
        // get the absoulte value of x
        int absoluteValue = Math.abs(x);
        // convert x to a string
        String reversed = String.valueOf(absoluteValue);
        //initialize an empty string to capture the reversed string characters
        String newString = "";
        // loop through converted string
        for (int i = reversed.length() - 1; i >= 0; i--) {
            // append characters to new string
            newString += reversed.charAt(i);
        }
        // check if reversed string is a valid integer
        try {  
            int newX = isNegativeInteger ? Integer.parseInt(newString) * -1 : Integer.parseInt(newString);
            System.out.println(x);
            System.out.println(newX);
            System.out.println(isNegativeInteger ? "Is negative" : "Is positive");
            return newX;
        }catch(NumberFormatException ex){
            return 0;
        }
    }

    public static int reverseBits(int i) {

                // // convert x to a string
                // String reversed = String.valueOf(n);
                // String reversed1 = String.valueOf(n);
                //initialize an empty string to capture the reversed string characters
                String newString = "";
                // loop through converted string
                // for (int i = reversed.length() - 1; i >= 0; i--) {
                //     // append characters to new string
                //     newString += reversed.charAt(i);
                // }
                // convert string back to integer
                System.out.println(i );
                // System.out.println(reversed);
                // System.out.printlnewString);
                try {  
                    int newX = Integer.parseInt(newString);
                    System.out.println(newX);
                    return newX;
                }catch(NumberFormatException ex){
                    System.out.println("Invalid argument");
                    return 0;
                }
    }
}
