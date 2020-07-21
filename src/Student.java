
public class Student {

    private String studentID;
    private String name;
    private int quizNum;
    private double totalScore;
    private static double contribution;

    

    public Student() {
        studentID = "";
        name = "";
        quizNum = 0;
        totalScore = 0.00;
    }

    public Student(String ID, String NAME) {
        studentID = ID;
        name = NAME;
        quizNum = 0;
        totalScore = 0.00;
    }


    //This is acessor
    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getQuizNum() {
        return quizNum;
    }

    public double getScore() {
        return totalScore;
    }
    
    public static double getContribution() {
        return contribution;
    }

    public static void setContribution(double contribution) {
        Student.contribution = contribution;
    }

    //This is mutators
    public void setStudentID(String id) {
        this.studentID = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addQuiz(int score) {
        totalScore += score;
        quizNum += 1;
    }

    public double getAverageScore(){
        return totalScore / quizNum;

    }
}
