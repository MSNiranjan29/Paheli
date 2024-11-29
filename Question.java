import java.util.Arrays;

public class Question {
    int id;
    String question;
    String[] optionPane = new String[5];
    String answer;

    public Question(int id, String question, String[] optionPane, String answer) {
        this.id = id;
        this.question = question;
        this.optionPane = optionPane;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptionPane() {
        return optionPane;
    }

    public void setOptionPane(String[] optionPane) {
        this.optionPane = optionPane;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Question ID: ").append(id).append("\n");
        sb.append("Question: ").append(question).append("\n");
        sb.append("Options: ").append(Arrays.toString(optionPane)).append("\n");
        sb.append("Answer: ").append(answer).append("\n");
        return sb.toString();
    }
}
