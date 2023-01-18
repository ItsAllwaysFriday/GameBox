import java.util.Scanner;

public class RPS_1_2 {
    public RPS_1_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Multi-player Rock, Paper, Scissors");
        int rpsScorePlayer = 0;
        int rpsScorePlayer2 = 0;
        int rpsRounds;
        int rpsRunner = 1;
        int rpsPlayerInput ;
        int rpsPlayer2Input;

        while (rpsRunner == 1) {
            System.out.println("Player 1 choose nickname:");
            String user = scanner.nextLine();

            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println( "Hi "+ user);
            System.out.println("Player 2 choose nickname:");
            String user2 = scanner.nextLine();


            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");

            System.out.println( "Hi "+ user2);

            System.out.println("Choose how many rounds you want to play");
            System.out.println("Enter an odd number");
            rpsRounds = Integer.parseInt(scanner.nextLine());
            if (rpsRounds % 2 != 0) {
                while (rpsRounds > 0) {
                    System.out.println("Enter: '1' for Rock, '2' for Paper, '3' for Scissors");
                    rpsPlayerInput = Integer.parseInt(scanner.nextLine());
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");




                    if (rpsPlayerInput > 3 || rpsPlayerInput < 1 ) {
                        System.out.println("Wrong input. Error505. U STUPID! Try again cabron.");
                        System.out.println("Enter: '1' for Rock, '2' for Paper, '3' for Scissors");
                        rpsPlayerInput = Integer.parseInt(scanner.nextLine());
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");


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
                        System.out.println(user + ": " +rpsScorePlayer);
                        System.out.println(user2 + ": " +rpsScorePlayer2);
                    }
                    if (rpsPlayerInput == 1 && rpsPlayer2Input == 2){
                        System.out.println("Looks like Player 1 picked rock so Player 2 WINS");
                        rpsScorePlayer2++;
                        System.out.println(user + ": " + rpsScorePlayer);
                        System.out.println(user2 + ": " +rpsScorePlayer2);
                    }
                    if (rpsPlayerInput == 1 && rpsPlayer2Input == 3){
                        System.out.println("Looks like Player 2 picked scissors so Player 1 WINS");
                        rpsScorePlayer++;
                        System.out.println(user + ": " + rpsScorePlayer);
                        System.out.println(user2 + ": " +rpsScorePlayer2);
                    }
                    if (rpsPlayerInput == 2 && rpsPlayer2Input == 1){
                        System.out.println("Looks like Player 2 picked rock so Player 1 WINS");
                        rpsScorePlayer++;
                        System.out.println(user + ": " + rpsScorePlayer);
                        System.out.println(user2 + ": " +rpsScorePlayer2);
                    }
                    if (rpsPlayerInput == 2 && rpsPlayer2Input == 2) {
                        System.out.println("Looks like Player 2 also picked paper so it a DRAW");
                        System.out.println(user + ": " + rpsScorePlayer);
                        System.out.println(user2 + ": " +rpsScorePlayer2);
                    }
                    if (rpsPlayerInput == 2 && rpsPlayer2Input == 3) {
                        System.out.println("Looks like Player 1 picked paper so Player 2 WINS");
                        rpsScorePlayer2++;
                        System.out.println(user + ": " + rpsScorePlayer);
                        System.out.println(user2 + ": " +rpsScorePlayer2);
                    }
                    if (rpsPlayerInput == 3 && rpsPlayer2Input == 1) {
                        System.out.println("Looks like Player 1 picked scissors so Player 2 WINS");
                        rpsScorePlayer2++;
                        System.out.println(user + ": " + rpsScorePlayer);
                        System.out.println(user2 + ": " +rpsScorePlayer2);
                    }
                    if (rpsPlayerInput == 3 && rpsPlayer2Input== 2) {
                        System.out.println("Looks like Player 2 picked paper so Player 1 WINS");
                        rpsScorePlayer++;
                        System.out.println(user + ": " + rpsScorePlayer);
                        System.out.println(user2 + ": " +rpsScorePlayer2);
                    }
                    if (rpsPlayerInput == 3 && rpsPlayer2Input== 3) {
                        System.out.println("Looks like Player 2 also picked scissors so it a DRAW");
                        System.out.println(user + ": " + rpsScorePlayer);
                        System.out.println(user2 + ": " +rpsScorePlayer2);
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
}
