import java.util.*;

class Question {
    private String question;
    private List<String> options;
    private int answer;

    public Question(String question, List<String> options, int answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public String get_Question() {
        return question;
    }

    public List<String> get_Options() {
        return options;
    }

    public int get_Answer() {
        return answer;
    }
}

class Quiz {
    private List<Question> questions;

    public Quiz() {
        this.questions = new ArrayList<>();
    }

    public void add_Question(Question question) {
        questions.add(question);
    }

    public void start_Quiz() {
        int Result = 0;
        Scanner sc = new Scanner(System.in);

        for (Question q : questions) {
            System.out.println("\n" + q.get_Question());
            List<String> options = q.get_Options();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }
            System.out.print("\n***************CHOOSE YOUR ANSWER*************** (1-" + options.size() + "): ");

            int userChoice = sc.nextInt();
            if (userChoice == q.get_Answer()) {
                Result++;
            }
        }

        System.out.println("************************QUIZ COMPLETED!!!!!!*****************");
        System.out.println();
        System.out.println("****************YOUR RESULT IS DISPLAY**************" + "\n" + "YOUR RESULT IS:-" + Result
                + "/" + questions.size());
    }
}

class QuizProject {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        int ch;
        System.out.println(
                "********************************WELCOME THE QUIZ MANAGEMENT SYSTEM***************************");
        System.out.println();
        System.out.println("1.)GENERAL KNOWLEDGE QUIZ");
        System.out.println();
        System.out.println("2.)COMPUTER LANGUAGE QUIZ");
        System.out.println();
        System.out.println("3.)SPORTS QUIZ");
        System.out.println();

        // Create questions
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTHE YOUR CHOICE PLAY THE QUIZ:");
        ch = sc.nextInt();
        System.out.println();

        switch (ch) {
            case 1: {
                System.out.println("**************GENERAL KNOWLEDGE QUIZ*****************");
                System.out.println();
                Question q1 = new Question("Grand Central Terminal, Park Avenue, New York is the world's?",
                        List.of("largest railway station", "highest railway station", "longest railway station",
                                "None of the above"),
                        1);
                Question q2 = new Question("For which of the following disciplines is Nobel Prize awarded?",
                        List.of("Physics and Chemistry", "Physiology or Medicine", "Literature, Peace and Economics",
                                "All of the above"),
                        4);
                Question q3 = new Question("The great Victoria Desert is located in",
                        List.of("Canada", "West Africa", "Australia", "North America"), 3);
                Question q4 = new Question(" Which of the following is used in pencils?",
                        List.of(" Graphite", "Silicon", "Charcoal", "Phosphorous"), 1);
                Question q5 = new Question(
                        "Track and field star Carl Lewis won how many gold medals at the 1984 Olympic games?",
                        List.of("Two", "Three", "Four", "Eight"), 3);
                Question q6 = new Question(" B. C. Roy Award is given in the field of",
                        List.of(" Music", "Journalism", "Medicine", "Environment"), 3);
                Question q7 = new Question("When is the World Population Day observed?",
                        List.of("May 31", "October 4", "December 10", "July 11"), 4);
                Question q8 = new Question(
                        "The centenary of Mahatma Gandhi's arrival in South Africa was celebrated in",
                        List.of("May 1993", "August 1993", "July 1993", "September 1993"), 1);
                Question q9 = new Question("'Dandia' is a popular dance of",
                        List.of("Punjab", "Gujarat", "Tamil Nadu", "Maharashtra"), 2);
                Question q10 = new Question("Where is the Railway Staff College located?",
                        List.of("Pune", "Allahabad", "Vadodara", "Delhi"), 3);

                // Add questions to the quiz
                quiz.add_Question(q1);
                quiz.add_Question(q2);
                quiz.add_Question(q3);
                quiz.add_Question(q4);
                quiz.add_Question(q5);
                quiz.add_Question(q6);
                quiz.add_Question(q7);
                quiz.add_Question(q8);
                quiz.add_Question(q9);
                quiz.add_Question(q10);
                break;
            }

            case 2: {
                System.out.println("*****************COMPUTER LANGUAGE QUIZ********************");
                System.out.println();
                Question q11 = new Question("Which of the following is a logical NOT operator?",
                        List.of("!", "&&", "&", "All of above"), 1);
                Question q12 = new Question("Who invented C- langauge? ",
                        List.of(" James Gausling", " Guido Van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), 3);
                Question q13 = new Question(" Find out the correct order ", List.of("char < int < double",
                        " int > char > float", "char > int > float", "double > char > int"), 3);
                Question q14 = new Question(
                        " ___is a picture in which the flows of computational paths are depicted.",
                        List.of("Algorithm", "Program", "Code", "Flowchart"), 4);
                Question q15 = new Question("If the function returns no value then it is called __",
                        List.of("Data type function", "Calling function", "Main function", "Void function"), 4);
                Question q16 = new Question("Which character is used to indicate the end of the string?",
                        List.of("Any alphabet", "A", "Null", "None of these"), 3);
                Question q17 = new Question("In the for loop structure, which statement is present?",
                        List.of("Assign statement", " Alter statement", " Both (a) and (b)", " None of these"), 3);
                Question q18 = new Question(
                        "Which can be included in a string constant using the escape sequences?",
                        List.of("Apostrophe", "Question mark", "Double quotes", "All the above"), 4);
                Question q19 = new Question(
                        "Which of the following input function cannot be used to input multiword string in a single function call?",
                        List.of("getche()", "gets()", "scanf()", "None of above"), 1);
                Question q20 = new Question("Which of the following operators has highest precedence?",
                        List.of("*", "/", "%", "All have same precedence"), 4);
                quiz.add_Question(q11);
                quiz.add_Question(q12);
                quiz.add_Question(q13);
                quiz.add_Question(q14);
                quiz.add_Question(q15);
                quiz.add_Question(q16);
                quiz.add_Question(q17);
                quiz.add_Question(q18);
                quiz.add_Question(q19);
                quiz.add_Question(q20);
                break;
            }
            case 3: {
                System.out.println("*****************SPORTS QUIZ********************");
                System.out.println();
                Question q21 = new Question("With which sport is the 'Choudhury Trophy' associated?",
                        List.of("Golf", "Circumnavigation of the earth by car", "Formula One racing", "Buggy-Jumping"),
                        2);
                Question q22 = new Question(
                        "How many gold medals did P.T.Usha win in the 1986 Seoul Asian Games?",
                        List.of("1", "2", "3", "4"), 4);
                Question q23 = new Question(
                        "Who was the 1st president of BCCI ( Board of Control for Cricket in India )?",
                        List.of(" R.E. Grant Govan", "Dr. Maharajkumar Sir Vijaya Ananda", "Sikandar Hyat Khan",
                                "Anthony S. D'Mello"),
                        1);
                Question q24 = new Question("Which county did speedster Javagal Srinath play for in 1995?",
                        List.of("Kent", "Glamorgan", "Gloucestershire", "Leicestershire"), 3);
                Question q25 = new Question("Who is the highest wicket taker in Test cricket?",
                        List.of("Shane Warne", "Brian Lara", "Courtney Walsh", " Muttiah Muralitharan"), 4);
                Question q26 = new Question("Which county signed Yuvraj Singh to play for them in 2003?",
                        List.of("Nottinghamshire", "Lancashire", "Hampshire", "Yorkshire"), 4);
                Question q27 = new Question("Who has scored the most Test hundreds ever?",
                        List.of("Steve Waugh", "Sachin Tendulkar", " Shane Warne", "Sunil Gavaskar"), 2);
                Question q28 = new Question("Who did The Rock beat to win his first WWE Title?",
                        List.of("Triple H", "Stone Cold Steve Austin", "Mankind", "Bret Hart"), 3);
                Question q29 = new Question(
                        "How many gold medals have been won by India in the Olympics so far?",
                        List.of("4", "8", "9", "10"), 4);
                Question q30 = new Question(
                        "The Indian football team made its first appearance at Olympics in...?",
                        List.of("1936", " 1948", "1952", "1956"), 2);
                quiz.add_Question(q21);
                quiz.add_Question(q22);
                quiz.add_Question(q23);
                quiz.add_Question(q24);
                quiz.add_Question(q25);
                quiz.add_Question(q26);
                quiz.add_Question(q27);
                quiz.add_Question(q28);
                quiz.add_Question(q29);
                quiz.add_Question(q30);
                break;
            }
            default: {
                System.out.println(
                        "**************SORRY!!!! YOUR REQUIREMENT IS NOT AVAILABEL IN THIS QUIZ***************");
                System.out.println();
            }
        }
        quiz.start_Quiz(); // starting the quiz
    }
}