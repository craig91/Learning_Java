public class Conditionals {
    public static void main(String[] args){

        if (1 < 4 && 0 > 5){
            // If 1 is less than 4 and 0 greater than 5
            System.out.println("You ordered a cup of hot, mint tea.");

        } else if ( 21 <= 19 || 17 >= 28) {
            // if 21 is less than or equal to 19 or (||) if 17 is greater than or equal to 28
            System.out.println(" You ordered freshly squeezed orange juice!");

        } else if ( !(true == true) ) {
            // true == true == true but the ! boolean operator makes the result opposite, this making this false
            System.out.println( "You ordered hot cocoa!");

        } else {
            // if none of these operations check out, print this.
            System.out.println( "You ordered a cup of Java!");
        }

        char answerChoice = 'c';

        switch (answerChoice) {
            
            case 'A': System.out.println("You answered: " + answerChoice + ". Please try again.");
            break;

            case 'B': System.out.println("You answered: " + answerChoice + ". Please try again.");
            break;

            case 'C': System.out.println("You answered: " + answerChoice + ". Please try again.");
            break;

            case 'D': System.out.println("You answered: " + answerChoice + ". Please try again.");
            break;

            default:
              System.out.println(" Please select a valid answer choice.");
        }
    }
}