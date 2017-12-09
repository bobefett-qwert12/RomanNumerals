import java.util.Scanner;
public class RomanNumeralsTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an integer less than 4000: ");
        if(in.hasNextInt()){
            int romanNumber = in.nextInt();
            if(0 < romanNumber && romanNumber < 4000){
                int ones = (romanNumber % 10);
                int tens = ((romanNumber % 100) - ones);
                int hundreds = (((romanNumber % 1000) - tens) - ones);
                int thousands = (((romanNumber - hundreds) - tens) - ones);
                RomanNumerals number = new RomanNumerals(ones, tens, hundreds, thousands);
                System.out.println("Your number in Roman Numerals is " + number.getRomanThousands() + number.getRomanHundreds() + number.getRomanTens() + number.getRomanOnes());
            }else{
                System.out.println("That number is outside the range.");
            }
        }else{
            System.out.println("That is not a valid integer.");
        }
    }
}
