import java.util.Scanner;
public class batting {
    
    System.out.println("You will bat now!");
    System.out.println("Please enter from 1 to 6");
    
    random rand = new random();
    Scanner in = new Scanner(System.in);
    boolean isOut = false;
    int input;
    int total=0;
    int bowl;

    void battingNow(){
        while(isOut==false){
        System.out.println("Enter: ");
        input = in.nextInt();

        bowl = rand.bowl();

        if(input == bowl){
            System.out.println("You are out!");
            System.out.println("You scored: "+total);
        }

        total = total+input;
    }
    }
}
