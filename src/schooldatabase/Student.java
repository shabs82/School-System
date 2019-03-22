/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schooldatabase;

import java.util.ArrayList;

/**
 *
 * @author kulsoom-Abbas
 */
public class Student extends Person{
    private String education ;
    ArrayList<GradeInfo> GI = new ArrayList ();
    private double avgGrade;
    
    
    public Student(int id, String name, String email,String education) {
    
        super(id, name, email);
    }
    
    public double AverageGrade(){
        
        for (GradeInfo gg :  GI) {
            avgGrade = avgGrade+gg.getGrade();//need to understand the for each loop and the return till line 32.
            
        }
        avgGrade = avgGrade / GI.size();
        return avgGrade ;
       
            
   }
    
    public void addGrade(String subject,int Grade){
        GI.add(new GradeInfo (subject,Grade));
        
    }

    @Override
    public String toString() {
        
        return super.toString()+ education +"\t"+avgGrade +"\t";
    }
    
    
}
