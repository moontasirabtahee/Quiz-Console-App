package QuizConsoleApplication;

import java.util.Scanner;

public class QuestionService {

    private Question[] questions = new Question[5];
    private String[] answers = new String[5];
    private int questionCounter = 0;
    Scanner scanner = new Scanner(System.in);
    public QuestionService() {
        questions = new Question[5];
        questions[0] = new Question(1, "What is the capital of India?", "New Delhi", "Mumbai", "Kolkata", "Chennai", "New Delhi");
        questions[1] = new Question(2, "What is the capital of France?", "Paris", "Marseille", "Lyon", "Toulouse", "Paris");
        questions[2] = new Question(3, "What is the capital of Japan?", "Tokyo", "Kyoto", "Osaka", "Yokohama", "Tokyo");
        questions[3] = new Question(4, "What is the capital of Australia?", "Canberra", "Sydney", "Melbourne", "Brisbane", "Canberra");
        questions[4] = new Question(5, "What is the capital of Russia?", "Moscow", "Saint Petersburg", "Novosibirsk", "Yekaterinburg", "Moscow");
    }


    public void playquiz() {
        int i = 0;
        for (Question question : questions) {
            questionCounter++;
            System.out.println("Question " + questionCounter + ": " + question.getQuestion());
            System.out.println("A. " + question.getOpt1());
            System.out.println("B. " + question.getOpt2());
            System.out.println("C. " + question.getOpt3());
            System.out.println("D. " +question.getOpt4());
            
            answers[i++] = scanner.nextLine().toUpperCase();



        }
        
        // for(String answer : answers) {
        //     System.out.println(answer);
        // }
    }

    public void checkAnswers() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {

            //need to replace the answers[i] with the correct answer
            if (answers[i].equals("A")) {
                answers[i] = questions[i].getOpt1();
            } else if (answers[i].equals("B")) {
                answers[i] = questions[i].getOpt2();
            } else if (answers[i].equals("C")) {
                answers[i] = questions[i].getOpt3();
            } else if (answers[i].equals("D")) {
                answers[i] = questions[i].getOpt4();
            }

            if (questions[i].getAnswer().equalsIgnoreCase(answers[i])) {
                score++;
            }
        }
        System.out.println("Your score is: " + score + "/" + questions.length);
    }

}