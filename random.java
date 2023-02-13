import java.util.Random;
public class random {

    Random rand = new Random();
    
    int toss(){
        return rand.nextInt(1)+1;
    }

    int bowl(){
        return rand.nextInt(1, 7);
    }

    int bat(){
        return rand.nextInt(1, 7);
    }
}
