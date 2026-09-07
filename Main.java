import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question(
                "Which planet has a day longer than its year?",
                "A. Earth",
                "B. Venus",
                "C. Mars",
                "D. Jupiter",
                "B",
                "A day on Venus lasts about 243 Earth days, while its year lasts about 225 Earth days!"
        ));

        questions.add(new Question(
                "Which animal has three hearts?",
                "A. Elephant",
                "B. Tiger",
                "C. Octopus",
                "D. Penguin",
                "C",
                "An octopus has three hearts and blue blood!"
        ));

        questions.add(new Question(
                "Which fruit is technically a berry?",
                "A. Apple",
                "B. Banana",
                "C. Orange",
                "D. Strawberry",
                "B",
                "Botanically, bananas are berries, while strawberries are not technically berries!"
        ));

        questions.add(new Question(
                "Which animal can sleep while swimming?",
                "A. Dolphin",
                "B. Lion",
                "C. Elephant",
                "D. Kangaroo",
                "A",
                "Dolphins can rest one half of their brain while the other half stays active!"
        ));

        questions.add(new Question(
                "Which animal has fingerprints surprisingly similar to humans?",
                "A. Koala",
                "B. Giraffe",
                "C. Penguin",
                "D. Crocodile",
                "A",
                "Koala fingerprints are so similar to human fingerprints that they can look surprisingly alike!"
        ));

        System.out.println("====================================");
        System.out.println("       🌍 FUN FACTS QUIZ 🌍");
        System.out.println("====================================");
        System.out.println("Ready to test your brain? 😏🔥");

        for (Question q : questions) {

            System.out.println("\n------------------------------------");
            System.out.println("❓ " + q.question);
            System.out.println("------------------------------------");

            System.out.println(q.optionA);
            System.out.println(q.optionB);
            System.out.println(q.optionC);
            System.out.println(q.optionD);

            System.out.print("\n👉 Your answer: ");
            String answer = scanner.nextLine().trim().toUpperCase();

            if (answer.equals(q.correctAnswer)) {

                System.out.println("\n🔥🔥 WOW! YOU CRACKED IT! 🔥🔥");
                System.out.println("🎉 That's absolutely correct! 😎");

            } else {

                System.out.println("\n😢 OHHH NOOO! 😭");
                System.out.println("❌ Not this time!");
                System.out.println("✅ Correct answer: " + q.correctAnswer);
                System.out.println("💡 Fun Fact: " + q.funFact);
            }
        }

        System.out.println("\n====================================");
        System.out.println("       🎉 QUIZ COMPLETED! 🎉");
        System.out.println("====================================");

        scanner.close();
    }
}