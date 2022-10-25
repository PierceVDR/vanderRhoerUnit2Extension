import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an expression with: *, /, +, -, %, or ^: ");
        String input = scan.nextLine();

        scan.close();

        int spaceIdx = input.indexOf(" ");
        double a = Double.parseDouble( input.substring( 0, spaceIdx ) );
        String op = input.substring( spaceIdx+1,spaceIdx+2 );
        double b = Double.parseDouble( input.substring( spaceIdx+3 ) ); // +3 since the .indexOf will look at the first space

        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(op);


        Calculator calc = new Calculator(a,b);

        String output = "";

        // Call appropriate method for operation:
        if (op.equals("*")) {
            output += calc.multiply();
        } else if (op.equals("/")) {
            output += calc.divide();
        } else if (op.equals("+")) {
            output += calc.add();
        } else if (op.equals("-")) {
            output += calc.subtract();
        } else if (op.equals("%")) {
            output += calc.mod();
        } else if (op.equals("^")) {
            output += calc.power();
        } else {
            output = "Error";
        }

        System.out.println(input + " = " + output);
    }
}
