import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Question> questions = new ArrayList<>();

        // ==============================
        // 🌌 SPACE QUESTIONS
        // ==============================

        questions.add(new Question(
                "Which planet has a day longer than its year?",
                "A. Earth",
                "B. Venus",
                "C. Mars",
                "D. Jupiter",
                "B",
                "A day on Venus lasts about 243 Earth days, while its year lasts about 225 Earth days!",
                "Space"
        ));

        questions.add(new Question(
                "Which planet is known for its beautiful rings?",
                "A. Mercury",
                "B. Venus",
                "C. Saturn",
                "D. Mars",
                "C",
                "Saturn's rings are made mostly of ice and rocky particles!",
                "Space"
        ));

        questions.add(new Question(
                "Which planet is the largest in our Solar System?",
                "A. Earth",
                "B. Jupiter",
                "C. Saturn",
                "D. Neptune",
                "B",
                "Jupiter is so large that more than 1,300 Earths could fit inside it!",
                "Space"
        ));

        questions.add(new Question(
                "What is the hottest planet in our Solar System?",
                "A. Mercury",
                "B. Venus",
                "C. Mars",
                "D. Jupiter",
                "B",
                "Venus is hotter than Mercury because its thick atmosphere traps heat!",
                "Space"
        ));

        questions.add(new Question(
                "What is the name of our galaxy?",
                "A. Andromeda",
                "B. Whirlpool",
                "C. Milky Way",
                "D. Sombrero",
                "C",
                "Our Solar System is located in the Milky Way galaxy!",
                "Space"
        ));


        // ==============================
        // 🐾 ANIMAL QUESTIONS
        // ==============================

        questions.add(new Question(
                "Which animal has three hearts?",
                "A. Elephant",
                "B. Tiger",
                "C. Octopus",
                "D. Penguin",
                "C",
                "An octopus has three hearts and blue blood!",
                "Animals"
        ));

        questions.add(new Question(
                "Which animal has fingerprints surprisingly similar to humans?",
                "A. Koala",
                "B. Giraffe",
                "C. Crocodile",
                "D. Penguin",
                "A",
                "Koala fingerprints can look surprisingly similar to human fingerprints!",
                "Animals"
        ));

        questions.add(new Question(
                "Which animal is known for changing its color to blend into its surroundings?",
                "A. Chameleon",
                "B. Zebra",
                "C. Elephant",
                "D. Kangaroo",
                "A",
                "Chameleons can change their skin color for communication and environmental responses!",
                "Animals"
        ));

        questions.add(new Question(
                "Which is the largest animal on Earth?",
                "A. Elephant",
                "B. Blue Whale",
                "C. Giraffe",
                "D. Great White Shark",
                "B",
                "The blue whale is the largest known animal to have ever lived!",
                "Animals"
        ));

        questions.add(new Question(
                "Which bird is famous for being unable to fly?",
                "A. Eagle",
                "B. Sparrow",
                "C. Penguin",
                "D. Falcon",
                "C",
                "Penguins cannot fly through the air, but they are excellent swimmers!",
                "Animals"
        ));


        // ==============================
        // 🧠 HUMAN BODY QUESTIONS
        // ==============================

        questions.add(new Question(
                "What is the largest organ in the human body?",
                "A. Heart",
                "B. Brain",
                "C. Skin",
                "D. Liver",
                "C",
                "Your skin is the largest organ of the human body!",
                "Human Body"
        ));

        questions.add(new Question(
                "How many bones does an average adult human have?",
                "A. 106",
                "B. 206",
                "C. 306",
                "D. 406",
                "B",
                "Most adults have 206 bones, although the exact number can vary slightly!",
                "Human Body"
        ));

        questions.add(new Question(
                "Which organ pumps blood around the body?",
                "A. Brain",
                "B. Liver",
                "C. Heart",
                "D. Lung",
                "C",
                "Your heart beats around 100,000 times a day on average!",
                "Human Body"
        ));

        questions.add(new Question(
                "Which part of the body controls balance?",
                "A. Cerebellum",
                "B. Stomach",
                "C. Liver",
                "D. Kidney",
                "A",
                "The cerebellum plays an important role in balance, coordination, and movement!",
                "Human Body"
        ));

        questions.add(new Question(
                "Which organ is mainly responsible for filtering waste from the blood?",
                "A. Heart",
                "B. Kidneys",
                "C. Brain",
                "D. Stomach",
                "B",
                "Your kidneys filter your blood and help remove waste through urine!",
                "Human Body"
        ));


        // ==============================
        // 🎮 QUIZ INTRO
        // ==============================

        System.out.println("====================================");
        System.out.println("       🌍 FUN FACTS QUIZ 🌍");
        System.out.println("====================================");

        System.out.println("\nChoose your category:");
        System.out.println("1. 🌌 Space");
        System.out.println("2. 🐾 Animals");
        System.out.println("3. 🧠 Human Body");

        System.out.print("\n👉 Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        String selectedCategory;

        switch (choice) {

            case 1:
                selectedCategory = "Space";
                break;

            case 2:
                selectedCategory = "Animals";
                break;

            case 3:
                selectedCategory = "Human Body";
                break;

            default:
                selectedCategory = "Space";
                System.out.println("\n⚠️ Invalid choice!");
                System.out.println("🌌 Space selected by default.");
        }


        // ==============================
        // 🔎 FILTER QUESTIONS
        // ==============================

        ArrayList<Question> selectedQuestions = new ArrayList<>();

        for (Question q : questions) {

            if (q.category.equals(selectedCategory)) {
                selectedQuestions.add(q);
            }
        }


        // ==============================
        // 🏆 QUIZ
        // ==============================

        int score = 0;
        int questionNumber = 1;

        System.out.println("\n====================================");
        System.out.println("      🎮 " + selectedCategory + " QUIZ");
        System.out.println("====================================");

        for (Question q : selectedQuestions) {

            System.out.println("\n🔥 Question " + questionNumber
                    + " of " + selectedQuestions.size());

            System.out.println("\n❓ " + q.question);
            System.out.println("------------------------------------");

            System.out.println(q.optionA);
            System.out.println(q.optionB);
            System.out.println(q.optionC);
            System.out.println(q.optionD);

            System.out.print("\n👉 Your answer: ");

            String answer = scanner.nextLine().trim().toUpperCase();

            if (answer.equals(q.correctAnswer)) {

                score++;

                System.out.println("\n🔥🔥 WOW! YOU CRACKED IT! 🔥🔥");
                System.out.println("🎉 That's absolutely correct! 😎");
                System.out.println("🏆 +1 point!");
                System.out.println("📊 Current Score: " + score);

            } else {

                System.out.println("\n😢 OHHH NOOO! 😭");
                System.out.println("❌ Not this time!");
                System.out.println("✅ Correct answer: " + q.correctAnswer);
                System.out.println("💡 Fun Fact: " + q.funFact);
            }

            questionNumber++;
        }


        // ==============================
        // 🎉 FINAL RESULT
        // ==============================

        System.out.println("\n====================================");
        System.out.println("       🎉 QUIZ COMPLETED! 🎉");
        System.out.println("====================================");

        System.out.println("\n🏆 Your Final Score: "
                + score + "/" + selectedQuestions.size());

        if (score == selectedQuestions.size()) {

            System.out.println("🔥🔥 PERFECT SCORE! YOU ARE UNSTOPPABLE! 🔥🔥");

        } else if (score >= selectedQuestions.size() / 2) {

            System.out.println("😎 Nice job! You cracked most of them! 🔥");

        } else {

            System.out.println("😅 Keep going! Your brain needs another round! 🧠🔥");
        }

        scanner.close();
    }
}