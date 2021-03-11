import java.util.Scanner;
public class rockPaperScissorsMain {
 
    private static Scanner s;
 
    public static void main(String[] args){
        // TODO Auto-generated method stub    
         
    s = new Scanner(System.in);
    rockPaperScissors game = new rockPaperScissors();
    int user = 0;
    
    while (user!=-1){
        System.out.println("Choose your weapon:\nRock = 1\nPaper = 2\nScissors = 3\nUse -1 to end the game.");
        user = s.nextInt();
        game.setPlayer(user);
        System.out.println(game.determineWinner()); 
    	}
    game.reset();
    }
}