import java.util.Scanner;
public class Zodyak {
    public static void main(String[] args) {
        int dogumYili;

        Scanner input = new Scanner(System.in);

        System.out.println("When were you born? ");
        dogumYili = input.nextInt();

        if (dogumYili %12 == 0) {
            System.out.println("Your zodiac sign is Monkey. " );
        }
        else if (dogumYili %12 == 1) {
            System.out.println("Your zodiac sign is Rooster. " );
        }
        else if (dogumYili %12 == 2) {
            System.out.println("Your zodiac sign is Dog. " );
        }
        else if (dogumYili %12 == 3) {
            System.out.println("Your zodiac sign is Pig. " );
        }
        else if (dogumYili %12 == 4) {
            System.out.println("Your zodiac sign is Rat. " );
        }
        else if (dogumYili %12 == 5) {
            System.out.println("Your zodiac sign is Ox. " );
        }
        else if (dogumYili %12 == 6) {
            System.out.println("Your zodiac sign is Tiger. " );
        }
        else if (dogumYili %12 == 7) {
            System.out.println("Your zodiac sign is Rabbit. " );
        }
        else if  (dogumYili %12 == 8){
            System.out.println("Your zodiac sign is Dragon. " );
        }
        else if (dogumYili %12 == 9) {
            System.out.println("Your zodiac sign is Snake. " );
        }
        else if (dogumYili %12 == 10) {
            System.out.println("Your zodiac sign is Horse. " );
        }
        else if (dogumYili %12 == 11) {
            System.out.println("Your zodiac sign is Sheep. " );
        }
        else {
            System.out.println( "You put numbers wrong!!!!");
        }
    }
}
