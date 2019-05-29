package Controller;

import Model.Professor;
import View.FirstScreen;
import Model.Student;
import java.util.HashMap;

/**
 *
 * @author chuongtruong
 */
public class Main {

    public static void main(String[] args)
    {

        HashMap<Integer, Student> students = new HashMap<>();
        students.put(1, new Student(1, "Chuong", "Truong", 90, 87, 94, Student.calculateAverage(90, 87, 94)));
        students.put(2, new Student(2, "Vi", "Nguyen", 81, 89, 60, Student.calculateAverage(81, 89, 60)));
        
        HashMap<Integer, Professor> professors = new HashMap<>();
        
        professors.put(123, new Professor(123, "Jane", "Smith", "Jane"));
        //professor.put()

        if (students.containsKey(1)) {
            System.out.println("Key exist");
        } 
        else
        {
            System.out.println("not exist");
        }
        FirstScreen firstScreen = new FirstScreen(students,professors);
        firstScreen.setVisible(true);
        
    }
}

