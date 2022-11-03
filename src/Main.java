import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Define the arrays containing all the questions and answers
        int score = 0;
        int correctAnswers = 0;
        String[] questions = new String[5];
        questions[0] = "Which was the first mob in Minecraft?";
        questions[1] = "What was the first block in Minecraft?";
        questions[2] = "What was Minecraft originally called?";
        questions[3] = "Which was the first flying mob in Minecraft? (excluding chickens)";
        questions[4] = "Which is the only mob that starts with 'O' in Minecraft?";
        String[] answers = new String[5];
        answers[0] = "human";
        answers[1] = "cobblestone";
        answers[2] = "cave game";
        answers[3] = "ghast";
        answers[4] = "ocelot";
        int[] points = new int[5];
        points[0] = 10;
        points[1] = 10;
        points[2] = 10;
        points[3] = 15;
        points[4] = 5;

        // Start the game
        System.out.println("Welcome to Minecraft Trivia!\nIn this game, you will be given Minecraft-related questions which you will have to answer to gain points. Easier questions will earn you less points, while harder ones will earn you more. Good luck!");
        while(true) {
            TimeUnit.SECONDS.sleep(1);
            for(int i = 0; i < questions.length; i ++) {
                System.out.println("\n" + questions[i]);
                if(getInput(answers[i])) {
                    score += points[i];
                    correctAnswers ++;
                    System.out.println("Correct! You now have " + score + " points.");
                } else {
                    System.out.println("Incorrect! The answer was " + answers[i] + ".");
                }
                TimeUnit.SECONDS.sleep(1);
            }
            System.out.println("Your final score is " + score + ". You got " + correctAnswers + " out of the " + questions.length + " questions correct.");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Do you want to play again?");
            if(getInput("yes")) {
            } else {
                System.out.println("Thank you for playing Minecraft Trivia.");
                break;
            }
        }
    }
    public static boolean getInput(String answer) {
        // Get the user's answer, and check if it is correct
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase().contains(answer);
    }
}