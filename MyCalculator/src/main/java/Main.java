public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int num1 = 5;
        int num2 = 3;
        int result1 = calculator.add(num1, num2);
        int result2 = calculator.sub(num1, num2);
        int result3 = calculator.mult(num1, num2);
        float result4 = calculator.div(num1, num2);

        System.out.println(num1 + "+" + num2 + "=" + result1);
        System.out.println(num1 + "-" + num2 + "=" + result2);
        System.out.println(num1 + "*" + num2 + "=" + result3);
        System.out.println(num1 + "/" + num2 + "=" + result4);


        System.out.println(Math.min(num1, num2));
        System.out.println(Math.max(num1, num2));
        System.out.println(Math.sqrt(num1));
        System.out.println(Math.sqrt(num2));
        System.out.println(Math.abs(num1));
        System.out.println(Math.abs(num2));
        System.out.println(Math.random());
    }
}
