package QuizConsoleApplication;

public class Main {
    public static void main(String[] args) {
        QuestionService questionService = new QuestionService();
        questionService.playquiz();
        questionService.checkAnswers();
        

    }
}
