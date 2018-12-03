import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {


        String chosenWord;
        String player1;
        String player2;
        String again;
        String wrongNumber;
        String guessedNumber;
        String currentGuessbreakdown;
        String breakdownphrase;

        Scanner keyboard;

        int minimumWordCount;
        int maximumWordCount;
        int numberMisses = 0;


        minimumWordCount = 2;

        keyboard = new Scanner(System.in);
        do {
            again = "";
            for (int i = 0; i <= 15; i++) {

                System.out.println("Hello! Welcome to Hangman.");
                System.out.println("The rules are simple, you have 15 tries to guess the correct words/phrase.");
                System.out.println("If you don't guess the right words/phrase in the correct amount or tries, you lose.");
                System.out.println("If you guess the right words/phrase in the correct amount of tries, you win.");
                System.out.println("So, what is your name?");
                player1 = keyboard.nextLine();
                System.out.println("Well, " + player1 + " what word would you like to choose?");
                chosenWord = keyboard.nextLine().toLowerCase();

                //System.out.println(displayHangman(i));
                //System.out.println(chosenWord);
                currentGuessbreakdown = breakdownphrase(chosenWord);
                for (String tempWord : currentGuessbreakdown) {
                    for (int i = 0; i < tempWord.length(); i++) {
                        System.out.println("_");
                    }
                    System.out.println(" ");

                }

            }


        }


    }


    public static int chooseDifficulty (Scanner keyboard){
        switch (keyboard.nextInt()) {
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 6;
            default:
                return 2;

            {


    }

    public static void displayHangman(int tries){
        switch(tries){
            case 0:
            default:
                System.out.println("+--------+");
                System.out.println("|        |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                break;

            case 1:
                System.out.println("+--------+");
                System.out.println("|        |");
                System.out.println("O        |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                break;

            case 2:
                System.out.println("+--------+");
                System.out.println("|        |");
                System.out.println("O        |");
                System.out.println("|        |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                break;

            case 3:
                System.out.println("+--------+");
                System.out.println("|        |");
                System.out.println("O        |");
                System.out.println("|        |");
                System.out.println("|        |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                break;

            case 4:
                System.out.println("+--------+");
                System.out.println("|        |");
                System.out.println("O        |");
                System.out.println("|\\       |");
                System.out.println("|        |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                break;

            case 5:
                System.out.println("+--------+");
                System.out.println("  |      |");
                System.out.println("  O      |");
                System.out.println(" /|\\     |");
                System.out.println("  |      |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                break;

            case 6:
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  O        |");
                System.out.println(" /|\\       |");
                System.out.println("  |        |");
                System.out.println("  |        |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                break;

            case 7:
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  O        |");
                System.out.println(" /|\\       |");
                System.out.println("/ |        |");
                System.out.println("  |        |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                break;

            case 8:
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  O        |");
                System.out.println(" /|\\       |");
                System.out.println("/ | \\      |");
                System.out.println("  |        |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                break;

            case 9:
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  O        |");
                System.out.println(" /|\\       |");
                System.out.println("/ | \\      |");
                System.out.println("  |        |");
                System.out.println(" /         |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                break;

            case 10:
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  O        |");
                System.out.println(" /|\\       |");
                System.out.println("/ | \\      |");
                System.out.println("  |        |");
                System.out.println(" / \\       |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                break;

            case 11:
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  O        |");
                System.out.println(" /|\\       |");
                System.out.println("/ | \\      |");
                System.out.println("  |        |");
                System.out.println(" / \\       |");
                System.out.println("|          |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                break;

            case 12:
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  O        |");
                System.out.println(" /|\\       |");
                System.out.println("/ | \\      |");
                System.out.println("  |        |");
                System.out.println(" / \\       |");
                System.out.println("|   |      |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                break;

            case 13:
                System.out.println("   +--------+");
                System.out.println("   |        |");
                System.out.println("   O        |");
                System.out.println("  /|\\       |");
                System.out.println(" / | \\      |");
                System.out.println("   |        |");
                System.out.println("  / \\       |");
                System.out.println(" |   |      |");
                System.out.println("_|          |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("            |");
                break;

            case 14:
                System.out.println("   +--------+");
                System.out.println("   |        |");
                System.out.println("   O        |");
                System.out.println("  /|\\       |");
                System.out.println(" / | \\      |");
                System.out.println("   |        |");
                System.out.println("  / \\       |");
                System.out.println(" |   |      |");
                System.out.println("_|   |_     |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("            |");
                break;

            case 15:
                System.out.println("   +--------+");
                System.out.println("   |        |");
                System.out.println("   O        |");
                System.out.println("  /|\\       |");
                System.out.println(" / | \\      |");
                System.out.println("   |        |");
                System.out.println("  / \\       |");
                System.out.println(" |   |      |");
                System.out.println("_|   |_     |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("            |");
                break;





        }

        }




    }

