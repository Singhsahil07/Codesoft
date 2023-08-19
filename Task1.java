import java.util.*;
class numberGame{
    public int user,numberGenerated,guesses=0;
    public int getguesses() {
        return guesses;
    }
    public void setguesses(int guesses) {
        this.guesses = guesses;
    }

    numberGame(){
        Random rd= new Random();
        numberGenerated = rd.nextInt(100);
    }
    void user(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();
    }
    boolean isEqual(){
        guesses++;
        if (numberGenerated == user)
        {System.out.format("You guessed it right,it was %d\n you guessed it in %d attempts",numberGenerated,guesses);
            return true;
        }
        else if (user > numberGenerated)
        {System.out.println("Too high. Try again!");}
        else if (user < numberGenerated)
        {System.out.println("Too low. Try again!");}
        return false;
    }
}
public class Task1 {
    public static void main(String[] args) {
        boolean b = false;
        numberGame g = new numberGame();
        while(!b){
            g.user();
            b=g.isEqual();
        }
    }

}
