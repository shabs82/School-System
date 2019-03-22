/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schooldatabase;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author kulsoom-Abbas
 */
public class Teacher extends Person {
    private String initials;
    private double salary;
    private List<String> subjects = new LinkedList<String>();
    

    public Teacher(int id, String name,String email,String initials, double salary) {
        super(id ,name,email);
        this.initials = initials;
        this.salary = salary;
        this.subjects = subjects;
        
    }
    
   

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    
    
    public void addSubject(String Subject){
        System.out.println(Subject);
      subjects.add(Subject) ; 
    }
    
    
    
    
    
    @Override
    public String toString(){
        return 
         super.toString()+ initials +"\t"+subjects +"\t";
                                                    
   }
    
}
