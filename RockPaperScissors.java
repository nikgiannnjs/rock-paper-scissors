import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Let's play rock, paper, scissors.");
        System.out.println("When I say 'shoot' choose rock, paper or scissors.");
        System.out.println("Are you ready? Type 'yes' if you are.");

        String toStart = input.nextLine();

        if(toStart.equalsIgnoreCase("yes")){
            System.out.println("Great!");

            boolean game = true;
            int computerScore = 0;
            int userScore = 0;

            while(game){
            if(userScore > 0 || computerScore > 0){
                System.out.println("Again");
            }
            
            System.out.println("rock - paper - scissors, shoot");
            String userChoice = input.nextLine();
            String computerChoice = computerChoice();

            System.out.println("Me: " + computerChoice);
            System.out.println("You: " + userChoice);

            if(computerChoice.equalsIgnoreCase("Rock") && userChoice.equalsIgnoreCase("Scissors")){
                System.out.println("I won.");
                computerScore += 1;
            }else if(computerChoice.equalsIgnoreCase("Rock") && userChoice.equalsIgnoreCase("Paper")){
                System.out.println("You won.");
                userScore += 1;
            } else if(computerChoice.equalsIgnoreCase("Paper") && userChoice.equalsIgnoreCase("Rock")){
                System.out.println("I won");
                computerScore += 1;
            } else if (computerChoice.equalsIgnoreCase("Paper") && userChoice.equalsIgnoreCase("Scissors")){
                System.out.println("You won.");
                userScore += 1;
            } else if(computerChoice.equalsIgnoreCase("Scissors") && userChoice.equalsIgnoreCase("Rock")){
                System.out.println("You won.");
                userScore += 1;
            } else if(computerChoice.equalsIgnoreCase("Scissors") && userChoice.equalsIgnoreCase("Paper")){
                System.out.println("I won");
                computerScore += 1;
            }else if(computerChoice.equalsIgnoreCase("Scissors") && userChoice.equalsIgnoreCase("Scissors")){
                System.out.println("Draw!");
            }else if(computerChoice.equalsIgnoreCase("Rock") && userChoice.equalsIgnoreCase("Rock")){
                System.out.println("Draw!");
            }else if(computerChoice.equalsIgnoreCase("Paper") && userChoice.equalsIgnoreCase("Paper")){
                System.out.println("Draw!");
            }

            if(userScore == 3){
                System.out.println(computerScore + "-" + userScore);
                System.out.println("You won the game.");
                game = false;
            } else if(computerScore == 3){
                System.out.println(computerScore + "-" + userScore);
                System.out.println("I won the game.");
                game = false;
            } else {
                System.out.println(computerScore + "-" + userScore);
                game = true;
            }
            }
        }
    }

    public static String computerChoice() {
        int choice = (int)(Math.random() * 3) + 1;

        switch(choice){
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid choice";
        }
    };
}