package Model;

/**
 *
 * @author chuongtruong
 */
public class Student {
    private int studentID = 00000;
    private String firstName= "";
    private String lastName = "";
    private double quiz = 0.0;
    private double midterm = 0.0;
    private double finalProject = 0.0;
    private double average = 0.0;
    
    public Student(int studentID, String firstName, String lastName, double quiz, double midterm, double finalProject, double average)
    {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.quiz = quiz;
        this.midterm = midterm;
        this.finalProject = finalProject;
        this.average = average;
    }
    
    
    // Getters
    public int getStudentID(){
        return this.studentID;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }

    public double getQuiz(){
        return this.quiz;
    }
    
    public double getMidterm(){
        return this.midterm;
    }
    
    public double getFinalProject(){
        return this.finalProject;
    }
    
    public double getAverage(){
        return this.average;
    }

    
// Setters
    
    public void setStudentID(int newID)
    {
        this.studentID = newID;
    }

    public void setFirstName(String newFirstName){
        int length = newFirstName.length();
        if (length < 3 || length > 15)
            throw new IllegalArgumentException("Name must be 3 - 15 characters.");
        this.firstName = newFirstName;
    }
    
    public void setLastName(String newLastName){
        int length = newLastName.length();
        if (length < 3 || length > 15)
            throw new IllegalArgumentException("Name must be 3 - 15 characters.");
        this.lastName = newLastName;
    }

    public void setQuiz(double quiz){
        if(quiz < 0 || quiz > 100) 
        {throw new IllegalArgumentException("Grade must be greater than 0.0 and lesser than 4.0");}
        else
        this.quiz = quiz;
    }
    
    public void setMidterm(double midterm){
        if(midterm < 0 || midterm > 100) 
            throw new IllegalArgumentException("Grade must be greater than 0.0 and lesser than 4.0");
        this.midterm = midterm;
    }
    
    public void setFinalProject(double finalProject){
        if(finalProject < 0 || finalProject > 100) 
            throw new IllegalArgumentException("Grade must be greater than 0.0 and lesser than 4.0");
        this.finalProject = finalProject;
    }
    
    public void setAverage(double newAverage){
        this.average = newAverage;
    }
    
//    //Methods
    public static double calculateAverage(double quiz,double midterm,double finalProject)
    {
        return ((quiz * 0.25) + (midterm * 0.35) + (finalProject * 0.4));
    }   
}


