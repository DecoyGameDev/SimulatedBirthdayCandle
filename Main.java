import java.util.Scanner;

public class Main {
    // --CATEGORY'S--


    public static void RomanticWish(){
        System.out.println("Oooh! Whats your gender?!");
        Scanner gender_romantic_wish_scanner = new Scanner (System.in);
        System.out.println("1. Male (attracted to women)");
        System.out.println("2. Female (attracted to men)");
        System.out.println("3. Other/Undefined/Non-Binary");
        int romantic_wish_gender = gender_romantic_wish_scanner.nextInt();
        if (romantic_wish_gender == 1){
            Scanner male_wish_scanner = new Scanner(System.in);
            System.out.println("1. I want her to be my girlfriend.");
            System.out.println("2. I plan on proposing to her.");
            System.out.println("3. I love her a lot, and give her this wish.");
            int male_selection = male_wish_scanner.nextInt();
            System.out.println("Go get her!");
        }
        if (romantic_wish_gender == 2){
            Scanner woman_wish_scanner = new Scanner(System.in);
            System.out.println("1. I want him to be my boyfriend.");
            System.out.println("2. I plan on proposing to him.");
            System.out.println("3. I love him a lot, and give him this wish.");
            int female_selection = woman_wish_scanner.nextInt();
            System.out.println("Go get him!");
        }
        if (romantic_wish_gender == 3){
            Scanner undefined_wish_scanner = new Scanner(System.in);
            System.out.println("1. I want them to be in a relationship with me.");
            System.out.println("2. I plan on proposing to them.");
            System.out.println("3. I love them a lot, and give them this wish.");
            int undefined_selection = undefined_wish_scanner.nextInt();
            System.out.println("Go get them!");
        }
    }
    public static void HappyWish(){
        System.out.println("So, whats your happy wish!");
        System.out.println("1. I am grateful for somebody");
        System.out.println("2. I happy to be alive!");
        System.out.println("3. I want to forever enjoy the fruits of life!");
        Scanner happywish_scanner = new Scanner(System.in);
        int choice_happywish = happywish_scanner.nextInt();
        System.out.println("Thanks for choosing! Happy Birthday!");
    }
    public static void CoolWish(){
        System.out.println("A cool wish!");
        System.out.println("That's pretty cool man.");
        System.out.println("Whats your cool wish?");
        Scanner coolwish_scanner = new Scanner(System.in);
        System.out.println("1. I want a specific gift.");
        System.out.println("2. I want somebody to give me cash.");
        System.out.println("3. I want to eat good food!");
        int CoolWishChoice = coolwish_scanner.nextInt();
        System.out.println("Nice choice! Happy birthday!");
    }

    public static void MorbidWish(){
        System.out.println("Woah, your kinda creepy and emo...");
        System.out.println("Whats your 'morbid' wish then?");
        Scanner morbidwish_scanner = new Scanner(System.in);
        System.out.println("1. I want somebody dead.");
        System.out.println("2. I want to fight somebody.");
        System.out.println("3. I want somebody in jail.");
        int morbidwish_choice = morbidwish_scanner.nextInt();
        if (morbidwish_choice == 1){
            System.out.println("Somebody dead?! Kinda creepy, anyway Happy Birthday!");
        }
        if (morbidwish_choice == 2){
            System.out.println("I hope you win that fight! Happy Birthday!");
        }
        if (morbidwish_choice == 3) {
            System.out.println("I hope you get your justice! Happy Birthday!");
        }
    }

    // MAIN
    public static void main(String[] args) {
        // MAIN LOGIC
        Scanner birthdaycandlescanner = new Scanner(System.in);
        System.out.println("Your simulated birthday candle is now running...");
        System.out.println("What is your wish? (Select category.)");
        System.out.println("1. Cool Wish");
        System.out.println("2. Morbid Wish");
        System.out.println("3. Happy Wish");
        System.out.println("4. Romantic Wish");
        // CHOICE SELECTION
        int choice = birthdaycandlescanner.nextInt();
        if (choice == 1){
            CoolWish();
        }
        if (choice == 2){
            MorbidWish();
        }
        if (choice == 3){
            HappyWish();
        }
        if (choice == 4){
            RomanticWish();
        }
    }
}
