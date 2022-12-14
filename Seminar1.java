import java.util.Scanner;

public class Seminar1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J"); // очистка консоли
        // Задача 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n),
        // n! (произведение чисел от 1 до n)

        // int value = 5;
        // int result = value * (value + 1) / 2;
        // System.out.println(result);

        // int result = 1;
        // for (int i = 1; i<=value; i++) {
        // result = result*i;
        // }
        // System.out.println(result);

        // =============================================================
        // Задача 2. Вывести все простые числа от 1 до 1000

        // for (int i = 2; i < 1000; ++i) {
        // int count = 0;
        // for (int j = 2; j <= i && count < 2; ++j) {
        // if (i % j == 0) {
        // ++count;
        // }
        // }
        // if (count < 2)
        // System.out.print(i + " ");
        // }

        // =============================================================
        // Задача 3. Написать простой калькулятор

        // int num1;
        // int num2;
        // int ans;
        // char op;
        // Scanner reader = new Scanner(System.in);
        // System.out.print("Введите два числа: ");
        // num1 = reader.nextInt();
        // num2 = reader.nextInt();
        // System.out.print("\nВведите оператор (+, -, *, /): ");
        // op = reader.next().charAt(0);
        // reader.close();
        // switch (op) {
        //     case '+':
        //         ans = num1 + num2;
        //         break;
        //     case '-':
        //         ans = num1 - num2;
        //         break;
        //     case '*':
        //         ans = num1 * num2;
        //         break;
        //     case '/':
        //         ans = num1 / num2;
        //         break;
        //     default:
        //         System.out.printf("Error! Enter correct operator");
        //         return;
        // }
        // System.out.print("\nThe result is given as follows:\n");
        // System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}