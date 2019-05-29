package Model;

/**
 *
 * @author chuongtruong
 */
public class Account {
    public enum accountType {STUDENT, PROFESSOR};
    private String userName;
    private String password;
    private accountType type;
    
    public Account(String userName, String password, accountType type)
    {
        this.userName = userName;
        this.password = password;
        this.type = type;
    }
    
    public String getUserName(){
        return this.userName;
    }
    
    public String getPasswod(){
        return this.password;
    }
    
    public accountType getType(){
        return this.type;
    }
    
    public void setUserName(String newUserName){
        int length = newUserName.length();
        if (length < 3 || length > 15)
            throw new IllegalArgumentException("Username must be 3 - 15 characters.");
        this.userName = newUserName;
    }
    
    public void setPassword(String newPassword){
        int length = newPassword.length();
        if (length < 3 || length > 15)
            throw new IllegalArgumentException("Password must be 3 - 15 characters.");
        this.password = newPassword;
    }
    
    public void setType(accountType newType){
        //Validate for type needed....
        
        this.type = newType;
    }
    
}

