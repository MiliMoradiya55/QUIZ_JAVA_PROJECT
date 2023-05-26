import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
    private String question;
    private List<String> options;
    private int correctOption;

    public Question(String question, List<String> options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectOption() {
        return correctOption;
    }
}

class QuizManager {
    private List<Question> questions;

    public QuizManager() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (Question question : questions) {
            System.out.println(question.getQuestion());
            List<String> options = question.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }

            System.out.print("Enter your answer (1-" + options.size() + "): ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == question.getCorrectOption()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
            System.out.println();
        }

        System.out.println("Quiz completed. Your score: " + score + "/" + questions.size());
    }
}

class quiz_project {
    public static void main(String[] args) {
        // Create quiz questions
        Question question1 = new Question("What is the capital of France?",
                List.of("London", "Paris", "Berlin", "Rome"), 2);
        Question question2 = new Question("Which planet is known as the Red Planet?",
                List.of("Mars", "Jupiter", "Saturn", "Neptune"), 1);

        // Create a quiz manager
        QuizManager quizManager = new QuizManager();
        quizManager.addQuestion(question1);
        quizManager.addQuestion(question2);

        // Start the quiz
        quizManager.startQuiz();
    }
}