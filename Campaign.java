import java.util.Scanner;

public class Campaign {

// Menu Campaign option
    static void campaign(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. CAMPAIGN");
        System.out.println("2. SURVIVAL");

        System.out.println("Select Mode: ");
        int mode = sc.nextInt();

        switch (mode){
            case 1:
                System.out.println("Welcome to the Campaign.");
                break;
            case 2:
                System.out.println("Try to survive as long as you can!");
                break;
            default:
                System.out.println("Wrong input.");
                break;

        }
    }

// Player difficulty choice
    static void options(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Difficulty");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        System.out.println("4. Insane");
        System.out.println();
        System.out.println("Select Difficulty:");
        int difficulty = sc.nextInt();

        switch (difficulty){
            case 1:
                System.out.println("This is too easy.");
                break;
            case 2:
                System.out.println("This is a little more difficult.");
                break;
            case 3:
                System.out.println("Not a walk in the park.");
                break;
            case 4:
                System.out.println("You will not survive!");
                break;
            default:
                System.out.println("Wrong input.");
                break;

        }

    }

    // Extra features that are included in th game
    static void extras(){

        System.out.println("Video Resolution");
        System.out.println("Contrast");
        System.out.println("Controls");
        System.out.println("Audio");
    }

    // XBOX LIVE Store
    static void xboxStore(){
        Scanner sc = new Scanner(System.in);
        System.out.println("---Alien Isolation Content---");
        System.out.println("1. Crew Expendable");
        System.out.println("2. Safe House");
        System.out.println();
        int extras = sc.nextInt();

        switch (extras){
            case 1:
                System.out.println("A story right out of the original Alien movie." +
                        "\nTry to trap the Alien and blow it out of the air lock.");
                break;
            case 2:
                System.out.println("You have 2 hours to complete 10 unique challenges." +
                        "\nThere is only one safe place.");
                break;
            default:
                System.out.println("Wrong input.");
                break;
        }
    }

    // When player is ready to exit the game

    static void quitGame(){
        System.out.println("Thank you for playing.");
    }


}
