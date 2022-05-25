import java.util.Scanner;

public class Ultim {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1= entrada.nextInt();
        int num2= entrada.nextInt();
        sumar(num1, num2);
    }
    public static int sumar(int a, int b){
        return a+b;
    }
}

