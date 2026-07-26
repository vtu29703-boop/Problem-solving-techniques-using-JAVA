import java.util.Scanner;

Dublic class SumofPowers {

public static void main(String[] args) { Scanner sc = new Scanner (System.in);

System.out.print("Enter a number: "); int n = sc.nextInt();

System.out.print("Enter the power: "); int power = sc.nextInt();

int temp = n; int sum = 0:

while (temp > 0) {

int digit = temp % 10; sum += (int) Math.pow(digit, power); temp /= 10;

}

System.out.println("Sum of powers of digits = " + sum);

sc.close();

}
