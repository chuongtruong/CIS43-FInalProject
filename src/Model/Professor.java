package Model;

/**
 *
 * @author chuongtruong
 */
public class Professor {
    private int employeeID;
    private String firstName;
    private String lastName;
    String password;
    
     public Professor(int employeeID, String firstName, String lastName, String password)
    {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }    
    public int getEmployeeID(){
        return this.employeeID;
    }
     
    public String getFirstName(){
        return this.firstName;
    }    
    public String getLastName(){
        return this.lastName;
    }  
    public String getPassword(){
        return this.password;
    }    
    public void setEmployeeID(int newID)
    {
        this.employeeID = newID;
    }    
    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }    
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }    
     public void setPassword(String newPassword){
        this.password = newPassword;
    }
    
}

