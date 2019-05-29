package View;

import Model.Professor;
import Model.Student;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author chuongtruong
 */
public class ThirdScreenProfessorA extends javax.swing.JFrame {

    /**
     * Creates new form ProfessorThirdScreenA
     */

    HashMap<Integer, Student> s = new HashMap();
    HashMap<Integer, Professor> p = new HashMap();
    Professor professor;
    Student student;

    public ThirdScreenProfessorA(HashMap<Integer, Student> s, HashMap<Integer, Professor> p, Professor professor) {
        this.s = s;
        this.p = p;
        this.professor = professor;
        System.out.println("Student hash from 3rd screen pro a" + s);
        System.out.println("professor hash from 3rd screen pro a" + p);
        
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentIDtext2 = new javax.swing.JTextField();
        studentIDtext4 = new javax.swing.JTextField();
        StudentIDLabel = new javax.swing.JLabel();
        studentIDText = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        quizLabel = new javax.swing.JLabel();
        finalProjectLabel = new javax.swing.JLabel();
        midtermLabel = new javax.swing.JLabel();
        quizText = new javax.swing.JTextField();
        midtermText = new javax.swing.JTextField();
        finalText = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        calculateButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        studentIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIDTextActionPerformed(evt);
            }
        });

        quizLabel.setText("Quiz");

        finalProjectLabel.setText("Final Project");

        midtermLabel.setText("Midterm");

        quizText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizTextActionPerformed(evt);
            }
        });

        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quizLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studentIDText)
                            .addComponent(StudentIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quizText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstNameText)
                            .addComponent(midtermLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(midtermText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastNameText)
                            .addComponent(lastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(finalProjectLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(finalText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StudentIDLabel)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quizLabel)
                    .addComponent(finalProjectLabel)
                    .addComponent(midtermLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quizText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(midtermText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(calculateButton)
                    .addComponent(okButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quizTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quizTextActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new SecondScreenProfessor(s, p, professor).setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        int studentID = Integer.parseInt(studentIDText.getText());
        String firstName = firstNameText.getText();
        String lastName = lastNameText.getText();
        double quiz = Double.parseDouble(quizText.getText());
        double midterm = Double.parseDouble(midtermText.getText());
        double finalProject = Double.parseDouble(finalText.getText());
//        double gpa = student.calculateTotalGPA(1.0, 2.0, 3.0);

        System.out.println("studentIDText.getText() is " + studentID);
        System.out.println("firstName" + firstName);
        System.out.println("lastName" + lastName);
        System.out.println("quiz"+quiz);
        System.out.println("midterm" +midterm);
        System.out.println("finalProject"+finalProject);
//         System.out.println("gpa" + gpa);

        
        if (s.containsKey(studentID)) {
            JOptionPane.showMessageDialog(null, "Student ID exists ! Please enter different student ID");
            studentIDText.setText("");
        } 
        else 
        {
             s.put(studentID, new Student(studentID, firstName, lastName, quiz, midterm, finalProject, Student.calculateAverage(quiz, midterm, finalProject)));
            this.dispose();
            new ThirdScreenProfessorB(s, p, professor).setVisible(true);

        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void studentIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIDTextActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_studentIDTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StudentIDLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton calculateButton;
    private javax.swing.JLabel finalProjectLabel;
    private javax.swing.JTextField finalText;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JLabel midtermLabel;
    private javax.swing.JTextField midtermText;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel quizLabel;
    private javax.swing.JTextField quizText;
    private javax.swing.JTextField studentIDText;
    private javax.swing.JTextField studentIDtext2;
    private javax.swing.JTextField studentIDtext4;
    // End of variables declaration//GEN-END:variables
}
