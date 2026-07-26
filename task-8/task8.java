import java.util. Scanner;

public class MostFrequentDigit {

public static void main(String[] args) { 
  Scanner sc = new Scanner (System.in);

System.out.print("Enter a number: "); int n = sc.nextInt():

int[] freq = new int [10]; n = Math.abs(n); // Handle negative numbers

if (n == 0) { freq[0] = 1:

} else {

while (n > 0) { int digit = n % 10; freq[digit]++: n /= 10;

}
}

int maxFreq = freq[0]: int mostFrequentDigit = 0;

for (int i = 1; i < 10; i++) { if (freq[i] > maxFreq) { maxFreq = freq[i]; mostFrequentDigit = i;

}

}

System.out.println("Most frequent digit = " + mostFrequentDigit); System.out.println("Frequency = " + maxFreq);

sc.close():
    }

}
