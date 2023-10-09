import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int math, science, english;

    while(true) {
      System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
      try {
        math = scanner.nextInt();
        science = scanner.nextInt();
        english = scanner.nextInt();
        break;
      } catch(InputMismatchException e) {
        System.out.println("정수값 입력");
        scanner.nextLine();
      }
    }
    
    Grade me = new Grade(math, science, english);
    System.out.println("평균은 " + me.average());

    scanner.close();
  }
}