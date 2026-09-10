public class Question {

    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    String correctAnswer;
    String funFact;
    String category;

    public Question(String question, String optionA, String optionB,
                    String optionC, String optionD,
                    String correctAnswer, String funFact,
                    String category) {

        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAnswer = correctAnswer;
        this.funFact = funFact;
        this.category = category;
    }
}