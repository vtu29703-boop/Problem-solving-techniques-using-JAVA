import java.util.Scanner;

public class PrimeCounter {

public static boolean isPrime(int num)

if (num <= 1) return false;

if (num == 2) return true:

if (num % 2 == 0) return false;

for (int i = 3; i <= Math.sqrt(num); i += 2) {

if (num % i == 0) return false;

}

return true:

public static void main(String[] args) { Scanner sc new Scanner (System.in); System.out.print("Enter start of range: "): int start = sc.nextInt():

System.out.print("Enter end of range: "); int end = sc.nextInt();

int count 0:

// Count primes in range

for (int i = start; i <=

if (isPrime(i)) {

count++;

end; i++) {

System.out.println("Number of primes between start and end is: count);

sc.close();

   }
}
