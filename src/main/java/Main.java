import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Podaj symbol: ");
    char s = input.next().charAt(0);
    System.out.print("Podaj n: ");
    int n = input.nextInt();
    for (int i = 1; i <= n; i++){
      for (int j = 0; j < i; j++){
        System.out.print(s + " ");
      }
      System.out.println();
    }
    for (int i = 1; i <= n; i++){
      for (int j = 0; j < i; j++){
        if (j == 0 || j == i - 1 || i == n) {
          System.out.print(s + " ");
        }
        else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    for (int i = 1; i <= n; i++){
      for (int j = i; j < n; j++){
        System.out.print("  ");
      }
      for(int j = 0; j < i; j++) {
        System.out.print(s + " ");
      }
      System.out.println();
    }
    input.close();
  }
}