
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
                                System.out.println("Welcome to Single-player Rock, Paper, Scissors");
                                int rpsScorePlayer = 0;
                                int rpsScoreComp = 0;
                                int rpsRounds;
                                int rpsRunner = 1;
                                int rpsPlayerInput;
                                int rpsCompInput;
                                while (rpsRunner == 1) {
                                    System.out.println("Choose how many rounds you want to play");
                                    System.out.println("Enter an odd number");
                                    rpsRounds = Integer.parseInt(scanner.nextLine());
                                    if (rpsRounds % 2 != 0) {
                                        while (rpsRounds > 0) {
                                            System.out.println("Enter: '1' for Rock, '2' for Paper, '3' for Scissors");
                                            rpsPlayerInput = Integer.parseInt(scanner.nextLine());
                                            rpsCompInput = random.nextInt(upperbound);
                                            if (rpsPlayerInput > 3 || rpsPlayerInput < 1) {
                                                System.out.println("Wrong input. Try again.");
                                                System.out.println("Enter: '1' for Rock, '2' for Paper, '3' for Scissors");
                                                rpsPlayerInput = Integer.parseInt(scanner.nextLine());
                                                rpsCompInput = random.nextInt(upperbound);
                                            }
                                            if (rpsPlayerInput == 1 && rpsCompInput == 0){
                                                System.out.println("Looks like the computer also picked rock so it a DRAW");
                                                System.out.println(rpsScorePlayer);
                                                System.out.println(rpsScoreComp);
                                            }
                                            if (rpsPlayerInput == 1 && rpsCompInput == 1){
                                                System.out.println("Looks like the computer picked paper so you LOSE");
                                                rpsScoreComp++;
                                                System.out.println(rpsScorePlayer);
                                                System.out.println(rpsScoreComp);
                                            }
                                            if (rpsPlayerInput == 1 && rpsCompInput == 2){
                                                System.out.println("Looks like the computer picked scissors so you WIN");
                                                rpsScorePlayer++;
                                                System.out.println(rpsScorePlayer);
                                                System.out.println(rpsScoreComp);
                                            }
                                            if (rpsPlayerInput == 2 && rpsCompInput == 0){
                                                System.out.println("Looks like the computer picked rock so you WIN");
                                                rpsScorePlayer++;
                                                System.out.println(rpsScorePlayer);
                                                System.out.println(rpsScoreComp);
                                            }
                                            if (rpsPlayerInput == 2 && rpsCompInput == 1) {
                                                System.out.println("Looks like the computer also picked paper so it a DRAW");
                                                System.out.println(rpsScorePlayer);
                                                System.out.println(rpsScoreComp);
                                            }
                                            if (rpsPlayerInput == 2 && rpsCompInput == 2) {
                                                System.out.println("Looks like the computer picked scissors so you LOSE");
                                                rpsScoreComp++;
                                                System.out.println(rpsScorePlayer);
                                                System.out.println(rpsScoreComp);
                                            }
                                            if (rpsPlayerInput == 3 && rpsCompInput == 0) {
                                                System.out.println("Looks like the computer picked rock so you LOSE");
                                                rpsScoreComp++;
                                                System.out.println(rpsScorePlayer);
                                                System.out.println(rpsScoreComp);
                                            }
                                            if (rpsPlayerInput == 3 && rpsCompInput== 1) {
                                                System.out.println("Looks like the computer picked paper so you WIN");
                                                rpsScorePlayer++;
                                                System.out.println(rpsScorePlayer);
                                                System.out.println(rpsScoreComp);
                                            }
                                            if (rpsPlayerInput == 3 && rpsCompInput== 2) {
                                                System.out.println("Looks like the computer also picked scissors so it a DRAW");
                                                System.out.println(rpsScorePlayer);
                                                System.out.println(rpsScoreComp);
                                            }

                                            rpsRounds--;
                                        }
                                        System.out.println("Game over");
                                        if (rpsScoreComp > rpsScorePlayer ) {
                                            System.out.println("You LOSE");
                                            System.out.println("Final score is: " + rpsScoreComp + " to " + rpsScorePlayer);
                                        }
                                        if (rpsScoreComp < rpsScorePlayer ) {
                                            System.out.println("You WIN");
                                            System.out.println("Final score is: " + rpsScorePlayer + " to " + rpsScoreComp);
                                        }
                                        rpsRunner = 0;
                                    } else {
                                        System.out.println("Wrong input");
                                    }
                                }
                                // Rock Paper Scissors single-player end
                            }
                            if(gameMode == 2 && game == 1) {
                                System.out.println("Welcome to Multi-player Rock, Paper, Scissors");
                                int rpsScorePlayer = 0;
                                int rpsScorePlayer2 = 0;
                                int rpsRounds;
                                int rpsRunner = 1;
                                int rpsPlayerInput ;
                                int rpsPlayer2Input;
                                while (rpsRunner == 1) {
                                    System.out.println("Choose how many rounds you want to play");
                                    System.out.println("Enter an odd number");
                                    rpsRounds = Integer.parseInt(scanner.nextLine());
                                    if (rpsRounds % 2 != 0) {
                                        while (rpsRounds > 0) {
                                            System.out.println("Enter: '1' for Rock, '2' for Paper, '3' for Scissors");
                                            rpsPlayerInput = Integer.parseInt(scanner.nextLine());
                                            if (rpsPlayerInput > 3 || rpsPlayerInput < 1 ) {
                                                System.out.println("Wrong input. Error505. U STUPID! Try again cabron.");
                                                System.out.println("Enter: '1' for Rock, '2' for Paper, '3' for Scissors");
                                                rpsPlayerInput = Integer.parseInt(scanner.nextLine());
                                            }
                                            System.out.println("Enter: '1' for Rock, '2' for Paper, '3' for Scissors");
                                            rpsPlayer2Input = Integer.parseInt(scanner.nextLine());


                                            if (rpsPlayer2Input > 3 || rpsPlayer2Input < 1 ) {
                                                System.out.println("Wrong input. Error505. U STUPID! Try again cabron.");
                                                System.out.println("Enter: '1' for Rock, '2' for Paper, '3' for Scissors");
                                                rpsPlayer2Input = Integer.parseInt(scanner.nextLine());
                                            }





                                            if (rpsPlayerInput == 1 && rpsPlayer2Input == 1){
                                                System.out.println("Looks like Player 2 also picked rock so it a DRAW");
                                                System.out.println("Player1: "+ rpsScorePlayer);
                                                System.out.println("Player2: "+rpsScorePlayer2);
                                            }
                                            if (rpsPlayerInput == 1 && rpsPlayer2Input == 2){
                                                System.out.println("Looks like Player 1 picked rock so Player 2 WINS");
                                                rpsScorePlayer2++;
                                                System.out.println("Player1: "+ rpsScorePlayer);
                                                System.out.println("Player2: "+rpsScorePlayer2);
                                            }
                                            if (rpsPlayerInput == 1 && rpsPlayer2Input == 3){
                                                System.out.println("Looks like Player 2 picked scissors so Player 1 WINS");
                                                rpsScorePlayer++;
                                                System.out.println("Player1: "+ rpsScorePlayer);
                                                System.out.println("Player2: "+rpsScorePlayer2);
                                            }
                                            if (rpsPlayerInput == 2 && rpsPlayer2Input == 1){
                                                System.out.println("Looks like Player 2 picked rock so Player 1 WINS");
                                                rpsScorePlayer++;
                                                System.out.println("Player1: "+ rpsScorePlayer);
                                                System.out.println("Player2: "+rpsScorePlayer2);
                                            }
                                            if (rpsPlayerInput == 2 && rpsPlayer2Input == 2) {
                                                System.out.println("Looks like Player 2 also picked paper so it a DRAW");
                                                System.out.println("Player1: "+ rpsScorePlayer);
                                                System.out.println("Player2: "+rpsScorePlayer2);
                                            }
                                            if (rpsPlayerInput == 2 && rpsPlayer2Input == 3) {
                                                System.out.println("Looks like Player 1 picked paper so Player 2 WINS");
                                                rpsScorePlayer2++;
                                                System.out.println("Player1: "+ rpsScorePlayer);
                                                System.out.println("Player2: "+rpsScorePlayer2);
                                            }
                                            if (rpsPlayerInput == 3 && rpsPlayer2Input == 1) {
                                                System.out.println("Looks like Player 1 picked scissors so Player 2 WINS");
                                                rpsScorePlayer2++;
                                                System.out.println("Player1: "+ rpsScorePlayer);
                                                System.out.println("Player2: "+rpsScorePlayer2);
                                            }
                                            if (rpsPlayerInput == 3 && rpsPlayer2Input== 2) {
                                                System.out.println("Looks like Player 2 picked paper so Player 1 WINS");
                                                rpsScorePlayer++;
                                                System.out.println("Player1: "+ rpsScorePlayer);
                                                System.out.println("Player2: "+rpsScorePlayer2);
                                            }
                                            if (rpsPlayerInput == 3 && rpsPlayer2Input== 3) {
                                                System.out.println("Looks like Player 2 also picked scissors so it a DRAW");
                                                System.out.println("Player1: "+ rpsScorePlayer);
                                                System.out.println("Player2: "+ rpsScorePlayer2);
                                            }

                                            rpsRounds--;
                                        }
                                        System.out.println("Game over");
                                        if (rpsScorePlayer2 > rpsScorePlayer ) {
                                            System.out.println("You LOSE");
                                            System.out.println("Final score is: " + rpsScorePlayer2 + " to " + rpsScorePlayer);
                                        }
                                        if (rpsScorePlayer2< rpsScorePlayer ) {
                                            System.out.println("You WIN");
                                            System.out.println("Final score is: " + rpsScorePlayer + " to " + rpsScorePlayer2);
                                        }
                                        rpsRunner = 0;
                                    } else {
                                        System.out.println("Wrong input");
                                    }
                                }
                                // Rock Paper Scissors multiplayer end
                    }
            if (gameMode == 2 && game == 2) {
                int hScorePlayer1 = 0;
                int hScorePlayer2 = 0;
                int hLifePlayer1 = 7;
                int hLifePlayer2 = 7;
                int WhoFirst = 2;
                int hRound = 1;
                String input;
                StringBuilder saved = new StringBuilder();
                char Letters;
                int lengthString;
                char firstLetter;
                char lastLetter;
                int emptySpace;
                int y = 1;
                boolean end = false;
                boolean hasLetter = false;
                while (hRound == 1) {

                    // if (random.nextInt(WhoFirst) == 0) {
                    System.out.println("Player 1 input");
                    input = scanner.nextLine();
                    lengthString = input.length();
                    firstLetter = input.charAt(0);
                    lastLetter = input.charAt(lengthString - 1);
                    saved.setLength(lengthString);
                    saved.setCharAt(0, firstLetter);
                    emptySpace = lengthString - 2;
                    while (emptySpace > 0) {
                        if (input.charAt(y) == firstLetter || input.charAt(y) == lastLetter) {
                            if (input.charAt(y) == firstLetter) {
                                saved.setCharAt(y, firstLetter);
                            }else {
                                saved.setCharAt(y, lastLetter);
                            }
                        }else {
                            saved.setCharAt(y, '_');
                        }
                        y++;
                        emptySpace--;
                    }
                    saved.setCharAt(lengthString - 1, lastLetter);
                    System.out.println(saved);

                while(!end) {
                    System.out.println(hLifePlayer2);
                    Letters = scanner.nextLine().charAt(0);
                    for (int i = 0; i < lengthString; i++) {
                            if (Letters == input.charAt(i)) {
                                if (Letters == saved.charAt(i)) {
                                System.out.println("You have already entered that letter");
                                hScorePlayer2--;
                                hLifePlayer2--;
                                }
                            saved.setCharAt(i, input.charAt(i));
                            hScorePlayer2++;
                            hasLetter = true;
                            System.out.println(saved);

                            }

                    }
                        if (!hasLetter) {
                            System.out.println("The letter you have entered is not present in the word");
                            hLifePlayer2--;
                            hScorePlayer2--;
                        }
                        hasLetter = false;
                        if (input.contentEquals(saved) || hLifePlayer2 == 0) {
                        end = true;
                        }


                }
                    hRound = 0;
                }



            }
            gameRunner = 0;
        }


    }


}



