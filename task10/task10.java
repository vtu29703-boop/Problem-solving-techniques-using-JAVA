import java.util.Scanner:

public class SecondwordUppercase { 
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in):

System.out.print("Enter a sentence: "):
  String sentence = sc.nextLine():

String[] words = sentence.split("\\s+");

if (words.length >= 2) {

System.out.println(words [1].toUpperCase()): } else {

}

System.out.println("The sentence does not contain a second word.");

sc.close():

}
}
