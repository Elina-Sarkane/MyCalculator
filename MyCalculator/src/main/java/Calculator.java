public class Calculator {
    public static int add;
    public static int sub;
    public static int mult;
    public static float div;

    public static int add(int num1, int num2){
        add = num1 + num2;
        return add;
    }
    public static int sub(int num1, int num2){
        sub = num1 - num2;
        return sub;
    }
    public static int mult(int num1, int num2){
        mult = num1 * num2;
        return mult;
    }
    public static float div(int num1, int num2){
        div = num1 / num2;
        return div;
    }

}


