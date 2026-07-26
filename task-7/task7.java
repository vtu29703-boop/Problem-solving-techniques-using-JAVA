import java.util. Scanner; public class UniqueDigitCount {

public static void main(String[] args) { 
  Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");

int n = sc.nextInt();

boolean[] seen = new boolean [10]:

int count = 0;

n = Math.abs(n); // Handle negative numbers

if (n == 0) {

} else {

count = 1; // 0 has one unique digit

while (n > 0) { int digit = n % 10;

if (!seen[digit]) { seen[digit] = true;

count++;

}
n /= 10

}

}

System.out.println("Unique digit count = " + count); sc.close();

}

}
