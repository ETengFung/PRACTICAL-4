package prac4;
public class Course {
    
    private String courseTitle;
    private String[] studentNames = new String[100];
    private int noOfStudents = 0;
    private static int courseCount;
    private double feesPerStudent;
    
    public Course(String courseTitle, double feesPerStudent) {
        this.courseTitle = courseTitle;
        this.feesPerStudent = feesPerStudent;
        courseCount++;
    }
    
    public double calcFeesCollected(){
        return feesPerStudent * noOfStudents;
    }
    
    public void addStudent(String studName){
        studentNames[noOfStudents] = studName;
        noOfStudents++;
    }
    
    public String toString(){
        return String.format(" Course Title: %s\n Fees: %.2f\n No of Students: %d\n Total Fees: %.2f\n", 
                courseTitle,feesPerStudent, noOfStudents, calcFeesCollected());
    }
    
    int i = 0;
    public String getStudentNames() {
        while(i<100){
            if(studentNames[i] != null){
                return studentNames[i++];
            }
        }
        return null;
    }
}
