package prac4;
public class Course {
    
    private String courseTitle;
    private String[] studentNames = new String[100];
    private int noOfStudents = 0;
    private static int courseCount = 0;
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

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public double getFeesPerStudent() {
        return feesPerStudent;
    }

    public void setFeesPerStudent(double feesPerStudent) {
        this.feesPerStudent = feesPerStudent;
    }
    
    
}
