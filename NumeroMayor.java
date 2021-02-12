package numeromayor;

import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Digite el primer numero ");
        num1 = sc.nextInt();
        System.out.print("Digite el segundo numero ");
        num2 = sc.nextInt();
        System.out.print("Digite el tercer numero");
        num3 = sc.nextInt();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El mayor es: " + num1);                                             
            } else {
                System.out.println("el mayor es: " + num3);     
            }
        } else if (num2 > num3) {
            System.out.println("el mayor es: " + num2);
        } else {
            System.out.println("el mayor es: " + num3);
        }
    }
}