import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner read = new Scanner(System.in);
   
 String a = "" ;
 String b = "" ;
 int kek; 
 int rer = 967 ;
  // =======
 System.out.print("Зашифровать код (1) Разшифровать код (2)(В этой же строке напиши свою строку!): ");
  kek = read.nextInt();
  System.out.println(kek);
  
    if (kek == 1){

System.out.print("Исходное сообщение: " );
String msg;
    
    msg = read.nextLine();
 
     System.out.println(msg);

      for(int i = 0 ; i < msg.length(); i ++)
       
       a = a + (char) (msg.charAt(i) ^ rer);
       
       System.out.print("Зашифрованое сообщение: ");
       System.out.println(a);
      } else if (kek == 2) {
  
   System.out.print("Зашифрованая строка: ");
String msg;
 msg = read.nextLine();
   System.out.println(msg);
 
 for(int i = 0; i < msg.length(); i ++)
          b = b + (char) (a.charAt(i) ^ rer);
          System.out.print("Разшифрованое сообщение: ");
          System.out.println(b);
          }
    }
}