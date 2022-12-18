package Problem1;

/*
Вычислите и выведите на экран объем шара, получив его радиус r с консоли.
        Подсказка: считать по формуле V = 4/3 * pi * r^3. Значение числа pi взять из Math.
        Ограничения: 0 < r < 100
*/
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        System.out.println("Enter a radius of ball: ");
        float r = con.nextFloat();
        if (r > 0 && r < 100) {
            double v = 4/3 * Math.PI * Math.pow(r, 3);
            System.out.println("Volume of ball is " + v);
        }
        else System.out.println("Radius is out of range 0-100");

    }
}
