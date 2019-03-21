import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    System.out.println("Hello from CIS-1145!");
    System.out.println("Let's start off with a simple program");

    //ask user for their age

    System.out.println("What is your age?");
    int age;

    Scanner kb = new Scanner (System.in);
    age = kb.nextInt();

    //output the answer
    System.out.println("Your are" + age);

  }
}