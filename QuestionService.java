import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class QuestionService {
    Question[] questions = new Question[10];
    String[] selection = new String[10];

    public QuestionService() {
        questions[0] = new Question(1, "What is the capital of India?", 
            new String[]{"New Delhi", "Mumbai", "Kolkata", "Chennai", "Bengaluru"}, "New Delhi");
        questions[1] = new Question(2, "Who is known as the Father of the Nation in India?", 
            new String[]{"Jawaharlal Nehru", "Subhash Chandra Bose", "Mahatma Gandhi", "Dr. B.R. Ambedkar", "Sardar Patel"}, "Mahatma Gandhi");
        questions[2] = new Question(3, "What is the national animal of India?", 
            new String[]{"Lion", "Elephant", "Peacock", "Tiger", "Leopard"}, "Tiger");
        questions[3] = new Question(4, "Which river is known as the Ganga of the South?", 
            new String[]{"Godavari", "Krishna", "Kaveri", "Mahanadi", "Brahmaputra"}, "Kaveri");
        questions[4] = new Question(5, "Who was the first Prime Minister of India?", 
            new String[]{"Indira Gandhi", "Rajendra Prasad", "Jawaharlal Nehru", "Mahatma Gandhi", "Sardar Patel"}, "Jawaharlal Nehru");
        questions[5] = new Question(6, "What is the national flower of India?", 
            new String[]{"Rose", "Marigold", "Lotus", "Sunflower", "Tulip"}, "Lotus");
        questions[6] = new Question(7, "Who wrote the Indian national anthem?", 
            new String[]{"Rabindranath Tagore", "Bankim Chandra Chatterjee", "Sarojini Naidu", "Mahatma Gandhi", "Subhash Chandra Bose"}, "Rabindranath Tagore");
        questions[7] = new Question(8, "What is the national sport of India?", 
            new String[]{"Cricket", "Hockey", "Football", "Kabaddi", "Badminton"}, "Hockey");
        questions[8] = new Question(9, "Which is the largest state in India by area?", 
            new String[]{"Maharashtra", "Uttar Pradesh", "Rajasthan", "Madhya Pradesh", "Andhra Pradesh"}, "Rajasthan");
        questions[9] = new Question(10, "Which festival is known as the Festival of Lights?", 
            new String[]{"Holi", "Diwali", "Eid", "Navratri", "Pongal"}, "Diwali");
    }

    public void playQuiz()throws IOException {
        int i=0;
        for (Question q : questions) {
            System.out.println("Question No:"+ q.getId());
            System.out.println(q.getQuestion());
            System.out.println(Arrays.toString(q.optionPane));

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            selection[i]=br.readLine().trim();
            i++;
        }
        for(String S : selection){
            System.out.println(S);
        }
    }
}
