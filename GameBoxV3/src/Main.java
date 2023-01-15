
import java.util.Random;
import java.util.Scanner;

                public class Main {
                    public static void main(String[] args) {
                       Scanner scanner = new Scanner(System.in);
                        int gameMode;
                        int game;
                        int gameRunner = 1;
                        Random random = new Random();
                        int upperbound =3;
                        // GAME INTRO start
                        while (gameRunner == 1) {
                            System.out.println("Welcome to Gamebox");
                            System.out.println("Please select if you will be playing solo or with a friend: ");
                            System.out.println("Enter '1' for solo and '2' for multi");
                            gameMode = Integer.parseInt(scanner.nextLine());
                            System.out.println("Choose which game you want to play");
                            System.out.printf(" %n '1' for Rock, paper, scissors %n '2' for Hangman %n" );
                            game = Integer.parseInt(scanner.nextLine());
                            // GAME INTRO end
                            // Rock Paper Scissors single-player start



                            if (gameMode == 1 && game == 1) {
                                new RPS_1_1();
                                // Rock Paper Scissors single-player end
                            }
                            if(gameMode == 2 && game == 1) {
                                new RPS_1_2();
                            }
                            if (gameMode == 2 && game == 2) {
                                new Hangman2_2();
                            }
            gameRunner = 0;
        }


    }


}