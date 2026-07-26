import java.util.Scanner;

public class LastDigitSum {

public static void main(String[] args) { Scanner sc = new Scanner (System.in);

// Input two numbers

System.out.print("Enter the first number: "); int num1 = sc.nextInt():

System.out.print("Enter the second number: "); int num2 = sc.nextInt();

// Find last digits

int lastDigit1 = num1 % 10:

int lastDigit2 = num2 % 10;

// Calculate sum

int sum = lastDigit1 + lastDigit2;

// Output result System.out.println("Sum of last digits: " + sum);

sc.close();

}

}
