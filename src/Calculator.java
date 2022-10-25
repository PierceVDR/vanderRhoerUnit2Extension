public class Calculator {
    double a;
    double b;

    // Constructor:
    public Calculator(double a, double b) {
        this.a=a;
        this.b=b;
    }

    // Setters:
    public void setA(double a) {this.a=a;}
    public void setB(double b) {this.b=b;}

    // Operations:
    public double add() {return a + b;}

    public double subtract() {return a - b;}

    public double multiply() {return a * b;}

    public double divide() {return a / b;}

    public double power() {return Math.pow(a,b);}

    public double mod() {return a % b;}

}
