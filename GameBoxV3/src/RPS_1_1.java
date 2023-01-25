import java.util.Random;
import java.util.Scanner;

public class RPS_1_1 {
    public RPS_1_1() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int upperbound =3;
        System.out.println("Welcome to Single-player Rock, Paper, Scissors");
        int rpsScorePlayer = 0;
        int rpsScoreComp = 0;
        int rpsRounds;
        int rpsRunner = 1;
        int rpsPlayerInput;
        int rpsCompInput;
        String words = "Lady_Gaga:The_Rock:Angelina_Jolie:Brad_Pitt:Kylie_Jenner:Ryan_Reynolds:Gordan_Ramsay:Dr_Phil:Taylor_Swift:Shakira";
        String[] wordsAsArray = words.split(":");
        int index = new Random().nextInt(wordsAsArray.length);
        String randomWord = wordsAsArray[index];
        System.out.println("The enemy:" + randomWord);


        while (rpsRunner == 1) {
            System.out.println("Choose nickname:");
            String user = scanner.nextLine();
            System.out.println( "Hi "+ user);
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
                        System.out.println( user + ": " + rpsScorePlayer);
                        System.out.println(randomWord +":"+ rpsScoreComp);
                    }
                    if (rpsPlayerInput == 1 && rpsCompInput == 1){
                        System.out.println("Looks like the computer picked paper so you LOSE");
                        rpsScoreComp++;
                        System.out.println( user + ": " + rpsScorePlayer);
                        System.out.println(randomWord +":"+ rpsScoreComp);
                    }
                    if (rpsPlayerInput == 1 && rpsCompInput == 2){
                        System.out.println("Looks like the computer picked scissors so you WIN");
                        rpsScorePlayer++;
                        System.out.println( user + ": " + rpsScorePlayer);
                        System.out.println(randomWord +":"+ rpsScoreComp);
                    }
                    if (rpsPlayerInput == 2 && rpsCompInput == 0){
                        System.out.println("Looks like the computer picked rock so you WIN");
                        rpsScorePlayer++;
                        System.out.println( user + ": " + rpsScorePlayer);
                        System.out.println(randomWord +":"+ rpsScoreComp);
                    }
                    if (rpsPlayerInput == 2 && rpsCompInput == 1) {
                        System.out.println("Looks like the computer also picked paper so it a DRAW");
                        System.out.println( user + ": " + rpsScorePlayer);
                        System.out.println(randomWord +":"+ rpsScoreComp);
                    }
                    if (rpsPlayerInput == 2 && rpsCompInput == 2) {
                        System.out.println("Looks like the computer picked scissors so you LOSE");
                        rpsScoreComp++;
                        System.out.println( user + ": " + rpsScorePlayer);
                        System.out.println(randomWord +":"+ rpsScoreComp);
                    }
                    if (rpsPlayerInput == 3 && rpsCompInput == 0) {
                        System.out.println("Looks like the computer picked rock so you LOSE");
                        rpsScoreComp++;
                        System.out.println( user + ": " + rpsScorePlayer);
                        System.out.println(randomWord +":"+ rpsScoreComp);
                    }
                    if (rpsPlayerInput == 3 && rpsCompInput== 1) {
                        System.out.println("Looks like the computer picked paper so you WIN");
                        rpsScorePlayer++;
                        System.out.println( user + ": " + rpsScorePlayer);
                        System.out.println(randomWord +":"+ rpsScoreComp);
                    }
                    if (rpsPlayerInput == 3 && rpsCompInput== 2) {
                        System.out.println("Looks like the computer also picked scissors so it a DRAW");
                        System.out.println( user + ": " + rpsScorePlayer);
                        System.out.println(randomWord +":"+ rpsScoreComp);
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
}
