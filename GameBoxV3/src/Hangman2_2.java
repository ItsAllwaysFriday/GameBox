import java.io.CharArrayWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Hangman2_2 {
    public Hangman2_2() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int hScorePlayer1 = 0;
        int hScorePlayer2 = 0;
        int hLifePlayer1 = 7;
        int hLifePlayer2 = 7;
        int WhoFirst = 2;
        int hRound;
        int upperbound =2;
        String input;
        String input2;
        StringBuilder saved = new StringBuilder();
        StringBuilder saved2 = new StringBuilder();
        char Letters;
        int lengthString;
        char firstLetter;
        char lastLetter;
        int emptySpace;
        int y = 1;
        int x =20;
        boolean end = false;
        boolean hasLetter = false;
        boolean hasLetter2 = false;
        boolean htnbm = false;
        boolean htnbm2 = false;
        System.out.println("Enter the number of rounds you want to play:");
        hRound = Integer.parseInt(scanner.nextLine());
        WhoFirst = random.nextInt(upperbound);
        while (hRound != 0) {

            if (WhoFirst == 0) {
                System.out.println("Player 1 input");
                input = scanner.nextLine();
                while (x >= 0) {
                    System.out.println();
                    x--;
                }
                x=20;
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
                        } else {
                            saved.setCharAt(y, lastLetter);
                        }
                    } else {
                        saved.setCharAt(y, '_');
                    }
                    y++;
                    emptySpace--;
                }
                saved.setCharAt(lengthString - 1, lastLetter);
                System.out.println(saved);

                while (!end) {
                    System.out.println(hLifePlayer2);
                    Letters = scanner.nextLine().charAt(0);
                    for (int i = 0; i < lengthString; i++) {
                        if (Letters == input.charAt(i)) {
                            if (Letters == saved.charAt(i) && htnbm == false) {
                                System.out.println("You have already entered that letter");
                                hScorePlayer2--;
                                hLifePlayer2--;
                                htnbm = true;
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
                x = 20;
                end = false;
                System.out.println("Player 2 input");
                input2 = scanner.nextLine();
                while (x >= 0) {
                    System.out.println();
                    x--;
                }
                lengthString = input2.length();
                firstLetter = input2.charAt(0);
                lastLetter = input2.charAt(lengthString - 1);
                saved2.setLength(lengthString);
                saved2.setCharAt(0, firstLetter);
                emptySpace = lengthString - 2;
                while (emptySpace > 0) {
                    if (input2.charAt(y) == firstLetter || input2.charAt(y) == lastLetter) {
                        if (input2.charAt(y) == firstLetter) {
                            saved2.setCharAt(y, firstLetter);
                        } else {
                            saved2.setCharAt(y, lastLetter);
                        }
                    } else {
                        saved2.setCharAt(y, '_');
                    }
                    y++;
                    emptySpace--;
                }
                saved2.setCharAt(lengthString - 1, lastLetter);
                System.out.println(saved2);

                while (!end) {
                    System.out.println(hLifePlayer1);
                    Letters = scanner.nextLine().charAt(0);
                    for (int i = 0; i < lengthString; i++) {
                        if (Letters == input2.charAt(i) && htnbm2== false) {
                            if (Letters == saved2.charAt(i)) {
                                System.out.println("You have already entered that letter");
                                hScorePlayer1--;
                                hLifePlayer1--;
                                htnbm2 = true;

                            }
                            saved2.setCharAt(i, input2.charAt(i));
                            hScorePlayer1++;
                            hasLetter2 = true;
                            System.out.println(saved2);

                        }

                    }
                    if (!hasLetter2) {
                        System.out.println("The letter you have entered is not present in the word");
                        hLifePlayer1--;
                        hScorePlayer1--;
                    }
                    hasLetter2 = false;
                    if (input2.contentEquals(saved2) || hLifePlayer1 == 0) {
                        end = true;
                    }
                }
            }
            if (WhoFirst == 1) {
                System.out.println("Player 2 input");
                input2 = scanner.nextLine();
                while (x >= 0) {
                    System.out.println();
                    x--;
                }
                lengthString = input2.length();
                firstLetter = input2.charAt(0);
                lastLetter = input2.charAt(lengthString - 1);
                saved2.setLength(lengthString);
                saved2.setCharAt(0, firstLetter);
                emptySpace = lengthString - 2;
                while (emptySpace > 0) {
                    if (input2.charAt(y) == firstLetter || input2.charAt(y) == lastLetter) {
                        if (input2.charAt(y) == firstLetter) {
                            saved2.setCharAt(y, firstLetter);
                        } else {
                            saved2.setCharAt(y, lastLetter);
                        }
                    } else {
                        saved2.setCharAt(y, '_');
                    }
                    y++;
                    emptySpace--;
                }
                saved2.setCharAt(lengthString - 1, lastLetter);
                System.out.println(saved2);

                while (!end) {
                    System.out.println(hLifePlayer1);
                    Letters = scanner.nextLine().charAt(0);
                    for (int i = 0; i < lengthString; i++) {
                        if (Letters == input2.charAt(i)) {
                            if (Letters == saved2.charAt(i) && htnbm2 == false) {
                                System.out.println("You have already entered that letter");
                                hScorePlayer1--;
                                hLifePlayer1--;
                                htnbm2 = true;
                            }
                            saved2.setCharAt(i, input2.charAt(i));
                            hScorePlayer1++;
                            hasLetter2 = true;
                            System.out.println(saved2);

                        }

                    }
                    if (!hasLetter2) {
                        System.out.println("The letter you have entered is not present in the word");
                        hLifePlayer1--;
                        hScorePlayer1--;
                    }
                    hasLetter2 = false;
                    if (input2.contentEquals(saved2) || hLifePlayer1 == 0) {
                        end = true;
                    }
                }
                x = 20;
                end = false;
                System.out.println("Player 1 input");
                input = scanner.nextLine();
                while (x >= 0) {
                    System.out.println();
                    x--;
                }
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
                        } else {
                            saved.setCharAt(y, lastLetter);
                        }
                    } else {
                        saved.setCharAt(y, '_');
                    }
                    y++;
                    emptySpace--;
                }
                saved.setCharAt(lengthString - 1, lastLetter);
                System.out.println(saved);

                while (!end) {
                    System.out.println(hLifePlayer2);
                    Letters = scanner.nextLine().charAt(0);
                    for (int i = 0; i < lengthString; i++) {
                        if (Letters == input.charAt(i)) {
                            if (Letters == saved.charAt(i) && htnbm == false) {
                                System.out.println("You have already entered that letter");
                                hScorePlayer2--;
                                hLifePlayer2--;
                                htnbm = true;
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
            }
            htnbm2 = false;
            htnbm = false;
            hRound--;
        }
    }
}
