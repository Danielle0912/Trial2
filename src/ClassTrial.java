
import java.util.Scanner;
public class ClassTrial {

    Scanner userName = new Scanner(System.in);



    public static void main(String[] args) {
        System.out.println("Hi there , my name is Danielle. What is your name?");
        ClassTrial t = new ClassTrial();
        t.Message1();
        System.out.println("Chat later");
    }
    public  void Message1(){
        String name = userName.next();
        System.out.println( name + " its nice to meet you");
        Message2();
    }


    public void Message2(){

        System.out.println("Do you attend CPUT?");
        String answer = userName.next();
        System.out.println("Great , so do I");
    }


}

