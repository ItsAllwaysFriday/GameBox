import java.util.Scanner;
public class Hangman2_2 {
    public Hangman2_2() {
        Scanner scanner = new Scanner(System.in);
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
}
